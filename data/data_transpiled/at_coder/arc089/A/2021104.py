def import _main
import sys
import math
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = sys.stdin.read ( )
        data = [ ( 0 , 0 , 0 ) for i in range ( N ) ]
        tmp = data [ 0 ]
        for i in range ( N ) :
            if not tmp.is_side ( i ) :
                print ( "No" )
                return
        print ( "Yes" )
    class Pos :
        def __init__ ( self , t , x , y ) :
            self.t = t
            self.x = x
            self.y = y
        def is_side ( self , o ) :
            time = o.t - self.t
            x_axis = math.fabs ( self.x - o.x )
            y_axis = math.fabs ( self.y - o.y )
            return x_axis + y_axis <= time and time % 2 == ( x_axis + y_axis ) % 2
