def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
        s = self.sc.split ( )
        for i in range ( len ( s ) - 2 , 1 , - 2 ) :
            if s [ : i // 2 ] == s [ i // 2 : i ] :
                print ( i )
                break
