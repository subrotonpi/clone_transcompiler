def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.read ( )
        if N / 10 == 9 or N % 10 == 9 :
            print ( "Yes" )
        else :
            print ( "No" )
