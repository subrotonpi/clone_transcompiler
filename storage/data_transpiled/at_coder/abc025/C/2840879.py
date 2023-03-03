def _import ( ) :
    import sys
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.b , self.c = [ ] , [ ]
        def main ( self ) :
            with open ( self.name , 'r' ) as f :
                sum = 0
                for y in range ( 2 ) :
                    for x in range ( 3 ) :
                        self.b [ y ] [ x ] = f.read ( )
                        sum += self.b [ y ] [ x ]
            for y in range ( 3 ) :
                for x in range ( 2 ) :
                    self.c [ y ] [ x ] = f.read ( )
                    sum += self.c [ y ] [ x ]
    board = [ ]
    for i in range ( 3 ) :
        board.append ( - 1 )
    score = eval ( [ ] , 1 )
    print ( score )
    print ( sum - score )
    def calc ( board , turn ) :
        if turn == 10 :
            return calc ( board )
        score = 0 if turn % 2 == 1 else sys.maxint
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
                    score += c [ y ] [ x ]
        return score
    return calc ( board )
