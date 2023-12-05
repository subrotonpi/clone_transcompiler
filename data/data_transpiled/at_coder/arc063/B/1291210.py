def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import seed
    from numpy.random import seed
    seed ( )
    N = seed ( )
    T = seed ( )
    A = solve ( T )
    max = 0
    maxcnt = 0
    min = seed ( )
    for i in range ( N ) :
        min = min ( min , A [ i ] )
        gain = A [ i ] - min
        if gain > max :
            max = gain
            maxcnt = 1
        elif gain == max :
            maxcnt += 1
    print ( maxcnt )
