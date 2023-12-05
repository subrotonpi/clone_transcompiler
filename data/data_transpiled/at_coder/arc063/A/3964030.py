def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.s = _main ( )
        self.n = len ( self.s )
        cnt = 0
        crr = self.s [ 0 ]
        for i in range ( 1 , n ) :
            nxt = self.s [ i ]
            if crr != nxt :
                cnt += 1
            crr = nxt
        print ( cnt )
