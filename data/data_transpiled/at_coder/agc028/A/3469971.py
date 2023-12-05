def import import _main
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.n = sc.n
        self.m = sc.m
        s = sc.s [ 0 ]
        t = sc.t [ 0 ]
        sc.s = s
        self.t = t
        print ( self.n < self.m )
    def check ( min , max , s , t ) :
        g = gcm ( max , min )
        minp = min // g
        maxp = max // g
        for i in range ( g ) :
            if s [ i * minp ] != t [ i * maxp ] :
                return - 1
        return ( long ( min ) * maxp )
    def gcm ( a , b ) :
        return b , a
    def main ( self ) :
        with open ( "/" ) as sc :
            return Main ( sc )
