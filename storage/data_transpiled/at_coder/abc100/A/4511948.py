def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        if a <= 8 and b <= 8 :
            print ( "Yay!" )
        else :
            print ( ":(" )
