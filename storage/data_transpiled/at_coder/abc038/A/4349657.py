def import _main
class Main ( object ) :
    def __init__ ( self ) :
        with open ( "/proc/self/status" ) as sc :
            a = sc.read ( )
        print ( "YES" if ( a [ - 1 ] == "T" ) else "NO" )
