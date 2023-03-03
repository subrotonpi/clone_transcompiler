def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys
        self.H , self.W = self.H , self.W
        w = 0
        for i in range ( self.H ) :
            map = self.map [ i ]
            for j in range ( self.W ) :
                if map [ j ] == '#' and w <= j :
                    w = j
                elif map [ j ] == '#' and w > j :
                    print ( "Impossible" )
                    return
        print ( "Possible" )
