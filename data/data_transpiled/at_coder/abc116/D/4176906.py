def import _main
import sys
import random
import time
import sys
import random
import time
import sys
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        Scanner ( )
        n = int ( sys.stdin.readline ( ) )
        k = int ( sys.stdin.readline ( ) )
        f = [ ]
        sushi = [ ( random.randint ( 0 , n ) , random.randint ( 0 , n ) ) for i in range ( n + 1 ) ]
        S = set ( )
        sushi.sort ( lambda p1 , p2 : p2 [ 1 ] - p1 [ 1 ] )
        temp = 0
        s = [ ]
        for i in range ( k ) :
            temp += long ( sushi [ i ] [ 1 ] )
            S.add ( sushi [ i ] [ 0 ] )
            s [ sushi [ i ] [ 0 ] ] += 1
        size = len ( S )
        f.append ( temp )
        left , right = k - 1 , k
        while 0 <= left < n :
            while 0 <= left and s [ sushi [ left ] [ 0 ] ] == 1 :
                left -= 1
            while right < n and s [ sushi [ right ] [ 0 ] ] > 0 :
                right += 1
            if 0 <= left < right :
                f.append ( f [ size ] - sushi [ left ] [ 1 ] + sushi [ right ] [ 1 ] )
                size += 1
                s [ sushi [ right ] [ 0 ] ] += 1
                s [ sushi [ left ] [ 0 ] ] -= 1
                swap ( sushi , left , right )
        ans = 0
        for i in range ( 1 , k + 1 ) :
            if f [ int ( i ) ] > 0 :
                ans = max ( ans , f [ int ( i ) ] + i * i )
        self.out.write ( ans )
    def swap ( self , p , a , b ) :
        temp = p [ a ]
        p [ a ] = p [ b ]
        p [ b ] = temp
