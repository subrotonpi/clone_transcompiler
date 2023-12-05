def import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        banmen = [ ]
        for i in range ( 4 ) :
            for j in range ( 4 ) :
                banmen [ i ] [ j ] = sc.read ( i )
        for i in range ( 4 ) :
            for j in range ( 4 ) :
                sys.stdout.write ( ( " " * ( 3 - i ) ) + " " + banmen [ 3 - i ] [ 3 - j ] )
            sys.stdout.write ( "\n" )
