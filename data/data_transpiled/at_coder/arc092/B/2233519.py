def _import ( ) :
    from math import sin , cos , tan
    from os import urandom
    from os import urandom
    from random import randint
    from math import sin , cos , tan
    from os.path import join
    from os import urandom
    N = randint ( 1 , 256 )
    a = urandom ( N )
    b = urandom ( N )
    ans = 0
    for k in range ( 0 , 28 ) :
        a_ = [ ]
        b_ = [ ]
        T = 1 << k
        for i in range ( N ) :
            a_.append ( a [ i ] % ( 2 ** T ) )
            b_.append ( b [ i ] % ( 2 ** T ) )
        a_.sort ( )
        b_.sort ( )
        c = 0
        s = 0
        t = 0
        for i in range ( N - 1 , - 1 , - 1 ) :
            while t < N and a_ [ i ] + b_ [ t ] < 2 ** T :
                t += 1
            while s < N and a_ [ i ] + b_ [ s ] < T :
                s += 1
            c ^= ( t - s ) % 2
        s = 0
        t = 0
        for i in range ( N - 1 , - 1 , - 1 ) :
            while t < N and a_ [ i ] + b_ [ t ] < 4 ** T :
                t += 1
            while s < N and a_ [ i ] + b_ [ s ] < 3 ** T :
                s += 1
            c ^= ( t - s ) % 2
        ans |= T * c
    print ( ans )
    def tr ( * args ) :
        print ( sum ( args ) )
    return tr
