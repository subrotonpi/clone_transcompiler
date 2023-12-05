def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.K = sys.stdin.read ( )
    def __init__ ( self ) :
        self.a = [ ]
        for i in range ( self.N ) :
            self.a.append ( sys.stdin.read ( ) )
        up = 1
        count = 0
        for i in range ( 0 , self.N - 1 ) :
            if i > 0 and self.a [ i - 1 ] < self.a [ i ] :
                up += 1
            else :
                up = 1
            if up >= K :
                count += 1
        print ( count )
