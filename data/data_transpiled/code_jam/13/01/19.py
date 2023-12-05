def qual ( board , sx , sy , dx , dy , c ) :
    import sys
    from itertools import chain
    tn = 0
    cn = 0
    for i in range ( 4 ) :
        nx = sx + dx * i
        ny = sy + dy * i
        b = board [ ny ] [ nx ]
        if b == 'T' :
            tn += 1
        if b == c :
            cn += 1
    if cn == 4 :
        return True
    if cn == 3 and tn == 1 :
        return True
    return False
    def win ( board , c ) :
        for row in range ( len ( board ) ) :
            if win ( board [ : , row ] , 1 , 0 , c ) :
                return True
        for col in range ( len ( board ) ) :
            if win ( board [ : , col ] , 0 , 0 , 1 , c ) :
                return True
        if win ( board [ : , 0 ] , 1 , 1 , c ) :
            return True
        if win ( board [ : , 3 ] , 1 , - 1 , c ) :
            return True
        return False
    def get_status ( board ) :
        if win ( board , 'X' ) :
            return 'X won'
        if win ( board , 'O' ) :
            return 'O won'
        for arr in board :
            for c in arr :
                if c == '.' :
                    return 'Game has not completed'
        return 'Draw'
    def main ( ) :
        with open ( '/tmp/' ) as sc :
            tn = len ( sc.read ( ) )
            for i in range ( 1 , tn + 1 ) :
                board = [ ]
                for r in range ( 4 ) :
                    board.append ( sc.read ( ).decode ( 'utf-8' ) )
                print ( 'Case #%d: %s\n' % ( i , get_status ( board ) ) )
    main ( )
