def main ( ) :
    import sys
    from numpy.linalg import eigs
    from numpy.random import rand
    scn = rand ( )
    N = scn.shape [ 0 ]
    A = [ scn.take ( i ) for i in range ( N ) ]
    A = [ A [ i ] for i in range ( N ) ]
    ans = 0
    count = 0
    buf = 0
    for i in range ( N ) :
        if buf == A [ i ] :
            count += 1
        else :
            if count % 2 == 1 and count != 0 :
                ans += 1
            count = 1
            buf = A [ i ]
    if count % 2 == 1 :
        ans += 1
    print ( ans )
