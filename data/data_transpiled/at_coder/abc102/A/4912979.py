def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.num = sys.argv [ 1 ]
    def run ( self ) :
        if self.num % 2 == 0 :
            print ( self.num )
        else :
            print ( self.num * 2 )
