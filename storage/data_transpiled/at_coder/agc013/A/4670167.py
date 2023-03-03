def _import ( ) :
    from math import sin , cos , pi
    from os import urandom
    import random
    N = int ( urandom ( 1 ) )
    A = urandom ( N )
    current_signum = None
    count = 1
    for i in range ( 0 , N - 1 , 1 ) :
        signum = sum ( abs ( A [ i ] - A [ i + 1 ] ) )
        if current_signum is None :
            current_signum = signum
        elif not ( signum == 0 or current_signum == signum ) :
            count += 1
            current_signum = None
    urandom ( 1 )
