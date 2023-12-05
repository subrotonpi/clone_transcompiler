def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
    def run ( self ) :
        if self.n < 1000 :
            print ( "ABC" )
            return
        self.n = self.n % 1000 + 1
        print ( "ABD" )
