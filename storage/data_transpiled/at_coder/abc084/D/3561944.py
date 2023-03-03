def import import os , sys , subprocess , random , primes , primes , primes , primes , primes , primes , ** kwargs ) :
    from random import randint
    from os import urandom
    from random import seed
    from os.path import join
    from random import seed
    primes = [ ]
    primes.append ( primes )
    primes.append ( primes )
    primes.append ( primes )
    primes.append ( primes )
    primes.append ( primes )
    susum = [ 0 ] * 50000
    susum.append ( primes [ 1 ] )
    for i in range ( 2 , len ( primes ) ) :
        susum [ i ] = susum [ i - 1 ]
        if primes [ 2 * i ] != primes [ i ] :
            susum [ i ] += 1
    Q = random ( )
    for i in range ( Q ) :
        L = random ( )
        R = random ( )
        if L == 1 :
            print ( susum [ ( R - 1 ) // 2 ] )
        else :
            print ( susum [ ( R - 1 ) // 2 ] - susum [ ( ( L - 1 ) // 2 ) - 1 ] )
