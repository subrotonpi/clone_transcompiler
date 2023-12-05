def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s1 = sc.readline ( )
        s2 = sc.readline ( )
        for i in range ( len ( s1 ) ) :
            if s1 [ i ] != s2 [ - 1 - i ] :
                print ( 'NO' )
                return
        print ( 'YES' )
