def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        n = self.sc.readline ( )
        for i in range ( len ( n ) / 2 ) :
            if n [ i ] != n [ - i - 1 ] :
                print ( "No" )
                return
        print ( "Yes" )
