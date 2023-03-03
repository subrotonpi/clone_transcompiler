def main ( args ) :
    import os
    from numpy import arange
    from numpy.core import zeros
    from numpy.core import dictionary
    from numpy.core import defaultdict
    from numpy.core import zeros
    from numpy.core import dot
    N = len ( args )
    A = zeros ( N )
    B = zeros ( N )
    d = { }
    for i in range ( N ) :
        A [ i ] = dot ( A [ i ] , B [ i ] )
    A = [ A [ i ] for i in range ( N ) ]
    for i in range ( N ) :
        d [ A [ i ] ] = i
    ans = 0
    for i in range ( N ) :
        if i % 2 != d [ B [ i ] ] % 2 :
            ans += 1
    print ( ans / 2 )
