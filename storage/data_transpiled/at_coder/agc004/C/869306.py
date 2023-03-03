def import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        H , W = sc.readline ( ).split ( )
        a = [ sc.readline ( ).split ( ) for i in range ( H ) ]
        SB = [ '' ] * ( H * ( W + 1 ) * 2 + 1 )
        for i in range ( H ) :
            for j in range ( W ) :
                if j != W - 1 and ( i % 2 == 0 or j == 0 or a [ i ] [ j ] == '#' ) :
                    SB [ j ] = '#'
                else :
                    SB [ j ] = '.'
            SB [ i ] = '\n'
        SB [ i ] = '\n'
        for i in range ( H ) :
            for j in range ( W ) :
                if j != 0 and ( i % 2 == 1 or j == W - 1 or a [ i ] [ j ] == '#' ) :
                    SB [ j ] = '#'
                else :
                    SB [ j ] = '.'
            SB [ i ] = '\n'
        sys.stdout.write ( SB )
