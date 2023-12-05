def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        if len ( a ) > len ( b ) :
            print ( "GREATER" )
        elif len ( a ) < len ( b ) :
            print ( "LESS" )
        else :
            for i in range ( len ( a ) ) :
                if a [ i ] == b [ i ] :
                    continue
                elif a [ i ] > b [ i ] :
                    print ( "GREATER" )
                    sys.exit ( )
                else :
                    print ( "LESS" )
                    sys.exit ( )
            print ( "EQUAL" )
