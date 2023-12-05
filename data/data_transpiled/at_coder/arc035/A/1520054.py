def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.read ( )
        for i in range ( len ( s ) / 2 ) :
            if s [ i ] == '*' or s [ - 1 - i ] == '*' :
                continue
            if s [ i ] != s [ - 1 - i ] :
                print ( 'NO' )
                return
        print ( 'YES' )
