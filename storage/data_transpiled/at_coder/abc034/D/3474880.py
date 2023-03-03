def main ( ) :
    import numpy
    from numpy.linalg import solve
    from numpy.random import random
    n , k = random.randint ( 1 , 5 )
    w = [ ]
    p = [ ]
    pmax = random.random ( n )
    pmax = max ( pmax , p )
    low = upp = pmax
    x = ( low + upp ) / 2
    while upp - low > 0.00000001 :
        c = [ ]
        for i in range ( n ) :
            c.append ( w [ i ] * ( p [ i ] - x ) )
        c.sort ( )
        c = [ ]
        for i in range ( n - 1 , n - k , - 1 ) :
            c.append ( c [ i ] )
        if c :
            low = x
            x = ( low + upp ) / 2
        else :
            upp = x
            x = ( low + upp ) / 2
    print ( x )
