def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.x = sys.stdin.read ( )
    def run ( self ) :
        for i in range ( self.x ) :
            if i % a == 0 and i % b == 0 :
                print ( i )
                break
