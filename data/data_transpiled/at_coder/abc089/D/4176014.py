def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self._H = sys.maxint
        self._W = sys.maxint
        self._D = sys.maxint
    def __init__ ( self ) :
        self._W = sys.maxint
        self._D = sys.maxint
    L = [ ]
    for i in range ( 1 , H + 1 ) :
        for j in range ( 1 , W + 1 ) :
            aij = sys.maxint
            L.append ( [ i , aij ] )
    A = [ 0 ] * ( H * W + 1 )
    for i in range ( 1 , D + 1 ) :
        for j in range ( i + D , H * W + 1 , D ) :
            A [ j ] = A [ j - D ] + abs ( L [ 0 ] [ j ] - L [ 0 ] [ j - D ] ) + abs ( L [ 1 ] [ j ] - L [ 1 ] [ j - D ] )
    Q = sys.maxint
    li = [ ]
    ri = [ ]
    for i in range ( Q ) :
        li.append ( sys.maxint )
        ri.append ( sys.maxint )
    for i in range ( Q ) :
        print ( A [ ri [ i ] ] - A [ li [ i ] ] )
