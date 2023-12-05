def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.read ( )
        for i in range ( 0 , len ( s ) / 2 ) :
            if s [ i ] == s [ - 1 - i ] or s [ i ] == '*' or s [ - 1 - i ] == '*' :
                continue
            print ( 'NO' )
            return
        print ( 'YES' )
