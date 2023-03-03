def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.__help__ = sys.__help__
    def __init__ ( self , H , W ) :
        self.__help__ = sys.__help__
    S = [ s for s in sys.stdin if s [ 0 ] == '#' ]
    s = [ ]
    for i in range ( H ) :
        for j in range ( W ) :
            s.append ( S [ i ] [ j ] )
    for i in range ( H ) :
        for j in range ( W ) :
            if s [ i ] [ j ] != '#' :
                s [ i ] [ j ] = '0'
    for i in range ( H ) :
        for j in range ( W ) :
            if s [ i ] [ j ] == '#' :
                for k in range ( - 1 , 1 ) :
                    for l in range ( - 1 , 1 ) :
                        if ( ( 0 <= i + k ) and ( i + k < H ) and ( 0 <= j + l ) and ( j + l < W ) ) and ( not ( k == 0 and l == 0 ) ) :
                            if s [ i + k ] [ j + l ] != '#' :
                                s [ i + k ] [ j + l ] += 1
    for i in range ( H ) :
        for j in range ( W ) :
            print ( s [ i ] [ j ] , end = '' )
        print ( '' )
