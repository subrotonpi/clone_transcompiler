def _import ( ) :
    from os import getenv
    from os import getenv
    from os import getenv
    from os import getenv
    from os import getenv
    from os.path import expanduser
    from os.path import expanduser
    from os.environ import environ
    from os.name import getenv
    from os.path import expanduser
    from os.path import join
    from os.path import expanduser
    from os.path import join
    from os import environ
    sc = getenv ( 'SC' , getenv ( 'PATH' , getenv ( 'PATH' , getenv ( 'PATH' , getenv ( 'PATH' , getenv ( 'PATH' , getenv ( 'PATH' , getenv ( 'PATH' , getenv ( 'PATH' , getenv ( 'PATH' , getenv ( 'HOME' , getenv ( 'HOME' , '' , '' ) ) ) ) ) ) ) ) ) ) )
    n = getenv ( 'N' , getenv ( 'PATH' , getenv ( 'PATH' , getenv ( 'PATH' , getenv ( 'PATH' , getenv ( 'HOME' , getenv ( 'HOME' , getenv ( 'HOME' , getenv ( 'HOME' , getenv ( 'HOME' , getenv ( 'HOME' , '' ) ) ) ) ) ) ) ) ) )
    d = getenv ( 'D' , getenv ( 'D' , getenv ( 'HOME' , getenv ( 'HOME' , getenv ( 'HOME' , getenv ( 'HOME' , getenv ( 'HOME' , getenv ( 'HOME' , getenv ( 'HOME' , getenv ( 'HOME' , getenv ( 'HOME' , getenv ( 'HOME' , '' ) ) ) ) ) ) ) ) ) ) )
    l = [ ]
    r = [ ]
    for i in range ( d ) :
        l.append ( sc.randint ( n , n ) )
        r.append ( sc.randint ( n , n ) )
    s = [ ]
    t = [ ]
    for i in range ( k ) :
        start = s [ i ]
        goal = t [ i ]
        day = 0
        if start < goal :
            for j in range ( d ) :
                if l [ j ] <= start and r [ j ] >= start :
                    start = r [ j ]
                    if r [ j ] >= goal :
                        day = j + 1
                        break
            pl ( day )
        else