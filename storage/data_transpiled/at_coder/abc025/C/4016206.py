def _import ( ) :
    from math import sin , cos , pow
    class Main ( object ) :
        def __init__ ( self ) :
            self.b = [ [ ] for x in range ( 2 ) ]
            self.c = [ [ ] for x in range ( 3 ) ]
        def __call__ ( self , * args ) :
            sc = sys.stdin
            sum = 0
            for y in range ( 2 ) :
                for x in range ( 3 ) :
                    self.b [ y ] [ x ] = sc.randint ( 0 , 1 )
                    sum += self.b [ y ] [ x ]
            for y in range ( 3 ) :
                for x in range ( 2 ) :
                    self.c [ y ] [ x ] = sc.randint ( 0 , 1 )
                    sum += self.c [ y ] [ x ]
    board = [ ]
    for i in range ( 3 ) :
        board.append ( [ - 1 ] )
    score = eval ( [ 1 ] * 3 )
    print ( score )
    print ( sum - score )
    def calc ( board , turn ) :
        if turn == 10 :
            return calc ( board )
        score = 0 if turn % 2 == 1 else sys.maxsize
        for y in range ( 3 ) :
            for x in range ( 3 ) :
                if board [ y ] [ x ] == 0 :
                    board [ y ] [ x ] = 1 + ( turn % 2 )
                    if turn % 2 == 1 :
                        score = max ( score , eval ( board , turn + 1 ) )
                    else :
                        score = min ( score , eval ( board , turn + 1 ) )
                    board [ y ] [ x ] = 0
        return score
    def calc ( board ) :
        score = 0
        for y in range ( 2 ) :
            for x in range ( 3 ) :
                if board [ y ] [ x ] == board [ y + 1 ] [ x ] :
                    score += b [ y ] [ x ]
        for y in range ( 3 ) :
            for x in range ( 2 ) :
                if board [ y ] [ x ] == board [ y + 1 ] [ x ] :
                    score += c [ y ] [ x