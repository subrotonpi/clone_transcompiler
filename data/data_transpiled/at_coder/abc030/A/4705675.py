def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        A = sc.read ( )
        B = sc.read ( )
        C = sc.read ( )
        D = sc.read ( )
        if B / A > D / C :
            print ( "TAKAHASHI" )
        elif B / A < D / C :
            print ( "AOKI" )
        else :
            print ( "DRAW" )
