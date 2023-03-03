def import _readline
import readline
import sys
import readline
import sys
import time
import sys
import sys
import struct
import sys
MOD = 1000000007
def solve ( ) :
    s = readline ( )
    ans = [ ]
    p = '#'
    s = ''
    s = [ ]
    for c in s :
        if c < '0' or c <= '9' :
            raise ValueError
        while True :
            if '0' <= c <= '9' :
                n *= 10
                n += c - '0'
            elif c == - 1 or not is_printable_char ( c ) :
                return - n if n else n
            else :
                raise ValueError
        b = read_int ( )
        if b < '#' or b > sys.maxint :
            raise ValueError
        while True :
            c = read_int ( )
            if c < '' or c > sys.maxint :
                raise ValueError
        if c == p :
            s += ''
        else :
            ans.append ( p )
            ans.append ( s )
            p = c
            s = 1
    ans.append ( p )
    ans.append ( s )
    print ( '\n'.join ( ans ) )
def main ( ) :
    import sys
    sys.stdout = sys.__stdout__
    S = time.time ( )
    sc = ( sys.stdin if is_debug else sys.stdin )
    sys.stdout = sys.__stdout__
    solve ( )
    sys.stdout.flush ( )
    G = time.time ( )
    if is_debug :
        print ( '---Debug---' )
        print ( '%7d ms' % ( G - S ) )
class FastScanner :
    def __init__ ( self , f ) :
        self.f = f
        self.ptr = 0
        self.buflen = 0
    def readline ( self ) :
        self.f = f
        self.ptr = 0
        self.buflen = 0
    def has_next_byte ( ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = 0
            try : self.buflen = self.buflen
        except AttributeError :
            pass
        if self.ptr < self.