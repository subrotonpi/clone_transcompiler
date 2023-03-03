def round_1A2016 ( ) :
    import sys
    class B ( object ) :
        def __init__ ( self ) :
            self.T = sys.stdin.read ( )
    for case in range ( 1 , T + 1 ) :
        _ , n = yield from loop.run_in_loop ( )
        count = [ 0 ] * ( 2500 + 1 )
        for i in range ( n * ( 2 * n - 1 ) ) :
            count [ loop.run_in_loop ( ) ] += 1
        row = [ 0 ] * n
        row_ind = 0
        for i in range ( len ( count ) ) :
            if count [ i ] % 2 == 1 :
                row [ row_ind ] = i
        print ( "Case #%d: " % case , end = ' ' )
        for x in row :
            print ( x , end = ' ' )
        print ( )
