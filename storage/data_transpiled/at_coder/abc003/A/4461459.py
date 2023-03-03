def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        x = sc.read ( )
        i = 0
        sum = 0
        for i in range ( 1 , x + 1 ) :
            sum = sum + ( ( i * 10000 ) / x )
        print ( sum )
