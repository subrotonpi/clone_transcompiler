def import import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        map = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        map = [ map.pop ( 0 ) for i in map ]
        sum = 0
        for bug in map :
            sum += bug
        print ( int ( math.ceil ( sum / len ( map ) ) ) )
