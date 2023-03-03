def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.argv.count ( 'N' )
    def run ( self ) :
        if self.N == 1 :
            print ( "Hello World" )
        else :
            A , B = self.N , self.N
            print ( A + B )
