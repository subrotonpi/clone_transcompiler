def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = sys.argv [ 1 ]
        print ( a * 800 - ( a / 15 ) * 200 )
