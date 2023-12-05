def import _readline
import readline
import sys
import readline
import sys
import readline
import readline
import readline
import sys
import readline
import sys
import time
MOD = 1000000007
def solve ( ) :
    N = readline ( )
    if b == '-' :
        minus = True
        b = readline ( )
    if b < '0' or b <= '9' :
        raise ValueError ( )
    while True :
        if '0' <= b <= '9' :
            n *= 10
            n += b - '0'
        elif b == - 1 or not is_printable_char ( b ) :
            return - n
        else :
            raise ValueError ( )
    def readline ( ) :
        nl = readline ( )
        if nl < sys.maxint or nl > sys.maxint :
            raise ValueError ( )
        return int ( nl )
    def readline ( ) :
        return readline ( )
    def readline ( ) :
        S = time.time ( )
        sc = ( readline , sys.stdin.fileno ( ) )
        solve ( )
        G = time.time ( )
        if is_debug :
            print ( '---Debug---' )
            print ( '%7d ms' % ( G - S ) )
    class FastScanner :
        def __init__ ( self , stdin = None ) :
            self.stdin = stdin
            self.ptr = 0
            self.buflen = 0
        def readline ( self ) :
            self.stdin = stdin
            self.buflen = 0
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    self.buflen = len ( self.stdin.read ( self.buflen ) )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def readline ( self ) :
            if self.ptr < self.buflen :
                raise StopIteration ( )
            return self.ptr
        def readline ( self ) :
            while self.ptr < self.buflen and not is_printable_char ( self.stdin.read ( self.buflen ) ) :
                self.ptr += 1
            return readline ( self )
    