def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.ans = 0
    def call ( self ) :
        self.N = 0
        self.ans = 0
        self.n = len ( self.N )
        for i in range ( self.n ) :
            a = _main ( self.N )
            for _ in range ( self.n ) :
                if a % 2 and a % 3 != 2 :
                    break
                a -= 1
                self.cut += 1
        print ( self.cut )
