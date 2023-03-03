def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        board = [ ]
        for i in range ( 4 ) :
            for j in range ( 4 ) :
                board [ i ] [ j ] = sc.read ( )
        for i in range ( 4 ) :
            for j in range ( 4 ) :
                sys.stdout.write ( board [ 3 - i ] [ 3 - j ] )
                if j != 3 :
                    sys.stdout.write ( ' ' )
            sys.stdout.write ( '\n' )
