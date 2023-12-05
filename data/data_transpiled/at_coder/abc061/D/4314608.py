def main ( ) :
    import sys
    from numpy import zeros
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.random import uniform
    from numpy.random import uniform
    n = randint ( 1 , n )
    m = randint ( 1 , n )
    edge = [ [ randint ( - 1 , n ) , randint ( - 1 , n ) ] for i in range ( m ) ]
    edge = [ [ randint ( - 1 , n ) , randint ( - 1 , n ) ] for i in range ( m ) ]
    d = bellman_ford ( n , edge , 0 )
    if not d :
        print ( 'inf' )
    else :
        print ( - d [ n - 1 ] )
    sys.exit ( 1 )
