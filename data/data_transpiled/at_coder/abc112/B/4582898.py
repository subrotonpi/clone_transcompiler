def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.t = sys.stdin.read ( )
        self.min_cost = 1001
        for i in range ( self.n ) :
            cost = self.cost
            time = self.time
            if t >= time :
                if self.min_cost > cost :
                    self.min_cost = cost
        if self.min_cost == 1001 :
            print ( "TLE" )
        else :
            print ( self.min_cost )
