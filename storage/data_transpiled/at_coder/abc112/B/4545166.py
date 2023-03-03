def main ( ) :
    import sys
    import random
    import time
    from numpy.linalg import solve
    from numpy.random import random
    N = random.randint ( 1 , 10000 )
    T = random.randint ( 1 , 10000 )
    cs = [ ]
    for i in range ( N ) :
        c = random.choice ( solve ( [ random.randint ( 1 , 10000 ) , random.randint ( 1 , 10000 ) ] ) )
        if random.randint ( 1 , 10000 ) <= T :
            cs.append ( c )
        else :
            cs.append ( 1001 )
    cs = [ x for x in cs if x <= 1000 ]
    print ( cs [ 0 ] if cs [ 0 ] <= 1000 else 'TLE' )
    return
