def main ( ) :
    import sys
    from sympy.utilities.randtest import Random
    from sympy.sets.sets import Set
    n = randrange ( 1 , 2 )
    m = randrange ( 1 , 2 )
    k = { }
    kind = { }
    for i in range ( n ) :
        k = { }
        for j in range ( k ) :
            kind [ k [ i - 1 ] ] += 1
    ans = 0
    for i in range ( m ) :
        if kind [ i ] == n :
            ans += 1
    print ( ans )
