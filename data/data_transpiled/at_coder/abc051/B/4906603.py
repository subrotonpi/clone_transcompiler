def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        self.k = int ( self.k )
        self.s = int ( self.s )
        self.res = 0
        for x in range ( 0 , self.k ) :
            for y in range ( 0 , self.k ) :
                z = self.s - ( x + y )
                if 0 <= z <= self.k :
                    self.res += 1
        print ( self.res )
