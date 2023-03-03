def import _sys
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sys.stdin
        self.s = sc.read ( )
        self.price = 700
        for i in range ( 3 ) :
            if s [ i ] == 'o' :
                self.price += 100
        self.out.write ( self.price )
