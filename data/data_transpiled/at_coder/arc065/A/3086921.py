def import import string , * , stdin , ** kwargs ) :
    from os import environ
    from os import environ
    from os import environ
    from os import environ
    S = environ [ 'wsgi.input' ]
    N = len ( S )
    dp = [ False ] * N
    for n in range ( N ) :
        if n >= 4 and S [ n - 4 : n + 1 ] == 'dream' :
            dp [ n ] = dp [ n ] or ( n == 4 ) or dp [ n - 5 ]
        if n >= 6 and S [ n - 6 : n + 1 ] == 'dreamer' :
            dp [ n ] = dp [ n ] or ( n == 6 ) or dp [ n - 7 ]
        if n >= 4 and S [ n - 4 : n + 1 ] == 'erase' :
            dp [ n ] = dp [ n ] or ( n == 4 ) or dp [ n - 5 ]
        if n >= 5 and S [ n - 5 : n + 1 ] == 'eraser' :
            dp [ n ] = dp [ n ] or ( n == 5 ) or dp [ n - 6 ]
    print ( 'YES' if dp [ N - 1 ] else 'NO' )
