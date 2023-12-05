def _ import _
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 3
        self.B = 1
        self.W = 2
        self.b = [ ]
        self.c = [ ]
    def getCopy ( self ) :
        sc = object.Scanner ( )
        for y in range ( self.N - 1 ) :
            for x in range ( self.N ) :
                self.b [ y ] [ x ] = sc.__next__ ( )
        for y in range ( self.N ) :
            for x in range ( self.N - 1 ) :
                self.c [ y ] [ x ] = sc.__next__ ( )
        sc.close ( )
        board = self.dfs ( [ ] , B )
        print ( self.getScore ( board , B ) )
        print ( self.getScore ( board , W ) )
    def dfs ( self , board , turn ) :
        max_score = - 1
        max_board = None
        for y in range ( self.N ) :
            for x in range ( self.N ) :
                if board [ y ] [ x ] == 0 :
                    next = self.getCopy ( board )
                    next [ y ] [ x ] = turn
                    last = self.dfs ( next , W if turn == self.B else self.B )
                    score = self.getScore ( last , turn )
                    if score > max_score :
                        max_score = score
                        max_board = self.getCopy ( last )
        return max_board or board
    def getScore ( self ) :
        score = 0
        for y in range ( self.N - 1 ) :
            for x in range ( self.N ) :
                if board [ y ] [ x ] == 0 :
                    continue
                if turn == self.W and board [ y ] [ x ] != board [ y + 1 ] [ x ] :
                    score += self.b [ y ] [ x ]
                if turn == self.B and board [ y ] [ x ] == board [ y + 1 ] [ x ] :
                    score += self.c [ y ] [ x ]
        return score
