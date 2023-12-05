def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = len ( sys.argv )
    def main ( self ) :
        self.a1 = 2
        self.a2 = 1
        self.lucas = 3
        if self.N == 1 :
            print ( self.a2 )
        else :
            for i in range ( 1 , self.N ) :
                self.lucas = self.a1 + self.a2
                self.a1 = self.a2
                self.a2 = self.lucas
            print ( self.lucas )
