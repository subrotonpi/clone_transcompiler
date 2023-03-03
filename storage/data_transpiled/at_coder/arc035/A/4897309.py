def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.read ( )
        l = len ( s )
        for i in range ( l / 2 ) :
            if not ( s [ i ] == s [ l - i - 1 ] or s [ i ] == '*' or s [ l - i - 1 ] == '*' ) :
                print ( 'NO' )
                return
        print ( 'YES' )
