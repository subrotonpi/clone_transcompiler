def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        while True :
            if self.c % b == 0 and self.c % a == 0 :
                break
            self.c += 1
        print ( self.c )
