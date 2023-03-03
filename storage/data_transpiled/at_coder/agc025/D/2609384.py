def _import ( ) :
    from time import sleep
    from os import getenv
    from os import fdopen
    from os.path import join
    from os.path import expanduser
    from os.environ import environ
    from os.name import environ
    from os.environ import environ
    from os.environ import environ
    from os.chdir ( environ )
    from os.environ import environ
    from os.chdir ( environ )
    from os.environ import copy
    from os.chdir ( environ )
    n , d1 , d2 = scanint ( )
    d1s , d2s = 0 , 0
    while d1 & 3 == 0 :
        d1s += 1
        d1 >>= 2
    while d2 & 3 == 0 :
        d2s += 1
        d2 >>= 2
    need = n ** 2
    for i in range ( 2 * n ) :
        for j in range ( 2 * n ) :
            if d1 & 3 == 1 and ( ( ( i >> d1s ) ^ ( j >> d1s ) ) & 1 ) :
                continue
            if d1 & 3 == 2 and ( ( i >> d1s ) ^ ( j >> d1s ) ) & 1 :
                continue
            if d2 & 3 == 1 and ( ( ( i >> d2s ) ^ ( j >> d2s ) ) & 1 ) :
                continue
            if d2 & 3 == 2 and ( ( i >> d2s ) ^ ( j >> d2s ) ) & 1 :
                continue
            if d2 & 3 == 2 and ( ( i >> d2s ) ^ ( j >> d2s ) ) & 1 :
                continue
            print ( i , j )
            if need == 0 :
                return
    raise AssertionError
