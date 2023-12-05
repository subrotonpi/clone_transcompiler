def import io , StringIO , StringIO , StringIO , nval , nval , tests , verbose , mode , nval , verbose , filename , line , types , StringIO , ** kwargs ) :
    import sys
    import random
    import numpy as np
    from itertools import product
    from itertools import product
    from itertools import chain
    f = StringIO ( )
    f.seek ( 0 )
    tests = len ( chain ( * repeat ( [ i for i in range ( 1 , m ) ] ) ) )
    m = 11000
    c = np.zeros ( ( m , m ) )
    c [ 0 , 0 ] = 1
    for i in range ( 1 , m ) :
        c [ i , 0 ] = c [ i , i ] = c [ i - 1 , 0 ] / 2
        for j in range ( 1 , i ) :
            c [ i , j ] = ( c [ i - 1 , j ] + c [ i - 1 , j - 1 ] ) / 2
    for test in range ( 1 , tests + 1 ) :
        n = len ( chain ( * repeat ( [ i for i in range ( 1 , n ) ] ) ) )
        x = abs ( next ( iter ( range ( 1 , n ) ) ) )
        y = abs ( next ( iter ( range ( 1 , n ) ) ) )
        level = ( x + y ) / 2
        sum = 0
        lev = 0
        for _ in range ( 1 , n ) :
            sum += 4 * lev + 1
            if sum >= n :
                break
        kol = n - sum + 4 * lev + 1
        answ = 0
        if level == lev :
            if x == 0 :
                if kol == 4 * lev + 1 :
                    answ = 1
            else :
                for i in range ( 0 , kol ) :
                    if i + max ( 0 , kol - i - 2 * lev ) > y :
                        answ += c [ kol , i ]
        elif level < lev :
            answ = 1
        print ( "Case #%d: " % test , end = ' ' )
        f.write ( answ )
    f.close ( )
    return 0
