def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.read ( )
        for i in range ( len ( s ) - 1 ) :
            if s [ i ] == s [ i + 1 ] :
                print ( ( i + 1 , i + 2 ) )
                return
            try :
                if s [ i ] == s [ i + 2 ] :
                    print ( ( i + 1 , i + 3 ) )
                    return
            except :
                print ( - 1 , - 1 )
                return
