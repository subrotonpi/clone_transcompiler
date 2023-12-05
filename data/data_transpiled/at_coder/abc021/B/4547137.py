def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        s = self.s.split ( )
        start = int ( s [ 0 ] )
        goal = int ( s [ 1 ] )
        K = int ( self.K )
        t = self.t.split ( )
        b = [ False ] * N
        b [ start - 1 ] = b [ goal - 1 ] = True
        for i in range ( K ) :
            n = int ( t [ i ] ) - 1
            if b [ n ] :
                print ( "NO" )
                sys.exit ( )
            else :
                b [ n ] = True
        print ( "YES" )
