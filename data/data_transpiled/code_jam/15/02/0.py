def main ( * orange ) :
    import sys
    import random
    import sys
    class B ( object ) :
        def __init__ ( self ) :
            self.orange = orange
    input = sys.stdin
    num_cases = input.readline ( ).strip ( )
    for n in range ( num_cases ) :
        N = input.readline ( ).strip ( )
        ps = [ random.randint ( 1 , 100 ) for _ in range ( N ) ]
        counts = [ 0 ] * 1005
        for p in ps :
            counts [ p ] += 1
        min = 10000
        for lim in range ( 1 , len ( counts ) + 1 ) :
            moves = 0
            for i in counts :
                moves += ( ( i - 1 ) / lim ) * counts [ i ]
            if moves + lim < min :
                min = moves + lim
        sys.stdout.write ( "Case #%d: %d\n" % ( n + 1 , min ) )
