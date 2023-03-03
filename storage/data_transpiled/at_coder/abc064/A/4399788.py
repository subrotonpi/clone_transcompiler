def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def __call__ ( self , * args ) :
        c = int ( self.sc )
        c = c * 10 + self.sc
        c = c * 10 + self.sc
        if c % 4 == 0 :
            print ( "YES" )
        else :
            print ( "NO" )
