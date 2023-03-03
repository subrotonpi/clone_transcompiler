def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.S = _main ( )
    def __call__ ( self , * args ) :
        self.S = _main ( )
        ans = 0
        for i in range ( 4 ) :
            if S [ i ] == '+' :
                ans += 1
            elif S [ i ] == '-' :
                ans -= 1
        print ( ans )
