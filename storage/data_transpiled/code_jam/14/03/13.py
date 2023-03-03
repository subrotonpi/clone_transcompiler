def _import ( file , file ) :
    import os
    import sys
    import os
    class C :
        SAMPLE = False
        PROBLEM = 'C'
        INPUT = 'large'
        ID = '0'
        PATH = r'F:\software installation\-commandline-1.2-beta1\source\' \1'
        def __init__ ( self , * args ) :
            with file ( file , 'w' ) if SAMPLE else self.open ( file , 'r' )
    def output ( out , grid ) :
        for i in range ( len ( grid [ 0 ] ) ) :
            out.write ( grid [ i ] )
    out = file ( PATH + PROBLEM + '-' + INPUT + '-' + ID + '.out' )
    test = len ( file )
    for t in range ( 1 , test + 1 ) :
        print ( 'Case #' + str ( t ) + ':' , file = out )
        R = len ( file )
        C = len ( file )
        M = len ( file )
        grid = [ [ '*' ] * ( M - M ) for M in range ( R ) ]
        empty = R * C - M
        if R == 1 or C == 1 or empty == 1 :
            row = col = 0
            for i in range ( empty ) :
                grid [ row ] [ col ] = '.'
                col += 1
                if col == C :
                    row += 1
                    col = 0
            grid [ 0 ] [ 0 ] = 'c'
            output ( out , grid )
        elif empty == 2 or empty == 3 or empty == 5 or empty == 7 :
            print ( 'Impossible' , file = out )
        elif ( R == 2 or C == 2 ) and empty % 2 :
            print ( 'Impossible' , file = out )
        else :
            grid [ 0 ] [ 0 ] = '.'
            grid [ 0 ] [ 1 ] = '.'
            grid [ 1 ] [ 0 ] = '.'
            grid [ 1 ] [ 1 ] = '.'
            grid [ 1 ] [ 1 ] = '.'
