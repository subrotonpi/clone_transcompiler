def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.L = 0
        self.L_max = 0
        for i in range ( self.n ) :
            l = sys.stdin.readline ( )
            self.L += l
            self.L_max = max ( self.L_max , l )
        if self.L_max < L - self.L_max :
            self.print ( "Yes" )
        else :
            self.print ( "No" )
