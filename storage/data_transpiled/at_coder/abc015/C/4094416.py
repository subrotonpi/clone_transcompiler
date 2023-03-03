def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        self.n = sc.n
        self.m = sc.m
        self.field = [ [ ] for i in range ( self.n ) ]
    def check ( val , level ) :
        if level == self.n - 1 :
            for i in range ( self.m ) :
                if ( val ^ self.field [ level ] [ i ] ) == 0 :
                    return True
        else :
            for i in range ( self.m ) :
                ret = _main ( val ^ self.field [ level ] [ i ] , level + 1 )
                if ret :
                    return True
        return False
return Main
