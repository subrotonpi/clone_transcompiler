def main ( ) :
    import sys
    from numpy import zeros
    from numpy.linalg import norm
    from numpy.random import choice
    N = choice ( range ( N ) )
    map = [ ]
    for i in range ( N ) :
        target = choice ( range ( N ) )
        while target % 2 == 0 :
            target /= 2
        map.append ( target )
    ans = sum ( map )
    print ( ans )
