def _import ( ) : return next ( )
import sys
import termios
import sys
import struct
import termios
import sys
def _readline ( ) :
    c = termios.tcgetattr ( sys.stdin )
    if isspace ( ) :
        c = next ( )
    else :
        c = 0
    def _readline ( ) :
        return c == '' or c == '\n' or c == '\t' or c == - 1
    def _readline ( ) :
        while isspace ( ) :
            c = next ( )
        return c
    def _readline ( ) :
        return c == '' or c == '\r' or c == - 1
    n = _readline ( )
    a = [ _readline ( ) for _ in range ( n ) ]
    a.sort ( )
    cost = 0
    for i in range ( n ) :
        j = i
        while j < n and a [ i ] == a [ j ] :
            j += 1
        c = j - i
        if c < a [ i ] :
            cost += c
        elif c > a [ i ] :
            cost += c - a [ i ]
        i = j
    _readline ( )
def debug ( * o ) :
    sys.stderr.write ( "".join ( str ( o ) + "\n" ) )
class _readline :
    _BUFFER_LENGTH = 1 << 12
    def __init__ ( self , stream = sys.stdin ) :
        self.stream = stream
        self.buf = ''
        self.pos = 0
        self.num_chars = 0
        while True :
            if self.pos < len ( self.buf ) or self.buf [ - 1 ] > len ( self.buf ) :
                raise InputError ( )
            if self.pos >= len ( self.buf ) :
                self.pos = self.buf [ - 1 ]
    def next_char ( ) :
        c = _readline ( )
        res = [ ]
        while True :
            res.append ( next ( ) )
            c = next ( )
        return res
    def _readline ( ) :
        c = _readline ( )
        sgn = 1
        return sgn
