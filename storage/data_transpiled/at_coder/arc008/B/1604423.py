def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.M = sys.stdin.read ( )
        self.name = self.name
        self.kit = self.kit
        self.n = [ 0 ] * 26
        self.m = [ 0 ] * 26
        for nc in self.name :
            self.n [ nc - 'A' ] += 1
        for nk in self.kit :
            self.m [ nk - 'A' ] += 1
        an = int ( self.n )
        for target in self.name :
            count = 0
            if self.m [ target - 'A' ] == 0 :
                print ( - 1 )
                return
            if self.n [ target - 'A' ] % self.m [ target - 'A' ] == 0 :
                count = self.n [ target - 'A' ] / self.m [ target - 'A' ]
            else :
                count = self.n [ target - 'A' ] / self.m [ target - 'A' ] + 1
            an = max ( an , count )
        print ( an )
