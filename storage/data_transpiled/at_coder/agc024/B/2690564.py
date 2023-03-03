def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.Q = [ ]
        for i in range ( self.N + 1 ) :
            tmp = sys.stdin.read ( )
            self.Q.append ( i )
    tmp = 0
    anstmp = 1
    for i in range ( 2 , self.N + 1 ) :
        if self.Q [ i ] > self.Q [ i - 1 ] :
            anstmp += 1
        else :
            tmp = max ( tmp , anstmp )
            anstmp = 1
    tmp = max ( tmp , anstmp )
    print ( N - tmp )
