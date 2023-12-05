def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        M = sc.readline ( ).strip ( )
        count = [ 0 ] * M
        for i in range ( N ) :
            K = sc.readline ( ).strip ( )
            for j in range ( K ) :
                count [ sc.readline ( ).strip ( ) ] += 1
    def main ( ) :
        for i in range ( M ) :
            if count [ i ] == N :
                result = 1
        print ( result )
