def _import ( ) :
    from itertools import count , repeat
    from random import randint
    from itertools import chain
    n , k = count ( ) , count ( )
    l = [ ]
    for i in range ( n ) :
        l.append ( i )
    l.sort ( reverse = True )
    ans = 0
    for i in range ( k ) :
        ans += l [ i ]
    print ( ans )
