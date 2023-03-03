def _import ( ) : return sys.stdin.read ( )
import readline
import time
import sys
import os
import sys
import os
import sys
import time
import sys
MOD = 1000000007
def solve ( ) :
    S = readline ( )
    print ( S.upper ( ) + S [ 1 : ].lower ( ) )
def main ( ) :
    S = time.time ( )
    sc = ( sys.stdin.readline ( ) if sys.stdin.isatty ( ) else sys.stdin.readline ( ) )
    solve ( )
    G = time.time ( )
    if sys.stdout.isatty ( ) :
        print ( '---Debug--' )
        print ( '%7d ms' % ( G - S ) )
class FastScanner ( object ) :
    def __init__ ( self , f ) :
        self.f = f
        self.buffer = f
        self.ptr = 0
        self.buflen = 0
    def readline ( self ) :
        self.buffer = buffer
        self.ptr = 0
        self.buflen = 0
    def has_next_byte ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = 0
            try :
                buflen = self.buffer.read ( self.buflen )
            except AttributeError :
                pass
            if self.buflen <= 0 :
                return False
        return True
    def is_printable_char ( c ) :
        return 33 <= c <= 126
    def __iter__ ( self ) :
        while self.ptr < self.buflen :
            self.ptr += 1
        return self.ptr
    def next ( self ) :
        if not self.ptr :
            raise StopIteration
        s = [ ]
        b = self.readByte ( )
        while is_printable_char ( b ) :
            s.append ( b )
            b = self.readByte ( )
        return s
    def read ( self ) :
        if self.ptr < self.buflen :
            return - 1
        return None
