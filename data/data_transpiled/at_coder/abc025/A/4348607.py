def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
        n = self.sc.readline ( )
        po = n.split ( '' , 0 )
        m = self.sc.readline ( ).split ( ) [ - 1 ]
        print ( po [ m // 5 ] , po [ m % 5 ] )
