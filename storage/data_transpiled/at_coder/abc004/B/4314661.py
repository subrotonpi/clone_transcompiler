def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            self.spot = [ ]
            for i in range ( 4 ) :
                for j in range ( 4 ) :
                    self.spot.append ( sc.read ( ) )
        for i in range ( 3 , - 1 , - 1 ) :
            for j in range ( 3 , - 1 , - 1 ) :
                sys.stdout.write ( self.spot [ i ] [ j ] + ( j > 0 and '' or '' ) )
            sys.stdout.write ( '\n' )
