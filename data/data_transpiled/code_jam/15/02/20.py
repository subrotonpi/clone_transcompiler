def codejam15 ( ) :
    import os
    from glob import glob
    from os import path
    from os import curdir
    from os import mkdir
    from os.path import join
    from os import curdir
    from os import sep
    from os import chdir
    from random import randint
    from itertools import chain , repeat
    sc = open ( join ( curdir , 'b.in' ) , 'r' )
    f = open ( join ( curdir , 'b.out' ) , 'w' )
    tc = randint ( 1 , 10 )
    for t in range ( 1 , tc + 1 ) :
        d = randint ( 1 , 10 )
        c = [ ch for ch in range ( d ) ]
        ans = sys.maxint
        for i in range ( 1 , 1100 ) :
            add = 0
            for j in c :
                q = j // i + ( j % i == 0 )
                add += q - 1
            ans = min ( ans , add + i )
        f.write ( 'Case #%d: %d\n' % ( t , ans ) )
    sc.close ( )
    f.close ( )
