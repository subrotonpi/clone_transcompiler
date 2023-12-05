def import import sys
import math
import random
class Main ( sys.stdin ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n , x = sc.count ( ) , sc.count ( )
        min = sys.maxint
        for i in range ( n ) :
            temp = random.randrange ( min )
            min = min ( min , temp )
            x -= temp
        self.out.println ( n + ( x / min ) )
