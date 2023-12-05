def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.h = [ ]
        for i in range ( self.n ) :
            self.h.append ( sys.stdin.read ( ) )
    answer = 0
    for i in range ( self.n ) :
        while h [ i ] != 0 :
            answer += 1
            for j in range ( self.n ) :
                if h [ j ] <= 0 :
                    break
                else :
                    h [ j ] -= 1
    print ( answer )
