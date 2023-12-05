def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.n = sys.stdin.read ( )
        while True :
            if self.n % a == 0 and self.n % b == 0 :
                print ( self.n )
                return
            self.n += 1
