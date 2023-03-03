def _import ( ) :
    from itertools import product , repeat
    from itertools import chain , repeat
    from itertools import chain , repeat
    N = len ( chain ( * repeat ( repeat ( ) ) ) )
    A = chain ( range ( N ) , repeat ( N ) )
    xor = chain ( range ( N ) , repeat ( N ) )
    sum = chain ( range ( N ) , repeat ( N ) )
    ans = 0
    t = - 1
    for i in range ( N ) :
        while t < i and sum [ i ] - ( t if t >= 0 else 0 ) != ( xor [ i ] ^ ( t if t >= 0 else 0 ) ) :
            t += 1
        ans += i - t
    print ( ans )
    def tr ( * args ) :
        print ( chain ( * args ) )
    return tr
