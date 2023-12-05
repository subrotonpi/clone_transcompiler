def import import _sum
import math
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        s = raw_input ( )
        n , k = s.split ( )
        a , b = [ ] , [ ]
        for i in range ( 1 , n + 1 ) :
            a.append ( s.pop ( i ) )
            b.append ( a [ i ] if a [ i ] > 0 else 0 )
        a.parallelPrefix ( sum )
        b.parallelPrefix ( sum )
        r = float ( 0 )
        for i in range ( 0 , n - k ) :
            print ( )
            r = max ( r , b [ i ] + b [ n ] - b [ i + k ] + max ( 0 , a [ i + k ] - a [ i ] ) )
        print ( r )
