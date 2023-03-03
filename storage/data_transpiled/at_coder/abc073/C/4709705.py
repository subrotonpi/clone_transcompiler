def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        seen = set ( )
        for i in range ( N ) :
            A = int ( sc.readline ( ) )
            if A in seen :
                seen.remove ( A )
            else :
                seen.add ( A )
        print ( len ( seen ) )
