def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.t , a = 0 , 0
        for st in self.s.split ( ) :
            for i in st :
                if i == 'R' :
                    self.t += 1
                if i == 'B' :
                    self.a += 1
        print ( 'TAKAHASHI' if self.t > a else 'AOKI' if self.t < a else 'DRAW' )
