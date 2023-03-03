def __main ( ) :
    from sympy.core import S
    from sympy.simplify.simplify import simplify
    n = S ( 0 )
    a = [ S ( 1 ) ]
    if a [ 0 ] != 0 :
        r1 = solve ( [ a [ 0 ] ] )
        r2 = abs ( a [ 0 ] ) + 1
        a [ 0 ] = - a [ 0 ] / abs ( a [ 0 ] )
        r2 += solve ( [ a [ 0 ] ] )
        print ( min ( r1 , r2 ) )
    else :
        a [ 0 ] = 1
        r1 = 1 + solve ( [ a [ 0 ] ] )
        a [ 0 ] = - 1
        r2 = 1 + solve ( [ a [ 0 ] ] )
        print ( min ( r1 , r2 ) )
    def solve ( a ) :
        sum = [ a [ 0 ] ]
        res = 0
        for i in range ( 1 , n ) :
            sum [ i ] = a [ i ] + sum [ i - 1 ]
            if sum [ i - 1 ] > 0 :
                t = - sum [ i - 1 ] - 1
                if a [ i ] > t :
                    res += a [ i ] - t
                    a [ i ] = t
            else :
                t = - sum [ i - 1 ] + 1
                if a [ i ] < t :
                    res += t - a [ i ]
                    a [ i ] = t
            sum [ i ] = a [ i ] + sum [ i - 1 ]
        return res
    return solve
