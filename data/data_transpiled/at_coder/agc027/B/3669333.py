def import math
class Main ( object ) :
    def __init__ ( self , x ) :
        self.x = x
        self.n = int ( self.n )
    def __call__ ( self , x ) :
        self.n = int ( self.n )
        self.x = int ( self.x )
        a = [ ]
        for i in range ( self.n ) :
            a.append ( x )
        psum = [ ]
        sum = 0
        for i in range ( self.n ) :
            sum += a [ i ]
            psum.append ( sum )
        res = float ( 0 )
        label = 0
        for i in range ( 1 , self.n ) :
            t = i * x
            for j in range ( self.n ) :
                pres = psum [ self.n - 1 - i * j ] - ( ( self.n - 1 - i * j - i ) < 0 )
                coef = ( 5 if j == 0 else 2 * j + 3 )
                if 63 <= ( math.log ( pres ) + math.log ( coef ) ) / math.log ( 2 ) :
                    continue
                if ( float ( t ) - coef * pres ) < float ( 0 ) :
                    continue
                t += coef * pres
            res = min ( res , t )
        res += n * x
        self.pl ( res )
    def pl ( x ) :
        print ( x )
