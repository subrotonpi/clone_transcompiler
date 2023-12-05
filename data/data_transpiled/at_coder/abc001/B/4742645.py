def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        line = self.sc.readline ( )
        m = int ( line )
        if m < 100 :
            print ( '00' )
        elif m < 1000 :
            print ( '0' * ( m / 100 ) )
        elif m <= 5000 :
            print ( m / 100 )
        elif m <= 30000 :
            print ( ( m / 1000 ) + 50 )
        elif m <= 70000 :
            print ( ( ( m / 1000 ) - 30 ) / 5 + 80 )
        else :
            print ( '89' )
