def import _main
class Main ( object ) :
    def __init__ ( self ) :
        with open ( "/etc/init.d/" ) as sc :
            a = sc.read ( )
            print ( "YES" if a [ - 1 ] == "T" else "NO" )
