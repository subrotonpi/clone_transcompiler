def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N , self.M , self.K = _main.get ( self.N ) , _main.get ( self.M ) , _main.get ( self.K )
        self.foods = [ ]
        for i in range ( self.N ) :
            self.K = _main.get ( self.K )
            for j in range ( self.K ) :
                self.foods [ self.K - 1 ] += 1
    def run ( self ) :
        ans = 0
        for k in range ( self.M ) :
            if self.foods [ k ] == self.N :
                ans += 1
        print ( ans )
