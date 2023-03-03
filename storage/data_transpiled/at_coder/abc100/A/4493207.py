def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.read ( )
        M = sc.read ( )
        if N <= 8 and M <= 8 :
            print ( "Yay!" )
        else :
            print ( ":(" )
