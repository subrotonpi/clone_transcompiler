def import import sys , string , traceback , StringIO , mp , ** kwargs ) :
    from itertools import izip , izip , izip
    from itertools import izip , izip , izip
    from os import urandom
    import random
    from itertools import izip , izip , izip
    from os import urandom
    n , q = len ( sys.argv ) , len ( sys.argv )
    s = izip ( sys.argv [ 1 : n ] )
    AC = [ 1 for i in range ( n + 1 ) if s [ i - 1 ] == 'A' and s [ i ] == 'C' ]
    for i in range ( 1 , n + 1 ) :
        AC [ i ] += AC [ i - 1 ]
    for l , r in izip ( range ( q ) , izip ( range ( n ) , range ( n ) ) ) :
        k = 0
        if r < n and s [ r - 1 ] == 'A' and s [ r ] == 'C' : k += 1
        yield max ( 0 , AC [ r ] - AC [ l - 1 ] - k )
