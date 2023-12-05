def main ( ) :
    import sys
    from collections import defaultdict
    from os import urandom
    from os import urandom
    from os import urandom
    from os.path import expanduser
    from os.path import expanduser
    from os.path import join
    from os.path import join
    from os.path import expanduser
    from os.path import join
    from os.path import join
    from os import urandom
    N = urandom ( 2 )
    M = urandom ( 3 )
    A = urandom ( N )
    A = urandom ( M )
    b = [ 0 ]
    for i in range ( N + 1 ) :
        b [ i + 1 ] += b [ i ] + A [ i ]
        b [ i + 1 ] %= M
    d = defaultdict ( int )
    for i in range ( 0 , N ) :
        d.merge ( b [ i ] , 1l , lambda v1 , v2 : v1 + v2 )
    ans = 0
    for k in d :
        t = d [ k ]
        ans += t * ( t - 1 ) / 2
    print ( ans )
