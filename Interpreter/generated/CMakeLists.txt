cmake_minimum_required(VERSION 3.16)
project(generated)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

if ("${CMAKE_BUILD_TYPE}" STREQUAL "")
    set(CMAKE_BUILD_TYPE RELEASE)
else()
    string(TOUPPER ${CMAKE_BUILD_TYPE} CMAKE_BUILD_TYPE)
endif()
message(STATUS "Building GENERATED in ${CMAKE_BUILD_TYPE} mode")

set(GENERATED generated CACHE INTERNAL "")
set(GENERATED_SRC
    MSqlParserBaseListener.cpp
    MSqlParserBaseListener.h
    MSqlParserListener.cpp
    MSqlParserListener.h
    MSqlParser.cpp
    MSqlParser.h
    MSqlLexer.cpp
    MSqlLexer.h
)

add_subdirectory(antlr4_cpp_runtime)
add_library(${GENERATED} ${GENERATED_SRC})

target_link_libraries(
    ${GENERATED} PUBLIC
    antlr4_cpp_runtime
)

target_include_directories(
    ${GENERATED} PUBLIC
    ${CMAKE_CURRENT_SOURCE_DIR}
    antlr4_cpp_runtime
)
