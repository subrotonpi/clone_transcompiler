def main ( ) :
    import sys
    from numpy import abs
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.random import choice
    from numpy.random import choice
    from numpy.random import choice
    from numpy.random import choice
    from numpy.random import choice
    N = choice ( range ( N ) )
    a = choice ( range ( N ) )
    a.sort ( )
    min = 999999999
    for i in range ( a [ 0 ] , a [ N - 1 ] + 1 ) :
        cost = calc ( i , a )
        if min > cost :
            min = cost
    print ( min )
    def calc ( m , a ) :
        result = 0
        for i in range ( len ( a ) ) :
            result += abs ( ( a [ i ] - m ) ** 2 )
        return result
    return calc
