def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.L0 = 2
        self.L1 = 1
        n = len ( sys.argv )
        self.L0 = L0
        self.L1 = L1
        for i in range ( 2 , n + 1 ) :
            self.L0 = self.L0 + self.L1
            self.L1 = self.L0 + self.L1
        print ( self.L0 )
