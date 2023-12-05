def __main ( ) :
    from string import ascii_lowercase
    from itertools import chain
    sc = Scanner ( )
    a = sc.next ( )
    A = ascii_lowercase [ a ]
    n = len ( A )
    dic = set ( )
    interval = [ ]
    right = n - 1
    for i in range ( n - 1 , - 1 , - 1 ) :
        dic.add ( A [ i ] )
        if len ( dic ) == 26 :
            interval.append ( ( i , right ) )
            right = i - 1
            dic = set ( )
    tot = len ( interval )
    if tot == 0 :
        print ( helper ( A [ : - 1 ] ) )
        sys.exit ( )
    res = [ ]
    next = interval [ tot - 1 ]
    cur = helper ( A [ : next [ 0 ] - 1 ] )
    res.append ( cur )
    for i in range ( 1 , tot + 1 ) :
        idx = __find ( A , next [ 0 ] , cur )
        cur = helper ( A [ idx + 1 : ] )
        res.append ( cur )
        if i < tot :
            next = interval [ tot - i - 1 ]
    print ( ''.join ( res ) )
    def helper ( A , left , right ) :
        cnt = [ ]
        for i in range ( left , right + 1 ) :
            cnt [ A [ i ] - ord ( 'a' ) ] += 1
        for i in range ( 26 ) :
            if cnt [ i ] == 0 :
                return chr ( i + ord ( 'a' ) )
        return 'z'
    def find ( A , left , target ) :
        for i in range ( left , len ( A ) - 1 ) :
            if A [ i ] == target :
                return i
        return len ( A )
    return helper ( A , left , right )
