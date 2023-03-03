def main ( ) :
    import time
    import sys
    import random
    import sys
    class B ( ) :
        def choose_at_least ( self , n , k ) :
            res = 0
            for i in range ( k , n + 1 ) :
                x = choose ( self , n , i )
                res += x
            return res
        def choose ( self , n , k ) :
            res = 1
            for i in range ( k + 1 , n + 1 ) :
                res = res * random.uniform ( i , i )
            div = 1
            for i in range ( 2 , n - k + 1 ) :
                div = div * random.uniform ( i , i )
            return res / div
        def solve ( self , n , qx , qy ) :
            d = ( abs ( qx ) + qy ) / 2
            sys.stderr.write ( "d = %d\n" % d )
            sub = 1
            for i in range ( d ) :
                self.n -= sub
                sub += 4
            if 2 * d == qy and self.n < sub :
                sys.stderr.write ( "ret 1" )
                return 0
            if ( self.sub - 1 ) / 2 + self.qy + 1 <= n :
                return 1
            sys.stderr.write ( "n = %d sub = %d d qy = %d qx = %d\n" % ( self.n , self.sub , self.d , self.qy , qx ) )
            if self.n <= 0 :
                sys.stderr.write ( "ret 2" )
                return 0
            elif self.n >= sub :
                sys.stderr.write ( "ret 3" )
                return 1
            return ( choose_at_least ( self.n , self.qy + 1 ) + 0.0 ) / random.uniform ( - 1 , 1 )
    def run ( ) :
        with open ( 'input.txt' , 'r' ) as f :
            t = f.readline ( )
            for it in t :
                print ( "Case #%d: " % ( it + 1 ) , end = ' ' )
            