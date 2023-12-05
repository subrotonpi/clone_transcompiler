def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = self.sc.readline ( )
        b = self.sc.readline ( )
        if a == b or b == a :
            print ( "H" )
        else :
            print ( "D" )
