def import import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        s = sc.read ( ) [ 0 ]
        print ( ord ( s ) - 64 )
