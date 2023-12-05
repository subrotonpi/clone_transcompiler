def import readline
import readline
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        self.debug = False
        self.fname = 'input.txt'
    def readline ( self ) :
        self.MOD = int ( 1e9 ) + 7
        self.INF = sys.maxsize / 2
    def solve ( ) :
        n = readline ( )
        sum = [ 0 ] * 1000002
        for i in range ( n ) :
            a , b = readline ( )
            sum [ a ] += 1
            sum [ b + 1 ] -= 1
        s = 0
        max = 0
        for i in range ( 0 , 1000000 ) :
            s += sum [ i ]
            max = max ( max , s )
        print ( max )
    def main ( ) :
        with open ( self.fname , 'rb' ) as f :
            s = f.read ( )
    def solve ( ) :
        S = time.time ( )
        sc = ( readline , '' ) if self.debug else readline
        solve ( )
        G = time.time ( )
        if self.debug :
            print ( '---Debug---' )
            print ( '%8d ms' % ( G - S ) )
    class FastScanner ( readline ) :
        def __init__ ( self ) :
            self.stdin = f
            self.data = ''
            self.ptr = 0
            self.buflen = 0
        def readline ( self ) :
            self.stdin.seek ( 0 )
            while self.has_eof ( ) :
                if self.ptr < self.buflen :
                    return self.data [ self.ptr ]
                else :
                    self.ptr = 0
                    try :
                        self.buflen = len ( self.data )
                    except TypeError :
                        pass
                    if self.buflen <= 0 :
                        return False
                return True
        def readline ( self ) :
            if self.ptr < self.buflen :
                raise StopIteration
            yield self.ptr
    def readline ( self ) :
        while self.ptr < self.buflen and not self.is_eof ( ) :
            ptr += self.ptr
