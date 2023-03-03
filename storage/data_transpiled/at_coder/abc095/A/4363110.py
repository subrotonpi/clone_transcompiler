def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        S = sc.read ( )
        count = 0
        for i in range ( 3 ) :
            if S [ i ] == 'o' :
                count += 1
        print ( 700 + count * 100 )
