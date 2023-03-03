def import import os , M , WHITE , GRAY , BLACK , n , M
class Main ( object ) :
    def __init__ ( self ) :
        self.MAX = 10
        self.INF = 1 << 21
        self.WHITE = 0
        self.GRAY = 1
        self.BLACK = 2
        self.n = 10
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        self.H , self.W = self.H , self.W
        c = [ ]
        A = [ ]
        for i in range ( 10 ) :
            for j in range ( 10 ) :
                c.append ( [ ] )
        for i in range ( H ) :
            for j in range ( W ) :
                A.append ( [ ] )
        self.M = c
        d = [ ]
        for i in range ( 10 ) :
            if i == 1 :
                d.append ( 0 )
            else :
                d.append ( dijkstra ( i ) )
        sum = 0
        for i in range ( H ) :
            for j in range ( W ) :
                if A [ i ] [ j ] != - 1 and A [ i ] [ j ] != 1 :
                    sum += d [ A [ i ] [ j ] ]
        print ( sum )
    def dijkstra ( t ) :
        while True :
            minV = INF
            u = - 1
            for i in range ( n ) :
                if minV > d [ i ] and color [ i ] != BLACK :
                    u = i
                    minV = d [ i ]
            if u == - 1 :
                break
            if v == 1 :
                u = - 1
            if minV == 0 :
                u = - 1
            if minV == 0 :
                u = - 1
            if minV == 1 :
                u = - 1
            if minV == 1 :
                u = - 1
            if minV == 1 :
                u = - 1
            if minV == 1 :
                u = - 1
            if minV == 1 :
                u = - 1
            if minV == 1 :
                u = - 1
            if minV == 1 :
            INDENT