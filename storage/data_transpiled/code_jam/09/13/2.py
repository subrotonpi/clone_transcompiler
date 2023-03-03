def _import ( ) :
    from os import system , randrange
    from os.path import expanduser
    from os import environ
    from os import chdir
    from threading import Thread
    from os.name import basename , randrange
    from os.path import expanduser
    from os.path import join , join
    from os import getcwd
    from os.path import join , dirname , join
    from os import rename
    from os import getcwd
    from os.path import join , getcwd
    from os import getcwd
    from os import chdir
    from time import sleep
    n = randrange ( 1 , 10 )
    k = randrange ( 2 , 10 )
    c = [ [ ] for _ in range ( 0 , n + 1 ) ]
    for i in range ( 0 , n ) :
        c [ i ] [ 0 ] = c [ i ] [ i ] = 1
        for j in range ( 1 , i ) :
            c [ i ] [ j ] = c [ i - 1 ] [ j - 1 ] + c [ i - 1 ] [ j ]
    p = [ 1 ]
    t = [ 1 ]
    for i in range ( n ) :
        pstay = c [ i ] [ k ] * 1.0 / c [ n ] [ k ]
        if not p [ i ] :
            continue
        for j in range ( 1 , k ) :
            pmove = c [ i ] [ k - j ] * c [ n - i ] [ j ] * 1.0 / c [ n ] [ k ]
            if not pmove :
                continue
            ii = i + j
            pp = p [ i ] * pmove / ( 1 - pstay )
            tt = t [ i ] + 1 / ( 1 - pstay )
            t [ ii ] = ( p [ ii ] * t [ ii ] + pp * tt ) / ( p [ ii ] + pp )
            p [ ii ] = p [ ii ] + pp
    chdir ( getcwd ( ) )
    tests = randrange ( 1 , 2 )
    chdir ( dirname ( abspath ( __file__ ) ) )
    for t in range ( 1 , tests + 1 ) :
        chdir ( dirname ( abspath ( __file__ ) ) )
