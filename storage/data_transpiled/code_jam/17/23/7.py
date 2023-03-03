def _import ( ) :
    import sys
    import math
    class C ( object ) :
        def add ( a , b ) :
            if a == - 1 or b == - 1 :
                return - 1
            return a + b
        def min ( a , b ) :
            if a == - 1 :
                return b
            if b == - 1 :
                return a
            return min ( a , b )
    def main ( ) :
        f = sys.stdin
        T = atoi ( f.readline ( ) )
        for t , line in enumerate ( f ) :
            N = atoi ( line [ 0 ] )
            Q = atoi ( line [ 1 ] )
            E = [ ]
            S = [ ]
            for n , m in enumerate ( f ) :
                line = line [ n ]
                E.append ( int ( line [ 0 ] ) )
                S.append ( int ( line [ 1 ] ) )
            D = [ [ int ( n ) for n in line [ 1 : ] ] for line in f ]
            for k in range ( N ) :
                for i in range ( N ) :
                    for j in range ( N ) :
                        D [ i ] [ j ] = min ( D [ i ] [ j ] , add ( D [ i ] [ k ] , D [ k ] [ j ] ) )
            X = [ ]
            for n , m in enumerate ( f ) :
                X.append ( [ min ( X [ n ] [ m ] , X [ n ] [ k ] + X [ k ] [ j ] ) if ( D [ n ] [ m ] == - 1 or D [ n ] [ m ] > E [ n ] ) else min ( X [ n ] [ m ] , X [ n ] [ k ] + X [ k ] [ j ] ) for k in range ( N ) ] )
    return C
