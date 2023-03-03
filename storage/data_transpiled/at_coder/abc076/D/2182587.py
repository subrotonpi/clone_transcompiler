def main ( ) :
    import sys
    from numpy import linspace
    from numpy.core import zeros
    from numpy.core import copy_reg
    from numpy.random import seed
    seed ( )
    N = len ( sys.argv )
    t = [ ]
    v = [ ]
    for i in range ( N ) :
        t.append ( np.linspace ( 0 , 1 , N ) )
    for i in range ( N ) :
        v.append ( np.linspace ( 0 , 1 , N ) )
    seed ( )
    v [ N - 1 ] = min ( v [ N - 1 ] , t [ N - 1 ] )
    for i in range ( N - 2 , - 1 , - 1 ) :
        v [ i ] = min ( v [ i ] , v [ i + 1 ] + t [ i ] )
    ans = 0
    current = 0
    for i in range ( N ) :
        next = 0 if i == N - 1 else v [ i ] < v [ i + 1 ]
        maxV = previous = current
        if current + t [ i ] <= next :
            maxV = current + t [ i ]
            current = maxV
        else :
            maxV = min ( v [ i ] , ( current + next + t [ i ] ) / 2 )
            ans -= ( maxV - next ) ** 2
            current = next
        ans += maxV * t [ i ]
        ans -= ( maxV - previous ) ** 2
    print ( ans )
