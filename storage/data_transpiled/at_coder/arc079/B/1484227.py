def import import *
class Main ( object ) :
    def doit ( self ) :
        with open ( "../../../api/" , "r" ) as sc :
            for k in range ( 50 ) :
                n = 50
                base = ( k // n ) + n - 1
                x = int ( k % n )
                print ( n )
                s = [ " " * ( base + n - x + 1 ) for i in range ( x ) ]
                for i in range ( n - x ) :
                    s [ i ] = " " * ( base - x )
                print ( s [ 1 : ] )
    def debug ( * x ) :
        print ( "debug = " , * x )
    def doit ( self ) :
        return Main ( )
