def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
        s = self.sc.read ( )
        Bcnt = 0
        cnt = 0
        for c in s :
            if c == 'W' :
                cnt += Bcnt
            if c == 'B' :
                Bcnt += 1
        print ( cnt )
