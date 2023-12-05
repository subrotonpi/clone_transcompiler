def import import math
class Main ( object ) :
    def __init__ ( self ) :
        self.INF = 10000
    def __init__ ( self , d , g , p , c , used ) :
        if self.memo [ g ] [ used ] :
            return self.memo [ g ] [ used ]
        res = self.INF
        for i in range ( d ) :
            bit = int ( math.pow ( 2 , i ) )
            if ( used / bit ) % 2 == 1 :
                continue
            if ( i + 1 ) * ( p [ i ] - 1 ) >= g :
                res = min ( res , int ( math.ceil ( 1.0 * g / ( i + 1 ) ) ) )
            elif ( i + 1 ) * p [ i ] + c [ i ] >= g :
                res = min ( res , p [ i ] )
            else :
                res = min ( res , p [ i ] + solve ( d , g - ( ( i + 1 ) * p [ i ] + c [ i ] ) , p , c , used + bit ) )
        self.memo [ g ] [ used ] = res
        return res
    def main ( self ) :
        with open ( "/proc/" , "r" ) as f :
            d = f.read ( )
            g = f.read ( ) / 100
            p = [ ]
            c = [ ]
            for i in range ( d ) :
                p.append ( f.read ( ) )
                c.append ( f.read ( ) / 100 )
            self.memo = [ 0 ] * 105501
            print ( solve ( d , g , p , c , 0 ) )
