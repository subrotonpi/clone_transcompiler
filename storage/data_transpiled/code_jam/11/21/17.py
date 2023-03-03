def _solve_one ( prefix ) :
    import sys
    from os import urandom
    import random
    class R1 ( object ) :
        def __init__ ( self , f , prefix ) :
            self.f = open ( 'A.in' , 'w' )
            self.n_tests = randint ( 1 , len ( self.n_tests ) + 1 )
            for i in range ( self.n_tests ) :
                line = next ( self )
                for j in range ( self.n_tests ) :
                    c = line [ j ]
                    if c == '0' :
                        self.g [ i ] [ j ] = - 1
                        self.g [ j ] [ i ] = 1
                    elif c == '1' :
                        self.g [ i ] [ j ] = 1
                        self.g [ j ] [ i ] = - 1
        def f ( self ) :
            return int ( self.next ( ) )
        def f ( self ) :
            return float ( self.next ( ) )
    wp = [ ]
    owp = [ ]
    oowp = [ ]
    wpx = [ ]
    for i in range ( self.n_tests ) :
        count = 0
        sum = 0
        for j in range ( self.n_tests ) :
            if g [ i ] [ j ] != 0 :
                count += 1
                if g [ i ] [ j ] == 1 :
                    sum += 1
        wp.append ( float ( sum ) / count )
        for j in range ( self.n_tests ) :
            if g [ i ] [ j ] == 0 :
                wpx.append ( wp [ i ] )
            else :
                wpx.append ( float ( sum - ( g [ i ] [ j ] == 1 ) ) / ( count - 1 ) )
    for i in range ( self.n_tests ) :
        out = open ( 'A.out' , 'w' )
        out.write ( '%s\n' % ( prefix ) )
        out.close ( )
