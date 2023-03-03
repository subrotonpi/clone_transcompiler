def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys.stdin
        self.H , self.W = self.sys.maxsize , self.sys.maxsize
    A = [ ]
    for i in range ( 8 ) :
        A.append ( sys.stdin.read ( ).decode ( 'utf-8' ) )
    count = 0
    for i in range ( H ) :
        for j in range ( W ) :
            if A [ i ] [ j ] == '#' :
                count += 1
    if count == H + W - 1 :
        print ( "Possible" )
    else :
        print ( "Impossible" )
