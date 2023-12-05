def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
    def __init__ ( self ) :
        self.c = sys.stdin.read ( )
    ans = [ 0 ] * 4
    for i in range ( self.N ) :
        ans [ ord ( c [ i ] ) - 1 ] += 1
    print ( max ( ans [ 0 ] , max ( ans [ 1 ] , max ( ans [ 2 ] , ans [ 3 ] ) ) ) , min ( ans [ 0 ] , min ( ans [ 1 ] , min ( ans [ 2 ] , ans [ 3 ] ) ) ) )
