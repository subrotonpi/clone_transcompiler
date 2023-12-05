def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = [ sc.readline ( ) for i in range ( 5 ) ]
    seen = set ( )
    for i in range ( 5 ) :
        for j in range ( 5 ) :
            for k in range ( 5 ) :
                if i != j and j != k and k != i :
                    seen.add ( n [ i ] + n [ j ] + n [ k ] )
    seen = sorted ( seen , reverse = True )
    print ( seen [ 2 ] )
