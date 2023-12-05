def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.k = int ( self.k )
    def sample ( self ) :
        nums = [ _main ( self ) for _ in range ( self.n ) ]
        nums = [ _main ( self ) for _ in nums ]
        nums = [ _main ( self ) for _ in nums ]
        output = 0
        for i in range ( self.k ) :
            if nums [ self.n - self.k + i ] > output :
                output = ( nums [ self.n - self.k + i ] + output ) / 2
        print ( output )
