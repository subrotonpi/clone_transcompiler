def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
        self.a = sys.maxint
        self.b = sys.maxint
        self.K = sys.maxint
        self.P = [ ]
        for i in range ( K ) :
            self.P.append ( sys.maxint )
        for i in range ( K ) :
            for j in range ( K ) :
                if i != j and self.P [ i ] == P [ j ] :
                    print ( "NO" )
                    return
            if self.P [ i ] == a or self.P [ i ] == b :
                print ( "NO" )
                return
        print ( "YES" )
