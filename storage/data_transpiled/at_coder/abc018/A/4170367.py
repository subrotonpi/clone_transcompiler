def _import ( ) :
    from itertools import count , repeat
    from itertools import chain
    a = [ ]
    for i in range ( 3 ) :
        a.append ( [ i + 1 , sc.randint ( 1 , 3 ) ] )
    a.sort ( lambda x , y : cmp ( y [ 1 ] , x [ 1 ] ) )
    for i in range ( 3 ) :
        a.append ( [ i + 1 , i + 1 ] )
    a.sort ( key = lambda x : x [ 2 ] )
    for i in range ( 3 ) :
        print ( a [ i ] [ 2 ] )
