def main ( ) :
    import sys
    from itertools import chain
    from itertools import chain
    from random import randint
    from itertools import chain
    n = randint ( 1 , n )
    m = randint ( 1 , m )
    x = randint ( 1 , x )
    y = randint ( 1 , y )
    a = [ ]
    b = [ ]
    pairs = [ ]
    for i in range ( n ) :
        a.append ( randint ( 1 , n ) )
        ps = chain ( start = a [ i ] , goal = a [ i ] + x , dir = 1 )
        pairs.append ( ps )
    for i in range ( m ) :
        b.append ( randint ( 1 , n ) )
        ps = chain ( start = b [ i ] , goal = b [ i ] + y , dir = - 1 )
        pairs.append ( ps )
    pairs.sort ( )
    count = 0
    t = 0
    nowdir = 1
    for i in range ( n + m ) :
        start = pairs [ i ].start
        goal = pairs [ i ].goal
        dir = pairs [ i ].dir
        if t <= start and nowdir == dir :
            count += 1
            t = goal
            nowdir *= - 1
    print ( count / 2 )
