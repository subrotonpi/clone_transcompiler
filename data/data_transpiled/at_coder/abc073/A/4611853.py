def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = sys.argv [ 1 ]
        if a % 10 == 9 or a / 10 == 9 :
            print ( "Yes" )
        else :
            print ( "No" )
