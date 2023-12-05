def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.M = sys.stdin.read ( )
        self.P = sys.stdin.read ( )
        self.Q = sys.stdin.read ( )
        self.R = sys.stdin.read ( )
        self.x = [ ]
        self.y = [ ]
        self.z = [ ]
        self.score = [ ]
        for i in range ( R ) :
            self.x.append ( self.x [ i ] - 1 )
            self.y.append ( self.y [ i ] - 1 )
            self.z.append ( self.z [ i ] )
            self.score [ self.x [ i ] ] [ self.y [ i ] ] = self.z [ i ]
    happy = 0
    for i in range ( 1 , int ( math.pow ( 2 , N ) ) ) :
        girl = [ ]
        countg = 0
        for j in range ( N ) :
            if i & ( 1 << j ) :
                countg += 1
                girl.append ( 1 )
        if countg == P :
            temp = [ 0 ] * M
            for j in range ( M ) :
                for k in range ( N ) :
                    if girl [ k ] == 1 :
                        temp [ j ] += self.score [ k ] [ j ]
            temp = [ 0 ] * M
            s = 0
            for j in range ( Q ) :
                s += temp [ M - 1 - j ]
            happy = max ( happy , s )
    print ( happy )
