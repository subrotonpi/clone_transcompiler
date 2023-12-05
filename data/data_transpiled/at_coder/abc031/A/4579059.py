def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.d = sys.stdin.read ( )
        print ( max ( a * ( d + 1 ) , ( a + 1 ) * d ) )
