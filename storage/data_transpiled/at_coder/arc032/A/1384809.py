def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.N = self.s.count ( )
        if self.N == 1 :
            print ( "BOWWOW" )
            return
        self.N = self.N * ( self.N + 1 ) / 2
        for i in range ( 2 , self.N ) :
            if self.N % i == 0 :
                print ( "BOWWOW" )
                return
        print ( "WANWAN" )
