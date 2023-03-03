def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.d = int ( sys.stdin.read ( ) )
        self.x = 0
        for i in range ( self.n ) :
            a = sys.stdin.read ( )
            for j in range ( 1 , d + 1 , a ) :
                self.x += 1
        print ( self.x )
