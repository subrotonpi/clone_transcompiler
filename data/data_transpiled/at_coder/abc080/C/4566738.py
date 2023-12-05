def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.read ( )
        fs = [ [ sc.randint ( 0 , 10 ) for i in range ( N ) ] for j in range ( 10 ) ]
        ps = [ [ sc.randint ( 0 , 11 ) for i in range ( N ) ] for j in range ( 11 ) ]
        ans = int ( 0 )
        for mask in range ( 1 , 1 << 10 ) :
            count = [ ]
            for i in range ( 10 ) :
                if ( ( mask >> i ) & 1 ) == 1 :
                    for j in range ( N ) :
                        if fs [ j ] [ i ] == 1 :
                            count.append ( count [ j ] + 1 )
        total = 0
        for i in range ( N ) :
            total += ps [ i ] [ count [ i ] ]
        ans = max ( total , ans )
    print ( ans )
