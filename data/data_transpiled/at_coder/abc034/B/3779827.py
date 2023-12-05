def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        if self.n % 2 == 0 :
            print ( self.n - 1 )
        else :
            print ( self.n + 1 )
