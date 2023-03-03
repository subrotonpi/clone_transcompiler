def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.B , self.C = [ ] , [ ]
        def read ( self ) :
            self.B = [ ]
            self.C = [ ]
            for i in range ( 2 ) :
                for j in range ( 3 ) :
                    self.B.append ( self.read ( ) )
                    self.sum += self.B [ i ] [ j ]
            self.C = [ ]
            for i in range ( 3 ) :
                for j in range ( 2 ) :
                    self.C.append ( self.read ( ) )
                    self.sum += self.C [ i ] [ j ]
            ans = self.rec ( [ ] , 1 )
            print ( ans )
            print ( self.sum - ans )
        def rec ( self , board , turn ) :
            if turn == 9 :
                for i in range ( 3 ) :
                    for j in range ( 3 ) :
                        if board [ i ] [ j ] == 0 :
                            board [ i ] [ j ] = 1 if self.board [ i ] [ j ] == 1 else 2
                            score = self.calc ( board )
                            self.board [ i ] [ j ] = 0
                            return score
            max = min = sys.maxint
            for i in range ( 3 ) :
                for j in range ( 3 ) :
                    if board [ i ] [ j ] == 0 :
                        board [ i ] [ j ] = 1 if self.board [ i ] [ j ] == 1 else 2
                        score = self.rec ( board , turn + 1 )
                        max = max ( max , score )
                        min = min ( min , score )
                        self.board [ i ] [ j ] = 0
            return max if self.board [ i ] [ j ] == 1 else min
    return Main
