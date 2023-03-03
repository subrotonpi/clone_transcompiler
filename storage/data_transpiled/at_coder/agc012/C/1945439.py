def _import ( ) :
    from itertools import count , repeat
    from itertools import chain , repeat
    from os import urandom
    from random import randint
    class Main ( object ) :
        def bitcount ( self ) :
            res = 0
            while n > 0 :
                if self.next ( ) == 1 :
                    res += 1
                self.next ( )
            return res
        def next ( self ) :
            return self.next ( )
    N = int ( sys.stdin.read ( ) )
    maxbit = - 1
    n = N
    while n > 0 :
        n /= 2
        maxbit += 1
    first = deque ( )
    second = [ ]
    for i in range ( maxbit , 0 , - 1 ) :
        first.append ( i )
        second.append ( i )
    usenumber = deque ( )
    for i in range ( bitcount ( N ) - 1 , 0 , - 1 ) :
        usenumber.append ( maxbit + i )
        first.append ( maxbit + i )
    for i in range ( maxbit - 1 , - 1 , - 1 ) :
        if ( ( N >> i ) & 1 ) == 1 :
            inn = usenumber.popleft ( )
            second.insert ( second.index ( i + 1 ) + 1 , inn )
    ans = [ 100 ]
    while not first :
        ans.append ( first.popleft ( ) )
    for i in second :
        ans.append ( i )
    ans.append ( 100 )
    print ( len ( ans ) )
    for i in ans :
        print ( i , end = ' ' )
    print ( )
