def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.read ( )
        seen = set ( )
        for i in range ( N ) :
            value = sc.read ( )
            if value in seen :
                seen.remove ( value )
            else :
                seen.add ( value )
        print ( len ( seen ) )
