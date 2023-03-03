def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.k = sys.argv [ 1 ] , sys.argv [ 2 ]
    def run ( self ) :
        self.n , self.k = int ( self.n ) , int ( self.k )
        if self.n % self.k != 0 :
            print ( 1 )
        else :
            print ( 0 )
