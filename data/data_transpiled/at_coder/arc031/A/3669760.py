def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.read ( )
        flag = True
        for i in range ( len ( s ) / 2 ) :
            if s [ i ] != s [ - 1 - i ] :
                flag = False
        if flag :
            print ( "YES" )
        else :
            print ( "NO" )
