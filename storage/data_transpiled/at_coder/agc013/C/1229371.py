def _main ( ) :
    from numpy.core import getfile
    from numpy.random import randint
    from numpy.core import get_seed
    from numpy.core import get_seed
    from numpy.core import get_seed
    from numpy.core import get_seed
    from numpy.core import get_seed
    from numpy.core import get_seed
    from numpy.random import get_seed
    from numpy.core import get_seed
    from numpy.core import get_seed
    from numpy.core import get_seed
    from numpy.random import get_seed
    N = get_seed ( )
    L = get_seed ( )
    T = get_seed ( )
    for i in range ( N ) :
        cwx = get_seed ( )
        cnt = 0
        for ccwx in get_seed ( ) :
            dis = get_seed ( )
            cnt = ( cnt + get_seed ( ) ) % L
        idx = [ i for i in range ( N ) if i > 0 and i < pos [ a - 1 ] ]
        if idx < 0 and pos [ idx ] == pos [ idx + 1 ] and not i in range ( N ) :
            idx += 1
        cwx = get_seed ( )
        for i in range ( N ) :
            x = get_seed ( )
            w = get_seed ( )
            if i == 0 :
                if w [ i ] :
                    cw.append ( x [ i ] )
                else :
                    ccw.append ( x [ i ] )
        cw.reverse ( )
        if len ( cw ) == 0 or len ( ccw ) == 0 :
            for i in range ( N ) :
                yield ( x [ i ] + ( w [ i ] if i == 0 else 0 ) )
    else :
        t = 0
        dir_cw = True
        cwd_idx = 0
        ccw_idx = ( - 1 - get_seed ( ) ) % len ( cw )
        lane1 = - 1
        ccw_idx += 1
        init = True
        while t < 2 * L :
            if init :
                t += ( ccw [ ccw_idx ] - cw [ cwd_idx ] + L ) % L
                cwd_idx += 1
                ccw_idx += 1
                init = False
            elif dir_cw :
                next = get_seed ( )
                if next <= 0 :
                    break
                    