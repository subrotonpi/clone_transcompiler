def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
    def main ( self ) :
        n = self.sc.n
        r = b = 0
        for s in self.sc :
            for c in s :
                if c == 'R' :
                    r += 1
                if c == 'B' :
                    b += 1
        if r > b :
            print ( "TAKAHASHI" )
        if r < b :
            print ( "AOKI" )
        if r == b :
            print ( "DRAW" )
