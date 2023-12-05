def import _readline
import readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.debug = False
        self.fname = 'input.txt'
        if self.fname.endswith ( '.txt' ) :
            self.fname = '.txt'
        else :
            self.MOD = 1000000007
        def solve ( self ) :
            bf = [ True , False , True , False , False , True , False , True , False ]
            n = self.read ( 1 )
            sum = 0
            for i in range ( n ) :
                a = self.read ( 1 ) - 1
                while a not in bf :
                    a -= 1
                    sum += 1
            print ( sum )
    def readline ( self ) :
        return sys.stdin.readline ( )
    def m ( self ) :
        S = time.time ( )
        self.sc = ( sys.stdin.fileno ( ) if self.fname.endswith ( '.txt' ) else sys.stdin.readline )
        solve ( self )
        G = time.time ( )
        if self.debug :
            print ( '---Debug---' )
            print ( '%7d ms' % ( G - S ) )
    class FastScanner ( object ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.ptr = 0
            self.buflen = 0
        def readline ( self ) :
            self.stdin.readline ( )
            if not self.hasNext :
                raise StopIteration
        def readline ( self ) :
            if self.ptr < self.buflen :
                return self.ptr
            else :
                self.ptr = 0
                try :
                    self.buflen = self.stream.read ( self.buflen )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def readline ( self ) :
            if not self.hasNext :
                raise StopIteration
            self.buf = [ ]
            b = self.read ( 1 )
            while self.ptr < b :
                b = self.read ( 1 )
            return b
    return m
