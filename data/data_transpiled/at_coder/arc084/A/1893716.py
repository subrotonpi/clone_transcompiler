def _import ( ) :
    from itertools import chain
    from itertools import chain
    N = len ( chain ( [ 0 ] , repeat ( N ) ) )
    A , B , C = zip ( * chain ( [ loading ( i ) for i in range ( N ) ] ) )
    BbtC = [ 0 ] * N
    Cindex = 0
    for i in range ( N ) :
        while Cindex < N and C [ Cindex ] <= B [ i ] :
            Cindex += 1
        BbtC [ i ] = N - Cindex
    for i in range ( N - 1 , 0 , - 1 ) :
        BbtC [ i - 1 ] += BbtC [ i ]
    ans = 0
    Bindex = 0
    for i in range ( N ) :
        while Bindex < N and B [ Bindex ] <= A [ i ] :
            Bindex += 1
        ans += ( Bindex < N )
    print ( ans )
    def loading ( N ) :
        return chain ( [ N ] , repeat ( N ) )
    return loading
