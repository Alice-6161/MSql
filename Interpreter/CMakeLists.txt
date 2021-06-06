# -*- mode:cmake -*-
if(NOT UNIX)
    message(WARNING "Unsupported operating system")
endif()

cmake_minimum_required(VERSION 3.16)
project(MSql)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

add_subdirectory(generated)

# add the executable 
add_executable(MSql main.cpp)

# links the object file to the library file
target_link_libraries(
    MSql PUBLIC
    generated
)

target_include_directories(
    MSql PUBLIC
    generated
)
