def _main ( * args ) :
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    from itertools import chain
    MODULO = 1_000_000_000 + 7
    def tr ( * args ) :
        with chain ( chain ( * args ) ) :
            n , m = chain ( * args )
            l = chain ( [ 0 ] , [ ] )
            r = chain ( [ 0 ] , [ ] )
            x = chain ( [ 0 ] , [ ] )
            for a , b in itertools.izip ( l , r ) :
                if b in x :
                    x [ b ] = 0
    ans = 0
    for a , b in itertools.izip ( * repeat ( n ) ) :
        ans += chain ( [ a , b ] , [ ] )
    for i in chain ( 1 , n + 1 ) :
        if i != 1 :
            for a in range ( i - 1 ) :
                for b in range ( i - 1 ) :
                    chain ( [ a , b ] , [ add ( a , b ) ] )
    return ans
