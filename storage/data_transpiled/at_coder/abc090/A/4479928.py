def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        for i in range ( 3 ) :
            line = sys.stdin.readline ( )
            sys.stdout.write ( line [ i ] )
    sys.stdout.write ( '' )
