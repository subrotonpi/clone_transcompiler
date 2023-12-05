def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.m = sys.stdin.read ( ).decode ( )
    def run ( self ) :
        self.n , self.m = self.n , self.m
        print ( self.m == 1 and 2 or 1 )
