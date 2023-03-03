def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.a = [ ]
        self.s1 = [ ]
        self.s2 = [ ]
        self.cnt = 0
        self.b = [ ]
        self.c = [ ]
        self.g = [ ]
    def main ( self ) :
        self.a = [ ]
        self.s1.append ( self.b [ 0 ] )
        self.s2.append ( self.c [ 0 ] )
        self.cnt += 1
        self.b = [ ]
        self.c = [ ]
        self.g.append ( self.g [ 0 ] )
    def score ( self ) :
        for i in range ( 2 ) :
            for j in range ( 3 ) :
                self.b [ i ] [ j ] = self.s1 [ i ]
                self.cnt += 1
        for i in range ( 3 ) :
            for j in range ( 2 ) :
                self.c [ i ] [ j ] = self.s1 [ i ]
                self.cnt += 1
        self.c = [ ]
        self.g.append ( self.c [ 0 ] )
    def score ( self ) :
        for i in range ( 3 ) :
            for j in range ( 3 ) :
                self.a [ i ] [ j ] = '*'
        score = self.minimax ( 0 )
        print ( score )
        print ( self.sum - score )
    def minimax ( self ) :
        if self.depth == 9 :
            return self.score ( )
        if self.depth % 2 == 0 :
            max = - 1
            for i in range ( 3 ) :
                for j in range ( 3 ) :
                    if self.a [ i ] [ j ] != '*' :
                        continue
                    self.a [ i ] [ j ] = 'o'
                    max = max ( max , self.minimax ( depth + 1 ) )
                    self.a [ i ] [ j ] = '*'
            return max
        else :
            min = sys.maxsize
            for i in range ( 3 ) :
                for j in range ( 3 ) :
                    if self.a [ i ] [ j ]