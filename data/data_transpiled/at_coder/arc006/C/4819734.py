def import _main
class Main ( object ) :
    INF = 1000000
    def __init__ ( self , * args ) :
        self.n = args [ 0 ]
    def run ( self ) :
        self.n = args [ 1 ]
    def run ( self ) :
        self.w = [ ]
        for i in range ( self.n ) :
            if self.w [ i ] == INF :
                continue
            tmp = self.INF
            for j in range ( self.n ) :
                if tmp >= self.w [ j ] :
                    tmp = self.w [ j ]
                    self.w [ j ] = INF
        ans += 1
    print ( ans )
