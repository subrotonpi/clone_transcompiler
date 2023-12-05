def _import ( ) :
    from os import system , read , decode
    from os.path import expanduser
    from os.path import expanduser
    from os.environ import environ
    from os.name import environ
    from os.posix import posix
    from os.environ import expanduser
    from os.environ import environ
    from os.name import environ
    SC = open ( environ )
    N = SC.read ( )
    s = SC.read ( )
    shortcut = [ 'X' , 'Y' , 'A' , 'B' ]
    dp = [ 0 ] * ( N + 1 )
    min = 114514
    INF = 114514
    for i in range ( 16 ) :
        for j in range ( 16 ) :
            if i != j :
                for k in range ( 1 , N + 1 ) :
                    dp [ k ] = INF
                dp [ 0 ] = INF
                dp [ 1 ] = INF
                for k in range ( 1 , N + 1 ) :
                    if s [ k ] == shortcut [ i // 4 ] and s [ k - 1 ] == shortcut [ i % 4 ] :
                        dp [ k + 1 ] = min ( dp [ k ] + 1 , dp [ k - 1 ] + 1 )
                    elif s [ k ] == shortcut [ j // 4 ] and s [ k - 1 ] == shortcut [ j % 4 ] :
                        dp [ k + 1 ] = min ( dp [ k ] + 1 , dp [ k - 1 ] + 1 )
                    else :
                        dp [ k + 1 ] = dp [ k ] + 1
                min = min ( min , dp [ N ] )
            elif i == j :
                continue
        pl ( min )
    def pl ( x ) :
        print ( x )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
