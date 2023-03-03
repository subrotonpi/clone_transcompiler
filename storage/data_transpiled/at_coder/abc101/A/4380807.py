def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        S = sc.read ( )
        count = 0
        for i in range ( 4 ) :
            if S [ i ] == '+' : count += 1
            if S [ i ] == '-' : count -= 1
        print ( count )
