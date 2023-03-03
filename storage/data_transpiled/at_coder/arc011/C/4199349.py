def import _sys , _sys , _sys , _warnings , warnings , warn = False ) :
    from _sys import stdout
    with open ( _sys.argv [ 1 ] , 'r' ) as sc :
        first = sc.next ( )
        last = sc.next ( )
    if first == last :
        print ( 0 )
        print ( first )
        print ( last )
        return
    n = len ( _sys.argv )
    arr = [ first , last ]
    for i in range ( n ) :
        arr.append ( _sys.argv [ i ] )
    lists = [ ]
    ans = [ ]
    for i in range ( n + 2 ) :
        lists.append ( [ ] )
        ans.append ( [ ] )
    for i in range ( n + 2 ) :
        for j in range ( i + 1 , n + 2 ) :
            if _sys.argv [ i ] == _sys.argv [ j ] :
                lists [ i ].append ( j )
                lists [ j ].append ( i )
    ans [ 0 ].append ( 0 )
    result = None
    for i in range ( 1 , n + 2 ) :
        count = 0
        for j in range ( n + 2 ) :
            if len ( ans [ j ] ) == i :
                for x in lists [ j ] :
                    if ans [ x ] == [ ] :
                        ans [ x ] = ans [ j ] + [ x ]
                        count += 1
                        if x == 1 :
                            result = ans [ x ]
                            break
        if result :
            break
    if result :
        break
    if count == 0 :
        print ( - 1 )
        return
    lines = [ ]
    lines.append ( '\n'.join ( arr ) )
    print ( ''.join ( lines ) )
    return
