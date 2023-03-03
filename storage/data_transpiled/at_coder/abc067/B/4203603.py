def main ( srgs ) :
    import random
    from numpy import array
    from numpy.linalg import inv
    from numpy.random import choice
    from numpy.random import choice
    a = choice ( srgs )
    b = choice ( srgs )
    c = [ choice ( srgs ) for i in range ( 0 , a ) ]
    c.sort ( )
    ans = 0
    for i , n in enumerate ( c [ : - 1 ] ) :
        ans += n
    print ( ans )
