def _import ( ) : return _import ( )
import sys
import os
import sys
class Main ( ) :
    def __init__ ( self ) :
        self.debug = False
        self.fname = 'input.txt'
        self.sc = FastScanner ( )
        self.MOD = 1000000007
        def solve ( ) :
            N = self.sc.randint ( 0 , 1 )
            h , m , s = self.randint ( 0 , ( N - h * 3600 ) // 60 , self.maxsize )
            self.print ( "%02d:%02d:%02d" % ( h , m , s ) )
    def main ( ) :
        S = time.time ( )
        self.sc = ( sys.stdin.fileno ( ) if sys.stdin.isatty ( ) else sys.stdin )
        self.solve ( )
        G = time.time ( )
        if sys.stdout.isatty ( ) :
            print ( "---Debug---" )
            print ( "%7d ms" % ( G - S ) )
    class FastScanner ( object ) :
        def __init__ ( self , f ) :
            self.f = f
        def read ( self ) :
            self.f.seek ( 0 )
            self.ptr = 0
            self.buflen = 0
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    self.buflen = self.f.read ( self.buflen )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def readByte ( self ) :
            if self.ptr < self.buflen :
                return self.ptr
            else :
                return - 1
        def isPrintableChar ( c ) :
            return 33 <= c <= 126
        def __iter__ ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            yield self.next ( )
