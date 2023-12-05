def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.count ( )
        if N == 0 :
            S = [ ]
            s = [ ]
            t = [ ]
            for S in sc.read ( ).split ( '' ) :
                s.append ( S.split ( '' ) )
            for i in range ( N ) :
                for j in range ( N ) :
                    sys.stdout.write ( s [ N - 1 - j ] [ i ] )
                sys.stdout.write ( '\n' )
