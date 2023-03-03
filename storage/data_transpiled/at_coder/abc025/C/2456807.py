def _import ( board , turn ) :
    import sys
    import random
    import sys
    import random
    import string
    import string
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.board = board
            self.board = board
            self.sum = 0
        def run ( self ) :
            sc = string.split ( self.board )
            bs = [ ]
            cs = [ ]
            for i in range ( 2 ) :
                for j in range ( 3 ) :
                    bs [ i ].append ( sc.randint ( 0 , 1 ) )
            for i in range ( 3 ) :
                for j in range ( 2 ) :
                    cs [ i ].append ( sc.randint ( 0 , 1 ) )
            self.solve ( )
        def solve ( self ) :
            ans = self.rec ( [ ] , 1 )
            print ( ans )
            print ( sum - ans )
        def rec ( self , board , turn ) :
            if turn == 9 :
                for i in range ( 3 ) :
                    for j in range ( 3 ) :
                        if board [ i ] [ j ] == 0 :
                            board [ i ] [ j ] = 1
                            ret = self.calc ( board )
                            board [ i ] [ j ] = 0
                            return ret
            max = min = sys.maxint
            for i in range ( 3 ) :
                for j in range ( 3 ) :
                    if board [ i ] [ j ] == 0 :
                        board [ i ] [ j ] = 1 if turn % 2 == 1 else 2
                        score = self.rec ( board , turn + 1 )
                        max = max ( max , score )
                        min = min ( min , score )
                        board [ i ] [ j ] = 0 if turn % 2 == 1 else max
            return max
    def calc ( board ) :
        score = 0
        for i in range ( 2 ) :
            if board [ i ] [ j ] == board [ i ] [ j + 1 ] :
                score += cs [ i ] [ j ]
        return Score
