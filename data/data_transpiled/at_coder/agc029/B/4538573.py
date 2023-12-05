def main ( ) :
    import sys
    from numpy.linalg import eigs
    from numpy.random import seed
    sc = seed ( )
    N = len ( eigs )
    A = [ ]
    d = { }
    for i in range ( N ) :
        A.append ( sc.random ( ) )
        if A [ i ] in d :
            d [ A [ i ] ] = 1 + d [ A [ i ] ]
        else :
            d [ A [ i ] ] = 1
    A.sort ( )
    ret = 0
    for i in range ( N - 1 , - 1 , - 1 ) :
        if d [ A [ i ] ] == 0 :
            continue
        d [ A [ i ] ] = d [ A [ i ] ] - 1
        k2 = 2 * seed ( A [ i ] )
        diff = k2 - A [ i ]
        if diff in d and d [ diff ] > 0 :
            d [ diff ] = d [ diff ] - 1
            ret += 1
    print ( ret )
