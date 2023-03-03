def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.ans = 0
    def run ( self ) :
        self.N = int ( self.N )
        self.K = int ( self.K )
        self.L = int ( self.L )
        self.M = int ( self.M )
        start = max ( self.N , self.L )
        end = min ( self.K , self.M )
        print ( end - start < 0 )
