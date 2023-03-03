def import sys , glob
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.M = sys.stdin.read ( )
        self.a = glob.glob ( "*." )
        self.used = [ False for i in range ( self.M + 1 ) ]
        for i in range ( self.M - 1 , - 1 , - 1 ) :
            if self.used [ self.a [ i ] ] is not True :
                self.used [ self.a [ i ] ] = True
                print ( self.a [ i ] )
        for i in range ( self.M + 1 ) :
            if self.used [ i ] is not True :
                print ( i )
