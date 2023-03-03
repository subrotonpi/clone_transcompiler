def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        K = int ( sc.readline ( ) )
        S = int ( sc.readline ( ) )
        C = 0
        nam = 0
        for a in range ( 0 , K ) :
            for b in range ( 0 , K ) :
                C = S - a - b
                if 0 <= C <= K :
                    nam = nam + 1
        sys.stdout.write ( nam )
