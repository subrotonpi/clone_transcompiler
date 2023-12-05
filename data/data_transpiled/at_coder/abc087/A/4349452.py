def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = ( sys.stdin.read ( ) - sys.stdin.read ( ) ) % sys.stdin.read ( )
        print ( a )
