def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import seed
    from numpy.random import seed
    from numpy.random import seed
    seed ( )
    N = seed ( )
    l = [ ]
    l.append ( 0 )
    l.append ( 2 )
    l.append ( 1 )
    for i in range ( 2 , N + 1 ) :
        l_i = l [ i - 1 ] + l [ i - 2 ]
        l.append ( l_i )
    print ( l [ N ] )
