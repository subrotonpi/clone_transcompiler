def import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        t = sc.readline ( )
        x = sc.readline ( )
        sys.stdout.write ( float ( t ) / x )
