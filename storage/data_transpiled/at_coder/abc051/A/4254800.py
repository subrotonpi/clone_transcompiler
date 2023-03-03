def import _main
class Main ( object ) :
    def __init__ ( self ) :
        with open ( "/etc/init.d/" ) as sc :
            words = sc.read ( ).split ( "," )
            haiku = words [ 0 ] + " " + words [ 1 ] + " " + words [ 2 ]
            print ( haiku )
