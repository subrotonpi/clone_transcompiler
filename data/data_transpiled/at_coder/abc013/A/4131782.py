def import _readline
import readline
import sys
import readline
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        self.debug = False
        self.fname = 'input.txt'
        global sc
        self.MOD = 1000000007
        def solve ( ) :
            X = sc.next ( ) [ 0 ]
            print ( ord ( X ) - ord ( 'A' ) + 1 )
        def next ( ) :
            return float ( next ( ) )
    def main ( ) :
        S = time.time ( )
        sc = ( sys.stdin if sys.stdin is None else sys.stdin )
        solve ( )
        G = time.time ( )
        if sys.stdout.isatty ( ) :
            print ( '---Debug---' )
            print ( '%7d ms' % ( G - S ) )
    class Pair ( object ) :
        def __init__ ( self , t , l ) :
            self.to = t
            self.len = l
    class FastScanner ( object ) :
        def __init__ ( self , f ) :
            self.f = f
        def read ( self ) :
            self.data = f
            self.ptr = 0
            self.buflen = 0
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = self.f.read ( self.buflen )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def readByte ( self ) :
            if self.ptr < self.buflen :
                return self.data [ self.ptr ]
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def __iter__ ( self ) :
            while self.ptr < self.ptr :
                yield self.data [ self.ptr ]
