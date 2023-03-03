def import _main
class Main ( object ) :
    def __init__ ( self ) :
        with open ( 'README.rst' ) as sc :
            s = sc.read ( )
        print ( s.rstrip ( '%s' ).rstrip ( 'SAME' ) or 'DIFFERENT' )
