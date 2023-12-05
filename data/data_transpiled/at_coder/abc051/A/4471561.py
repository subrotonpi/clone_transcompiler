def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sys.stdin
        str = sc.readline ( )
        s = str.replace ( ',' , ' ' )
        print ( s )
