def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        c = sc.read ( )
        k = sc.read ( )
        s = sc.read ( )
        t = sc.read ( )
        sam = s + t
        sam2 = ( a * s ) + ( b * t )
        if sam >= k :
            print ( sam2 - sam * c )
        else :
            print ( sam2 )
