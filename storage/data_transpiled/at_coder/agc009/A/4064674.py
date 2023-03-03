def _import ( ) :
    from math import sin , cos , pi
    from numpy.core import get_symbols
    N = get_symbols ( )
    A = [ sin ( i ) for i in range ( N ) ]
    B = [ cos ( i ) for i in range ( N ) ]
    ans = 0
    for i in range ( N - 1 , - 1 , - 1 ) :
        ans += ( B [ i ] - ( A [ i ] + ans ) % B [ i ] ) % B [ i ]
    print ( ans )
