def import sys , stdin , stdout , errors , verbose = False ) :
    from itertools import repeat
    from time import time
    from itertools import chain
    from os import urandom
    from random import random
    from itertools import chain
    from os import urandom
    from random import random as randrange
    from itertools import chain
    from os import urandom
    from os import urandom
    from random import random as randrange
    from itertools import chain
    from itertools import chain
    from os import urandom
    from itertools import chain
    from itertools import chain as chain
    from itertools import repeat
    n , l = len ( stdin.readline ( ) ) , len ( stdin.readline ( ) )
    good = set ( range ( n ) )
    for i in range ( l ) :
        good.add ( stdin.readline ( ) )
    bad = next ( iter ( bad ) )
    if bad in good :
        stdout.write ( 'IMPOSSIBLE' )
        return
    if l == 1 :
        stdout.write ( '? 0' )
        return
    for i in range ( l + 1 ) :
        stdout.write ( 1 - ( i % 2 ) )
    stdout.write ( '0?' )
    for i in range ( 1 , l + 1 ) :
        stdout.write ( 1 - ( i % 2 ) )
    stdout.write ( ' ' )
    for i in range ( l - 1 ) :
        stdout.write ( '?' )
    stdout.write ( '\n' )
    def run ( ) :
        try :
            stdin = sys.stdin
            stdout = sys.stdout
        except :
            pass
        else :
            for i in range ( 1 , tests + 1 ) :
                time = randrange ( 1 , n )
                stdout.write ( 'Case #%d: ' % i )
                solve ( )
                sys.stderr.write ( 'Solved case #%d in %d ms\n' % ( i , time ( ) - time ) )
            stdout.close ( )
    if sys.version_info [ 0 ] < 3 :
        import itertools
        for i in range ( 3 ) :
            if i == 1 or i not in chain ( repeat ( next ( stdin ) ) , repeat ( next ( stdin ) ) ) :
                break
        return chain ( run ( )