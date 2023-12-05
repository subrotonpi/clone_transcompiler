def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.b = [ ]
        self.c = [ ]
    def main ( self ) :
        sc = _main.raw_input ( )
        self.sum = 0
        for i in range ( 2 ) :
            for j in range ( 3 ) :
                self.b [ i ] [ j ] = sc.choice ( [ ] )
                self.sum += self.b [ i ] [ j ]
        for i in range ( 3 ) :
            for j in range ( 2 ) :
                self.c [ i ] [ j ] = sc.choice ( [ ] )
                self.sum += self.c [ i ] [ j ]
    board = [ ]
    for i in range ( 3 ) :
        for j in range ( 3 ) :
            board [ i ] [ j ] = '.'
    score = dfs ( 1 , board )
    print ( ( self.sum + score ) / 2 )
    print ( ( self.sum - score ) / 2 )
def dfs ( n , board ) :
    if n == 10 :
        sente = 0
        koute = 0
        for i in range ( 2 ) :
            for j in range ( 3 ) :
                if board [ i ] [ j ] == board [ i + 1 ] [ j ] :
                    sente += self.b [ i ] [ j ]
                else :
                    koute += self.b [ i ] [ j ]
        for i in range ( 3 ) :
            for j in range ( 2 ) :
                if board [ i ] [ j ] == board [ i ] [ j + 1 ] :
                    sente += self.c [ i ] [ j ]
                else :
                    koute += self.c [ i ] [ j ]
        return sente - koute
    else :
        if n % 2 == 0 :
            score = sys.maxsize
            for i in range ( 3 ) :
                for j in range ( 3 ) :
                    if board [ i ] [ j ] == '.' :
                        score = min ( score , self.b [ i ] [ j ] )
            return score
        