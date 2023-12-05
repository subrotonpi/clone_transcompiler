def import import sys , string
import math
import random
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        a = [ random.randint ( 0 , n ) for i in range ( n ) ]
        b = [ random.randint ( 0 , n ) for i in range ( n ) ]
        add = 0
        for i in range ( n - 1 , - 1 , - 1 ) :
            if ( a [ i ] + add ) % b [ i ] == 0 :
                pass
            elif b [ i ] >= a [ i ] + add :
                add += b [ i ] - ( a [ i ] + add )
            else :
                bai = ( a [ i ] + add ) / b [ i ] + 1
                add += b [ i ] * bai - ( a [ i ] + add )
        print ( add )
