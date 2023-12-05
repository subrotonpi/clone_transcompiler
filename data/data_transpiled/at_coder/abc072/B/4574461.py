def import import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        s = sc.read ( )
        for i in range ( len ( s ) , 2 ) :
            sys.stdout.write ( s [ i ] )
