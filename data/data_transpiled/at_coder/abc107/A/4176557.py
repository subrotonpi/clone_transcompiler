def import import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        n = sc.read ( )
        i = sc.read ( )
        print ( n - i + 1 )
