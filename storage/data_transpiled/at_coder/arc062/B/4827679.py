def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
        s = self.sc.split ( )
        ans = len ( s ) / 2
        for i in s :
            if i == 'p' :
                ans -= 1
        print ( ans )
        self.sc.close ( )
