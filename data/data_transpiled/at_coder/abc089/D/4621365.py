def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.random import uniform
    from numpy.random import uniform
    from numpy.random import uniform
    from numpy.random import uniform
    from numpy.random import uniform
    from numpy.random import uniform
    h , w , d = uniform ( 0 , uniform ( 0 , 1 ) )
    ar = [ ]
    ans = [ ]
    for i in range ( 1 , h * w + 1 ) :
        for j in range ( 1 , w ) :
            ar.append ( uniform ( i , j ) )
    for i in range ( 1 , h * w + 1 ) :
        if i <= d :
            ans.append ( 0 )
        else :
            ans [ i - 1 ] += ans [ i - 1 - d ] + abs ( ar [ i ] [ 0 ] - ar [ i - d ] [ 0 ] ) + abs ( ar [ i ] [ 1 ] - ar [ i - d ] [ 1 ] )
    q = uniform ( 0 , 1 )
    ans1 = [ ]
    for l , r in solve ( q ) :
        ans1.append ( ans [ r - 1 ] - ans [ l - 1 ] )
    for i in range ( q ) :
        print ( ans1 [ i ] )
