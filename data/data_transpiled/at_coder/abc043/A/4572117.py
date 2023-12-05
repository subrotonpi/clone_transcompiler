def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.total = sys.maxint
    def __call__ ( self , * args ) :
        return sys.argv [ 1 ]
    def main ( ) :
        return Main ( )
