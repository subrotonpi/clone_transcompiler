def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.l = self.n , self.l
        self.s = _main ( self.n )
        tab , ans = 1 , 0
        for c in s :
            if c == '+' : tab += 1
            if c == '-' : tab -= 1
            if tab > self.l :
                tab = 1
                ans += 1
        print ( ans )
