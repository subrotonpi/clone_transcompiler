def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.limit = sys.stdin.read ( )
        min , c , t = 1001 , c , t
        for i in range ( n ) :
            c , t = sys.stdin.read ( )
            if t <= limit and min > c :
                min = c
        if min == 1001 :
            print ( "TLE" )
        else :
            print ( min )
