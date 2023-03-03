def main ( ) :
    import sys
    from random import randint
    from numpy import zeros
    from numpy.linalg import solve
    from random import random
    from numpy.random import choice
    from random import random
    from numpy.random import choice
    from random import random
    h , w = randint ( 1 , 10 ) , randint ( 1 , 10 )
    matrix = [ [ choice ( [ 0 , 1 ] ) for i in range ( 10 ) ] for j in range ( 10 ) ]
    d = warshall_floyd ( matrix )
    ans = 0
    for i in range ( h ) :
        for j in range ( w ) :
            a = choice ( [ 0 , 1 ] )
            if a > - 1 :
                ans += d [ a ] [ 1 ]
    print ( ans )
    random.seed ( 0 )
    return d
