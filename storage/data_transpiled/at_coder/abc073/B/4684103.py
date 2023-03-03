def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        sum = 0
        for a , b in itertools.izip ( N , range ( N ) ) :
            sum += b - a + 1
        print ( sum )
