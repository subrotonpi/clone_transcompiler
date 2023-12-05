def main ( ) :
    import sys
    from itertools import chain
    from itertools import chain
    from random import randint
    from itertools import chain
    from itertools import chain
    from itertools import chain
    N = randint ( 1 , N )
    mae = chain ( [ ] , chain ( [ ] , chain ( [ x1 , x2 ] , [ x2 , x1 ] ) ) )
    ato = chain ( ( x1 , x2 ) for x1 , x2 in chain ( [ x1 , x2 ] , chain ( [ x1 , x2 ] , [ x2 , x1 ] ) ) )
    mae_sum = [ 0 ] * ( N + 1 )
    ato_sum = [ 0 ] * ( N + 1 )
    ans = sum ( [ ] )
    A = chain ( [ ] , chain ( [ ] , chain ( [ ] , [ ] ) ) )
    for i in range ( N * 3 ) :
        a = randint ( 1 , N )
        A [ i ] = a
        if i < N :
            mae.append ( a )
            mae_sum [ 0 ] += a
        elif i >= N * 2 :
            ato.append ( a )
            ato_sum [ N ] += a
    for i in range ( N , N * 2 ) :
        k = i - ( N - 1 )
        if A [ i ] > mae.peek ( ) :
            mae_sum [ k ] = mae_sum [ k - 1 ] - mae.pop ( ) + A [ i ]
            mae.append ( A [ i ] )
        else :
            mae_sum [ k ] = mae_sum [ k - 1 ]
    for i in range ( N * 2 - 1 , - 1 , - 1 ) :
        k = i - N
        if A [ i ] < ato.peek ( ) :
            ato_sum [ k ] = ato_sum [ k + 1 ] - ato.pop ( ) + A [ i ]
            ato.append ( A [ i ] )
        else :
            ato_sum [ k ] = ato_sum [ k + 1 ]
    for i in range ( 0 , N ) :
        ans = max ( ans , mae_sum [ i ] - ato_sum [ i ] )
    print ( ans )
    sys.exit ( 0 )
