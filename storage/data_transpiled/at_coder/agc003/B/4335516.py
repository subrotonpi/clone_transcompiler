def import readline
import readline
import readline
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        self.debug = False
        self.fname = 'input.txt'
        if self.fname == 'input.txt' :
            self.fname = 'input.txt'
        else :
            self.fname = 'input.txt'
        self.MOD = int ( 1e9 ) + 7
        self.INF = sys.maxsize // 2
        def solve ( ) :
            N = self.N
            A = [ ]
            for i in range ( N ) :
                A.append ( self.N - i )
        def next ( ) :
            nl = next ( )
            if nl < int ( n ) or nl > sys.maxsize :
                raise ValueError
            return int ( nl )
        def eval ( self ) :
            return float ( next ( ) )
    def main ( ) :
        self.m = readline
    def m ( ) :
        S = time.time ( )
        self.sc = ( readline , self.fname ) if self.debug else readline
        solve ( )
        G = time.time ( )
        if self.debug :
            print ( '---Debug---' )
            print ( "%8d ms" % ( G - S ) )
    class FastScanner ( readline ) :
        def __init__ ( self ) :
            self.sock = readline
            self.data = b''
            self.ptr = 0
            self.buflen = 0
            def readline ( self ) :
                self.sock.close ( )
                while self.ptr < self.buflen :
                    self.ptr += 1
            def write ( self , data ) :
                if not self.hasNext ( ) :
                    raise StopIteration
                yield self.buf [ self.ptr ]
                self.pos = self.buflen
        def readline ( self ) :
            if self.ptr < self.buflen :
                raise StopIteration
            return self.buf [ self.ptr ]
    def readline ( self ) :
        while self.ptr < self.buflen and not self.hasNext ( ) :
            self.ptr += 1
