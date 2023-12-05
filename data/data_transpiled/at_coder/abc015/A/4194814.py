def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = raw_input
    def main ( ) :
        a = sys.stdin.readline ( )
        b = sys.stdin.readline ( )
        if len ( a ) < len ( b ) :
            print ( b )
        else :
            print ( a )
