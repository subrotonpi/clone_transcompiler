def _import ( ) :
    from os import urandom
    import sys
    from io import StringIO
    from random import randint
    from time import sleep
    from itertools import chain
    _in = urandom ( 1024 )
    out = open ( 'output.txt' , 'w' )
    _ = range ( randint ( 1 , 5 ) )
    for __ in range ( _ ) :
        out.write ( 'Case #%d: ' % ( __ + 1 ) )
        n = randint ( 1 , 5 )
        t = [ ]
        for s in _in :
            j = len ( s ) - 1
            while j >= 0 and s [ j ] == '0' :
                j -= 1
            t.append ( j )
        res = 0
        for i in range ( n ) :
            jj = - 1
            for j in range ( i , n ) :
                if t [ j ] <= i :
                    jj = j
                    break
            if jj == - 1 :
                raise Exception ( 'B1' )
            res += ( jj - i )
            for j in range ( jj , i , n - 1 ) :
                t [ j ] = t [ j - 1 ]
        out.write ( '%d\n' % res )
