def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
    def add ( self , a , b , c ) :
        self.a = a
        self.b = b
        self.c = c
        self.ab = a + b
        self.bc = b + c
        self.ca = c + a
    def run ( self ) :
        ans = min ( self.ab , self.bc )
        print ( min ( ans , self.ca ) )
