def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.W = sys.stdin.read ( )
        self.H = sys.stdin.read ( )
        self.s = ""
        for i in range ( self.H + 2 ) :
            self.s += "#"
        print ( self.s )
        for i in range ( self.W ) :
            print ( "#" + self.s + "#" )
        print ( self.s )
