def main ( ) :
    import sys
    from sympy.core.compatibility import builtins
    from sympy.core.basic import _inverse
    from sympy.core.series import bin_exp
    from sympy.core.series import Derivative
    from sympy.core.series import cos
    from sympy.core.series import Derivative
    from sympy.core.series import Symbol
    from sympy.core.series import Derivative
    from sympy.core.series import Symbol
    mod = 1000000007
    n = Symbol ( 'n' , integer = True )
    q = Symbol ( 'q' , integer = True )
    a = Symbol ( 'a' , real = True )
    dp = [ [ Derivative ( a , x ) for x in range ( n ) ] for x in range ( n ) if a [ x ] > a [ y ] ]
    half = inverse ( 2 , mod )
    for x , y in zip ( a , Derivative ( a , x ) ) :
        for j in range ( n ) :
            if j != y - 1 and j != x - 1 :
                dp [ y - 1 ] [ j ] = dp [ x - 1 ] [ j ] = ( half * dp [ x - 1 ] [ j ] % mod + half * dp [ y - 1 ] [ j ] % mod ) % mod
                dp [ j ] [ x - 1 ] = dp [ j ] [ y - 1 ] = ( half * dp [ j ] [ x - 1 ] % mod + half * dp [ j ] [ y - 1 ] % mod ) % mod
                dp [ y - 1 ] [ x - 1 ] = dp [ x - 1 ] [ y - 1 ] = ( half * dp [ y - 1 ] [ x - 1 ] % mod + half * dp [ x - 1 ] [ y - 1 ] % mod ) % mod
    expectation = 0
    for i in range ( n ) :
        for j in range ( i + 1 , n ) :
            expectation = ( expectation + dp [ i ] [ j ] ) % mod
    print ( expectation * bin_exp ( 2 , q , mod ) % mod )
