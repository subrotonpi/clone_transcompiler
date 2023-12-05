def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.dp = [ ]
    def go ( self ) :
        sc = _main.sc
        a = sc.next ( )
        b = sc.next ( )
        s = a + b
        c = int ( s )
        print ( c * 2 )
