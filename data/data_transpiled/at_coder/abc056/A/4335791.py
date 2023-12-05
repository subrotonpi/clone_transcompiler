def import _Scanner
class Main ( Scanner ) :
    def __init__ ( self ) :
        sc = _Scanner ( )
        a , b = sc.next ( ) , sc.next ( )
        print ( 'H' if a == b else 'D' )
