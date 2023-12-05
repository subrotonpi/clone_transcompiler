def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = sys.argv [ 1 ]
        print ( - 200 * ( a / 15 ) + 800 * a )
