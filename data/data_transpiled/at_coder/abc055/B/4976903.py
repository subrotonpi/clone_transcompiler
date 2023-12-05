def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.argv.count ( 'N' )
        division = 1000000007
        result = 1
        for i in range ( 1 , N + 1 ) :
            result = ( result * i ) % division
        print ( result )
        self.exit ( )
