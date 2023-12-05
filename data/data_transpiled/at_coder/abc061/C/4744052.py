def _import ( ) :
    import sys
    from time import sleep
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import chain
    N = len ( chain ( [ 0 ] , repeat ( N ) ) )
    K = chain ( [ 0 ] , repeat ( N ) )
    d = defaultdict ( int )
    for i in chain ( range ( N ) , repeat ( N ) ) :
        a = chain ( [ 0 ] , repeat ( a ) )
        b = chain ( [ 0 ] , repeat ( a ) )
        if a in d :
            b += d [ a ]
        d [ a ] += b
    for key , value in d.items ( ) :
        K -= int ( value )
        if K <= 0 :
            sys.stdout.write ( key )
            return
