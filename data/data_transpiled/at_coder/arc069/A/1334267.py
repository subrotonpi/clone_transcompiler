def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.read ( )
        M = sc.read ( )
        result = 0
        if N * 2 <= M :
            if ( M - N * 2 ) >= 4 :
                result = ( ( M - N * 2 ) / 4 ) + N
            else :
                result = N
        else :
            result = M / 2
        print ( result )
