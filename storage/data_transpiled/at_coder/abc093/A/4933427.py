def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.next ( )
        c0 , c1 , c2 = s
        print ( 'No' if c0 == c1 or c1 == c2 or c2 == c0 else 'Yes' )
