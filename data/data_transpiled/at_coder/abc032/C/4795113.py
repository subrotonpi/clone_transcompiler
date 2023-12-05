def main ( ) :
    class Main ( ) :
        def __init__ ( self ) :
            self._win = sys.stdin
            self.n , self.k , self.r , self.i , self.l = self._win.read ( ).split ( ' ' )
            s , a , t = [ ] , 0 , 1
            while i < n :
                if ( s [ i ] == 0 ) :
                    print ( self.n )
                    return
                for l in range ( self.n ) :
                    while r < self.n and t * s [ r ] <= self.k :
                        t *= s [ r ]
                        a = max ( a , r - 1 , l + 1 )
                    if r == self.l :
                        r += 1
                    else :
                        t /= s [ l ]
                print ( a )
