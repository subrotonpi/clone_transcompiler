def import import sys , StringIO , random , choice , choice , eval , args , parser , ** kwargs ) :
    from random import randint
    from random import randint
    from time import time
    from random import uniform
    from os.path import expanduser
    from os.environ import environ
    from os.path import join
    from os.environ import environ
    from os.path import expanduser
    from os.environ import environ
    from os.environ import environ
    from os.chdir ( environ [ 'HOME' ] )
    from os.environ import environ
    from os.path import join
    from os.chdir ( environ [ 'PATH' ] )
    from os import chdir
    from random import randint
    from time import sleep
    from time import sleep
    for test in range ( randint ( 1 , 5 ) ) :
        print ( 'Test %d' % test )
        n = randint ( 1 , 5 )
        p = randint ( 1 , 10 )
        L = 0
        R = 1 << n
        while L < R - 1 :
            M = ( L + R ) / 2
            q = 1 << ( n - 1 )
            t = 1
            pl = 0
            while M >= t :
                pl += q
                t = ( t + 1 ) * 2 - 1
                q //= 2
            if pl >= p :
                R = M
            else :
                L = M
        maxg = L
        L = 0
        R = 1 << n
        while L < R - 1 :
            M = ( L + R ) / 2
            q = 1 << ( n - 1 )
            t = 1
            pl = ( 1 << n ) - 1
            while M <= ( 1 << n ) - 1 - t :
                pl -= q
                t = ( t + 1 ) * 2 - 1
                q //= 2
            if pl < p :
                L = M
            else :
                R = M
        maxc = L
        print ( 'Case #%d: %d %d' % ( test , maxg , maxc ) , end = ' ' )
    def write ( s , f ) :
        sys.stdout.write ( f.read ( ) )
        f.flush ( )
        return s
    try :
        read ( )
    except :
        pass
