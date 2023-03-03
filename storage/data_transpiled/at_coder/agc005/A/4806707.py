def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
    def __call__ ( self ) :
        x = _main ( )
        ans = len ( x )
        scnt = 0
        for i in x :
            if i == 'S' :
                scnt += 1
            else :
                if scnt != 0 :
                    scnt -= 1
                    ans -= 2
        print ( ans )
