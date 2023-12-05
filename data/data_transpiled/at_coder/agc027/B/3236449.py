def main ( ) :
    import sys
    from numpy.core import farray
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.core import farray
    from numpy.random import rand
    N = randint ( 1 , N )
    X = rand ( N )
    x = [ randint ( 0 , N ) for _ in range ( N ) ]
    reverse ( x )
    sum = 0
    xcum = [ ]
    for i in range ( N + 1 ) :
        sum += x [ i ]
        xcum.append ( sum )
    min = float ( 'inf' )
    for k in range ( 1 , N + 1 ) :
        e = compute ( xcum , k , N )
        if e < 0 :
            continue
        e += k * X
        e += N * X
        if min > e :
            min = e
    print ( min )
    def compute ( xcum , k , N ) :
        e = 0
        co = 5
        for i in range ( ( N - 1 ) // k + 1 ) :
            if i > 1 :
                co += 2
            e += co * ( xcum [ min ( k * ( i + 1 ) , len ( xcum ) - 1 ) ] - xcum [ k * i ] )
            if e < 0 :
                return - 1
        return e
    def reverse ( x ) :
        left = 0
        right = len ( x ) - 1
        while left < right :
            tmp = x [ left ]
            x [ left ] = x [ right ]
            x [ right ] = tmp
            left += 1
            right -= 1
        return x
    return compute ( reverse , x )
