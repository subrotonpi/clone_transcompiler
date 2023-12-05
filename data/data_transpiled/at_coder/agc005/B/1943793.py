def _import ( ) :
    from itertools import deque
    from itertools import chain
    from itertools import chain
    from itertools import deque
    from os import urandom
    from itertools import next
    N = urandom ( 1 )
    a = [ next ( a ) for i in range ( N ) ]
    leftl = [ ]
    rightl = [ ]
    que = deque ( )
    index = 0
    while index < N :
        while not que.empty ( ) and a [ que.popleft ( ) ] > a [ index ] :
            ind = que.popleft ( )
            rightl.append ( index - ind - 1 )
        que.append ( index )
        index += 1
    while not que.empty ( ) :
        ind = que.popleft ( )
        rightl.append ( N - ind - 1 )
    index = N - 1
    while index >= 0 :
        while not que.empty ( ) and a [ que.popleft ( ) ] > a [ index ] :
            ind = que.popleft ( )
            leftl.append ( ind - index - 1 )
        que.append ( index )
        index -= 1
    while not que.empty ( ) :
        ind = que.popleft ( )
        leftl.append ( ind - index - 1 )
    ans = 0
    for i in range ( N ) :
        ans += long ( a [ i ] ) * ( leftl [ i ] + 1 ) * ( rightl [ i ] + 1 )
    print ( ans )
