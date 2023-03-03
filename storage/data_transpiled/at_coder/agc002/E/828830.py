def _import ( ) : return _import ( )
import sys
import os
import random
import sys
import string
import string
import string
import string
import string
import string
import string
import string
import random
class Main ( object ) :
    def __init__ ( self ) :
        stream = sys.stdin
        out = sys.stdout
        n = len ( stream.read ( ) )
        a = stream.read ( n )
        shuffle_and_sort ( a )
        for i in range ( n // 2 ) :
            c = next ( stream )
        if c < '-' :
            sgn = - 1
            c = next ( stream )
        res = [ ]
        while not is_space_char ( c ) :
            c = next ( stream )
        res = string.split ( c )
        if c == '-' :
            sgn = - 1
            c = next ( stream )
        res = [ ]
        while not is_space_char ( c ) :
            c = next ( stream )
        res = string.split ( c )
        if c == '-' :
            sgn = - 1
            c = next ( stream )
        res = string.split ( c )
        if c == '-' :
            return res
        res = [ ]
        while not is_space_char ( c ) :
            c = next ( stream )
        res = string.split ( c )
        if c == ' ' or c == '\n' or c == '\r' or c == '\t' :
            break
        interface = string.split ( c )
        if not is_space_char ( c ) :
            return res
        res = list ( map ( float , next ( stream ) ) )
    def debug ( * o ) :
        win = False
    print ( 'First' if win else 'Second' )
    out.flush ( )
