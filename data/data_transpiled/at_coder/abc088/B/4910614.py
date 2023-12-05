def main ( ) :
    import sys
    from numpy.linalg import eigs
    from numpy.random import rand
    N = rand ( )
    a = [ rand ( ) for _ in range ( N ) ]
    a.sort ( )
    alice = bob = 0
    is_alice = True
    for i in range ( len ( a ) - 1 , - 1 , - 1 ) :
        if is_alice :
            alice += a [ i ]
        else :
            bob += a [ i ]
        is_alice = not is_alice
    print ( alice - bob )
