def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = raw_input
    def main ( self ) :
        h = self.raw_input ( )
        w = self.raw_input ( )
        a = [ [ ( x [ - 1 ] == '#' ) for x in range ( h + 2 ) ] for x in range ( w + 2 ) ]
        for i in range ( 1 , h + 1 ) :
            data = self.raw_input ( )
            for j in range ( 1 , w + 1 ) :
                a [ i ] [ j ] = ( data [ j - 1 ] == '#' )
        for i in range ( 1 , h + 1 ) :
            for j in range ( 1 , w + 1 ) :
                if not a [ i ] [ j ] :
                    continue
                if a [ i - 1 ] [ j ] or a [ i + 1 ] [ j ] or a [ i ] [ j - 1 ] or a [ i ] [ j + 1 ] :
                    continue
                else :
                    print ( "No" )
                    sys.exit ( )
        print ( "Yes" )
