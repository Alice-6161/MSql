/*
 * MSql: buffer/buffer.hpp 
 * 
 * This file declare class BufferManager and other related classes
 * 
 */

#ifndef _BUFFER_H_
#define _BUFFER_H_

#include <list>
#include <string>
#include <cstring>
#include "../config.hpp"

using namespace std;

/* All the typedef */
typedef int file_t;                 // typedef for file class
typedef list<FileTable*> filelist;
typedef filelist::iterator fiter;
typedef int block_t;                // typedef for block class
typedef list<Block*> blocklist;
typedef blocklist::iterator biter;

/* Define the block class storing the block information */
class Block {
private:
    bool locked;                    // 0->unlocked, 1->locked
    block_t block_index;            // the index of the block
    block_t block_dirty_bit;        // 0->false, 1->true, it is a dirty block which needs to be write back
    block_t char_amount;            // the total number of byte in the block
    block_t use_times;              // the use times of the block
    FileTable* block_file;          // the file that this block belongs to
public:
    char* data;                     // the char array to store the data

    Block();
    Block( block_t _index, char* _data, block_t _dirty=0, block_t _num=0, block_t _times=0, bool _lock=false );
    ~Block();

    void pin();
    void unpin();
    void write();
    char* read();
};

/* Define the file class storing the file information */
class FileTable {
private:
    string file_name;               // the name of the file
    file_t file_type;               // 0->data file, 1->index file
    file_t record_length;           // the length of each record in the file
    file_t record_amount;           // the total number of records in the file
    // // file_t free_block_num;          // the number of free blocks in the file
public:
    blocklist blockList;            // the list that stores all the pointers of used by this file, initially empty

    FileTable() {}
    FileTable( string _name, file_t _type, file_t _len, file_t _amount=0 );
    ~FileTable();
};

class BufferManager {
private:
    int total_file;                 // store the total number of files
    int total_block;                // store the total number of blocks that have been used
    filelist fileList;              // the list that stores all the file pointers, initially empty
    Block block_pool[block_numb];   // the pool of all blocks, including both used and unused blocks
public:
    BufferManager();
    ~BufferManager();

    /**
     * @function: find a file in the file list, if not find, add it to the list
     * @return: filelist::iterator
     **/
    fiter getFile( string name, file_t type );

    /**
     * @function: find a block in the file's block list, if not find, add it to the list
     * @return: blocklist::iterator
     **/
    biter getBlock( const fiter file, block_t index );

    /**
     * @function: combination of getFile() and getBlock()
     * @return: blocklist::iterator
     **/
    biter getFileBlock( string name, file_t type, block_t index );
    
    // // /**
    // //  * @function: remove a specific block in one specidied file
    // //  * @return: blocklist::interator(the previous block)
    // //  **/
    // // biter removeBlock( const fiter file, block_t index );
    
    /**
     * @function: find a available block in the pool, if all the blocks have been used, apply 
     * @return: blocklist::interator
     **/
    Block* findAvailableBlock();

    /**
     * @function: replace a block in a specified file
     **/
    void replace( const fiter file, biter block );

    /**
     * @function: write back the block's data into disk
     **/
    void writeBack( biter block );

    /**
     * @function: close a file, destroy all the blocks in that file(write back at the same time)
     **/
    void closeFile( fiter file );

    /**
     * @function: close all files
     **/
    void close();
};

#endif
