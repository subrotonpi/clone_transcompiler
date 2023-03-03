def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.read ( )
        sum = 0
        for i in range ( 1 , N + 1 ) :
            sum += i
        print ( sum )
