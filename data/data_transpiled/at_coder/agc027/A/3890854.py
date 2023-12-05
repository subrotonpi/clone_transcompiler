def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
        self.x = sys.maxint
    def main ( ) :
        self.N = sys.maxint
        self.x = sys.maxint
        self.a = [ ]
        for i in range ( self.N ) :
            self.a.append ( i )
        self.a.sort ( )
        ans = 0
        for i in range ( self.N - 1 ) :
            if self.a [ i ] <= x :
                self.x -= self.a [ i ]
                ans += 1
        if self.a [ self.N - 1 ] == x :
            ans += 1
        print ( ans )
