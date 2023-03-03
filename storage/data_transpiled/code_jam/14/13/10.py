def Rd1ac ( ) :
    import random
    import numpy as np
    from random import randint
    from numpy.random import uniform
    from numpy.core import zeros
    from random import uniform
    count = uniform ( 0 , 1 )
    table = generate_table ( 1000 , 1000000 )
    probs = [ ]
    for l in range ( count ) :
        n = uniform ( 0 , 1 )
        perm = [ uniform ( 0 , 1 ) for _ in range ( n ) ]
        prob = probability ( perm , table , n )
        if prob > 1 :
            probs.append ( prob - 1.0 )
        else :
            probs.append ( 1.0 - prob )
    bigger = [ 0 for _ in range ( count ) ]
    for i in range ( count ) :
        bigger [ i ] = 0
        for j in range ( count ) :
            if i != j and probs [ i ] < probs [ j ] :
                bigger [ i ] = bigger [ i ] + 1
    best = middle = 0.0
    for i in range ( count ) :
        if bigger [ i ] < count / 2 and bigger [ i ] > best :
            best = bigger [ i ]
            middle = probs [ i ]
    for i in range ( count ) :
        if probs [ i ] > middle :
            print ( "Case #{}: BAD".format ( i + 1 ) )
        else :
            print ( "Case #{}: GOOD".format ( i + 1 ) )
    def probability ( perm , table , size ) :
        prob = 1.0
        for i in range ( size ) :
            prob = prob * table [ size * i + perm [ i ] ]
        return prob
    for i in range ( count ) :
        for j in range ( size ) :
            temp = random ( )
            temp [ i ] = random ( )
            temp [ j ] = random ( )
    return
