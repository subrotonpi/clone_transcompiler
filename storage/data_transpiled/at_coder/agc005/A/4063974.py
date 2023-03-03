def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
    def __call__ ( self ) :
        x = self.sc.value
        cnt = 0
        s = 0
        n = len ( x )
        for i in range ( n ) :
            if x [ i ] == 'S' :
                s += 1
            if x [ i ] == 'T' :
                s -= 1
                if s < 0 :
                    s = 0
                    continue
                cnt += 1
        ans = n - 2 * cnt
        print ( ans )
