def import math
import os
import sys
import math
import random
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        s = raw_input ( )
        n = len ( s )
        p = [ ]
        [ ( s.pop ( ) , s.pop ( ) ) for s in range ( n ) ]
        r = 0
        for i in range ( n ) :
            a = p [ i ]
            for j in range ( i + 1 , n ) :
                b = p [ j ]
                for k in range ( j + 1 , n ) :
                    c = p [ k ]
                    if math.atan2 ( a [ 1 ] - b [ 1 ] , a [ 0 ] - b [ 0 ] ) != math.atan2 ( a [ 1 ] - c [ 1 ] , a [ 0 ] - c [ 0 ] ) and ( f ( a , b ) + f ( b , c ) + f ( c , a ) ) % 2 == 0 :
                        r += 1
        print ( r )
    def f ( a , b ) :
        return abs ( long ( a [ 0 ] - b [ 0 ] ) * long ( a [ 1 ] - b [ 1 ] ) )
