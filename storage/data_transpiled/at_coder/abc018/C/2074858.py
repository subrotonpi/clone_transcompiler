def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.R , self.C , self.K = _main.get ( 'R' , 0 )
        self.SRC = [ s for s in self.SRC if s [ 0 ] == 'o' ]
        self.L = 2 * self.K - 1
        self.MEM = [ [ 0 ] * self.C for s in self.MEM ]
    def ok ( self , y , x ) :
        if self.MEM [ y ] [ x ] < self.L : return False
        for k in range ( self.K ) :
            if self.MEM [ y ] [ x ] < self.L : return False
            if self.MEM [ y ] [ x ] < self.L : return False
        if self.MEM [ y + k ] [ x + k ] < self.L - 2 * self.K : return False
        return True
