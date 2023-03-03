def _import ( ) :
    import os
    import sys
    import os
    import math
    import os
    import os
    import sys
    import random
    class C ( ) :
        def __init__ ( self ) :
            self.input , self.output = sys.argv [ 1 ] , sys.argv [ 2 ]
    with open ( os.path.join ( os.path.dirname ( __file__ ) , "input.txt" ) , "w" ) as f :
        f.write ( "Case #%d: " % ( Case ) )
        M , N = random.randint ( 1 , M ) , random.randint ( 1 , N )
        max = min ( M , N )
        board = [ [ - 1 ] * ( M + 1 ) for i in range ( M ) ]
        for i in range ( M ) :
            b = int ( f.read ( ) , 16 )
            two = int ( "%d" % ( M + 1 ) )
            for j in range ( N ) :
                if b % two == 0 :
                    board [ i ] [ N - 1 - j ] = 0
                else :
                    board [ i ] [ N - 1 - j ] = 1
                b = b / two
        found = [ 0 ] * ( max + 1 )
        count = 0
        for i in range ( max ) :
            find ( i )
            if found [ i ] > 0 :
                count += 1
        f.write ( "%d" % count )
        for i in range ( max ) :
            if found [ i ] > 0 :
                f.write ( "%d %d\n" % ( i , found [ i ] ) )
            f.write ( "\n" )
