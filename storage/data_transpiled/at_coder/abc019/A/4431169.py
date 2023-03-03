def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = [ ]
        for i in range ( 3 ) : a.append ( sc.read ( ) )
        for i in range ( 3 ) :
            for j in range ( 3 ) :
                if a [ i ] < a [ j ] :
                    tmp = a [ i ]
                    a [ i ] = a [ j ]
                    a [ j ] = tmp
        print ( a [ 1 ] )
