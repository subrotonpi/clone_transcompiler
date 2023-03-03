def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
    def __init__ ( self ) :
        self.Scanner.__init__ ( self )
    H = int ( sys.stdin.readline ( ) )
    W = int ( sys.stdin.readline ( ) )
    s = [ [ 0 ] * ( H + 2 ) for i in range ( 1 , H + 2 ) ]
    able = True
    for i in range ( 1 , H + 1 ) :
        scan = scan.split ( )
        for j in range ( 1 , W + 1 ) :
            if scan [ j - 1 ] == '#' :
                s [ i ] [ j ] = 1
            else :
                s [ i ] [ j ] = 0
    for i in range ( H ) :
        for j in range ( W ) :
            if s [ i ] [ j ] == 1 :
                if s [ i - 1 ] [ j ] == 0 and s [ i + 1 ] [ j ] == 0 and s [ i ] [ j - 1 ] == 0 and s [ i ] [ j + 1 ] == 0 :
                    able = False
    print ( 'Yes' if able else 'No' )
