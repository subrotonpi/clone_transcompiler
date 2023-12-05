def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = len ( sys.argv )
        self.r_count = 0
        self.b_count = 0
        for i in range ( self.n ) :
            s = sys.argv [ i ]
            for c in s :
                if c == 'R' :
                    self.r_count += 1
                elif c == 'B' :
                    self.b_count += 1
        if self.r_count > self.b_count :
            print ( "TAKAHASHI" )
        elif self.r_count < self.b_count :
            print ( "AOKI" )
        else :
            print ( "DRAW" )
