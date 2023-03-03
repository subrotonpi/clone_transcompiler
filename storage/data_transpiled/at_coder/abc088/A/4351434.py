def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.n = self.sc.randint ( 1 , 10000 )
        self.k = self.sc.randint ( 1 , 10000 )
        print ( "Yes" if ( self.n % 500 <= self.k ) else "No" )
