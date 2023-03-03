def import import sys
import math
import random
import math
import random
import sys
class Main ( ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = len ( sys.argv )
        x = [ random.randint ( 0 , N ) for _ in range ( N ) ]
        y = [ random.randint ( 0 , N ) for _ in range ( N ) ]
        h = [ random.randint ( 0 , N ) for _ in range ( N ) ]
    def __init__ ( self ) :
        self.x = x
        self.y = y
        self.h = h
    def run ( ) :
        for cx in range ( 0 , 100 ) :
            for cy in range ( 0 , 100 ) :
                H = 0
                for i in range ( N ) :
                    if h [ i ] != 0 :
                        H = h [ i ] + abs ( x [ i ] - cx ) + abs ( y [ i ] - cy )
                        break
            is_anon = True
            for i in range ( N ) :
                htmp = max ( H - abs ( x [ i ] - cx ) - abs ( y [ i ] - cy ) , 0 )
                if htmp != h [ i ] :
                    is_anon = False
                    break
            if is_anon :
                self.out.println ( cx , cy , H )
                return
