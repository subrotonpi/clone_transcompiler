def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self._H , self._W , self._D = sys.argv [ 1 ] , sys.argv [ 2 ]
    def main ( self ) :
        import sys
        self._W , self._D = sys.argv [ 3 ] , sys.argv [ 4 ]
        L = [ [ ] for i in range ( 1 , self._H + 1 ) for j in range ( 1 , self._W + 1 ) ]
        for aij in range ( 1 , self._W + 1 ) :
            L [ 0 ] [ aij ] = i
            L [ 1 ] [ aij ] = j
    A = [ ]
    for j in range ( self._D + 1 , self._H + 1 ) :
        A.append ( A [ j - D ] + abs ( L [ 0 ] [ j ] - L [ 0 ] [ j - D ] ) + abs ( L [ 1 ] [ j ] - L [ 1 ] [ j - D ] ) )
    Q = sys.argv [ 2 ]
    for li , ri in zip ( range ( Q ) , range ( Q ) ) :
        print ( A [ ri ] - A [ li ] )
