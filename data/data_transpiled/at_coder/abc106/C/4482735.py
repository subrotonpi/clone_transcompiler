def import import sys
import math
import random
import math
class Main ( sys.stdout ) :
    def __init__ ( self ) :
        Scanner ( )
        S = sys.stdin.read ( )
        K = random.randint ( 0 , 10 )
        days = 5.0 * math.pow ( 10 , 15 )
        ans = S [ 0 ]
        for i in range ( len ( S ) ) :
            K -= math.pow ( random.choice ( S [ i ] ) , days )
            if K <= 0 :
                ans = S [ i ]
                break
        out.write ( ans )
