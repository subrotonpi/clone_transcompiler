def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.next ( )
        if n.contentEquals ( 'A' ) :
            print ( 'T' )
        elif n.contentEquals ( 'T' ) :
            print ( 'A' )
        elif n.contentEquals ( 'G' ) :
            print ( 'C' )
        elif n.contentEquals ( 'C' ) :
            print ( 'G' )
