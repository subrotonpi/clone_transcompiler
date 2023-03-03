def import _calc
class Main ( object ) :
    def __init__ ( self ) :
        sc = _calc
        def __init__ ( self ) :
            self.board = [ ]
            self.b = [ ]
            self.a = [ ]
        def main ( self ) :
            sum = 0
            for i in range ( 2 ) :
                for j in range ( 3 ) :
                    self.b [ i ] [ j ] = sc.__next__ ( )
                    sum += self.b [ i ] [ j ]
            for i in range ( 3 ) :
                for j in range ( 2 ) :
                    self.a [ i ] [ j ] = sc.__next__ ( )
                    sum += self.a [ i ] [ j ]
            chokudai = self.dfs ( 0 )
            print ( chokudai )
            print ( sum - chokudai )
        def dfs ( self ) :
            if self.turn == 9 :
                return self.calc ( )
            if self.turn % 2 == 0 :
                max = sum
                for i in range ( 3 ) :
                    for j in range ( 3 ) :
                        if self.board [ i ] [ j ] != 0 :
                            continue
                        self.board [ i ] [ j ] = 1
                        max = max ( max , self.dfs ( self.turn + 1 ) )
                        self.board [ i ] [ j ] = 0
                return max
            else :
                min = sum
                for i in range ( 3 ) :
                    for j in range ( 3 ) :
                        if self.board [ i ] [ j ] != 0 :
                            continue
                        self.board [ i ] [ j ] = - 1
                        min = min ( min , self.dfs ( self.turn + 1 ) )
                        self.board [ i ] [ j ] = 0
                return min
return Main
