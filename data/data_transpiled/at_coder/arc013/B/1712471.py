def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.core import zeros
    from numpy.core import linalg
    from numpy.random import random
    C = randint ( 1 , 3 )
    nml = [ ]
    max_nml = [ ]
    for i in range ( C ) :
        for j in range ( 3 ) :
            nml.append ( random.choice ( range ( 3 ) ) )
        nml = [ max ( nml , i ) for i in range ( 3 ) ]
        for j in range ( 3 ) :
            max_nml [ j ] = max ( max_nml [ j ] , nml [ j ] )
    ans = max_nml [ 0 ] * max_nml [ 1 ] * max_nml [ 2 ]
    print ( ans )
