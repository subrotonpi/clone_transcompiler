def _import ( ) : return sys.stdin.read ( )
import termios
import sys
import struct
import struct
import sys
def skip_while_space ( ) :
    c = next ( sys.stdin )
    while isspace ( c ) :
        c = next ( sys.stdin )
    return c == ' ' or c == '\n' or c == '\r' or c == '\t'
def skip_while_space ( ) :
    while isspace ( ) :
        c = next ( sys.stdin )
    return c
def is_space ( ) :
    return c == ' ' or c == '\n' or c == '\t' or c == - 1
