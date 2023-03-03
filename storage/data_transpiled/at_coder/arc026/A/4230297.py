def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.a = int ( self.a )
        self.b = int ( self.b )
        self.ans = min ( self.n , 5 ) * self.b + max ( self.n - 5 , 0 ) * self.a
        print ( self.ans )
