def _import ( ) : return sys.stdin.read ( )
import time
class B_as_large ( object ) :
    class DSU ( object ) :
        def __init__ ( self , n ) :
            self.p = [ ]
            r = [ ]
            for i in range ( n ) :
                self.p.append ( i )
        def get ( self , x ) :
            if self.p [ x ] != x :
                self.p [ x ] = self.get ( self.p [ x ] )
        def union ( self , x , y ) :
            x = self.get ( x )
            y = self.get ( y )
            if x == y :
                return
            if self.r [ x ] == self.r [ y ] :
                self.r [ x ] += 1
            if self.r [ x ] > self.r [ y ] :
                self.p [ y ] = x
            else :
                self.p [ x ] = y
        def cnt ( self ) :
            r = 0
            for i in self.p :
                if i == self.i :
                    r += 1
            return r
    def gcd ( self , x , y ) :
        while y != 0 :
            t = x % y
            x , y = y , t
        return x
    def solve ( self ) :
        with open ( "B-large.in" , "r" ) as infile :
            with open ( "B-large.out" , "w" ) as outfile :
                tn = int ( infile.read ( ) )
        n = 1000001
        primes = [ ]
        pn = 0
        for i in range ( 2 , n + 1 ) :
            isp = True
            for j in range ( pn ) :
                if i % self.primes [ j ] == 0 :
                    isp = False
                    break
            if isp :
                primes.append ( i )
        for test in range ( tn ) :
            a , b = divmod ( a , b )
            p = [ ]
            lp = - 1
            rp = pn
            while lp < rp - 1 :
                p.append ( p [ i ] )
