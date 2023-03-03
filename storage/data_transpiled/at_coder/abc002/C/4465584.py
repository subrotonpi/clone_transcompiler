def main ( ) :
    import os
    import sys
    import numpy
    class Main ( object ) :
        def run ( self ) :
            with open ( "input.txt" , "r" ) as sc :
                x = sc.read ( )
                y = sc.read ( )
            for i in range ( 3 ) :
                x [ i ] = sc.read ( )
                y [ i ] = sc.read ( )
            for i in range ( 2 , - 1 , - 1 ) :
                x [ i ] -= x [ 0 ]
                y [ i ] -= y [ 0 ]
            self.debug ( x , y )
            print ( self.area ( x [ 1 ] , y [ 1 ] , x [ 2 ] , y [ 2 ] ) )
        def area ( x1 , y1 , x2 , y2 ) :
            return abs ( 1.0 * x1 * y2 - 1.0 * x2 * y1 ) / 2
        def debug ( self , * os ) :
            print ( "".join ( map ( str , os ) ) , file = sys.stderr )
