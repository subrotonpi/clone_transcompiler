def import _Scanner
class Main ( object ) :
    def __init__ ( self ) :
        sc = _Scanner ( )
        a , b = sc.next ( ) , sc.next ( )
        s = [ ]
        for i in range ( len ( a ) ) :
            s.append ( a [ i ] )
            if len ( b ) > i :
                s.append ( b [ i ] )
        print ( s )
