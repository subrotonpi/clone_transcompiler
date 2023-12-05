def import import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        d = sc.read ( )
        n = sc.read ( )
        ans = 0
        if n <= 99 :
            print ( n * int ( math.pow ( 100 , d ) ) )
        else :
            print ( 101 * int ( math.pow ( 100 , d ) ) )
