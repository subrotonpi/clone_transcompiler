def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = raw_input
    def run ( self ) :
        self.n , self.m = self.raw_input ( )
        if self.n % self.m == 0 :
            print ( "YES" )
        else :
            print ( "NO" )
