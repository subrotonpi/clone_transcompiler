def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( )
        ngs = len ( s )
        unko = [ [ 0 for i in range ( 26 ) ] for i in range ( ngs + 1 ) ]
        for i in range ( ngs ) :
            unko [ s [ i ] - 97 ] [ i + 1 ] += 1
        for i in range ( 26 ) :
            for j in range ( 1 , ngs ) :
                unko [ i ] [ j ] = unko [ i ] [ j ] + unko [ i ] [ j - 1 ]
    def l ( self ) :
        for j in range ( 26 ) :
            if unko [ i ] [ j + 2 ] - unko [ i ] [ j ] == 2 :
                print ( j + 1 , ( j + 2 ) )
                sys.exit ( )
        for j in range ( 26 ) :
            if unko [ i ] [ j + 3 ] - unko [ i ] [ j ] >= 2 :
                print ( j + 1 , ( j + 3 ) )
                sys.exit ( )
    def main ( self ) :
        return - 1
