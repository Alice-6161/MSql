/*
 * MSql: config.hpp 
 * 
 * This file defines some basic config parameters
 * 
 */ 

#ifndef __CONFIG_H_
#define __CONFIG_H_

#include <cstddef> 
using namespace std;

/* Define some constant variable for buffer */
static const size_t block_size = 4096;
static const size_t block_numb = 1024;
static const size_t buffer_size = block_size * block_numb;
static const size_t file_size = 100003;

#endif