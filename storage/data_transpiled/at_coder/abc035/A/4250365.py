def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        w , h = sc.split ( )
        if w // 4 == h // 3 :
            print ( '4:3' )
        else :
            print ( '16:9' )
