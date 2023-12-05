def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
    def __init__ ( self ) :
        self.P = [ ]
        for i in range ( self.N ) :
            self.P.append ( self.P [ i ] )
    def __init__ ( self ) :
        self.Q = [ ]
        for i in range ( self.N ) :
            self.Q.append ( self.Q [ i - 1 ] )
    cnt = 1
    ret = 1
    prev = self.Q [ 0 ]
    for i in range ( 1 , self.N ) :
        if self.Q [ i ] > prev :
            cnt += 1
        else :
            ret = max ( ret , cnt )
            cnt = 1
        prev = self.Q [ i ]
    ret = max ( ret , cnt )
    print ( self.N - ret )
