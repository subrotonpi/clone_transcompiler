def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.M = int ( self.M )
        self.P = int ( self.P )
        self.Q = int ( self.Q )
        self.R = int ( self.R )
        self.value = [ [ 0 for i in range ( self.N ) ] for j in range ( self.M ) ]
    def __init__ ( self ) :
        self.value = [ [ 0 for i in range ( self.R ) ] for j in range ( self.N ) ]
    def main ( self ) :
        self.value.append ( [ 0 for i in range ( self.N ) ] )
    def main ( self ) :
        for x , y , z in self.value :
            self.value [ x - 1 , y - 1 ] = z
    happy = 0
    for i in range ( 1 , int ( math.pow ( 2 , self.N ) ) ) :
        girl = [ 0 ] * self.N
        countg = 0
        for j in range ( self.N ) :
            if i & ( 1 << j ) :
                countg += 1
                girl [ j ] = 1
        if countg == self.P :
            temp = [ 0 ] * self.M
            for j in range ( self.M ) :
                for k in range ( self.N ) :
                    if girl [ k ] == 1 :
                        temp [ j ] += self.value [ k ] [ j ]
            temp = [ 0 ] * self.M
            s = 0
            for j in range ( self.Q ) :
                s += temp [ self.M - 1 - j ]
            happy = max ( happy , s )
    print ( happy )
