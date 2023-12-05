def main ( ) :
    import sys
    from itertools import count
    from itertools import chain
    from itertools import chain
    N = len ( sys.stdin.readline ( ) )
    Q = len ( sys.stdin.readline ( ) )
    left = [ chain ( [ 0 ] , [ ] ) for _ in range ( Q ) ]
    right = [ chain ( [ 0 ] , [ ] ) for _ in range ( Q ) ]
    left.sort ( )
    right.sort ( )
    count = 0
    li = ri = 0
    lines = [ ]
    for i in range ( 1 , N + 1 ) :
        while li < Q and left [ li ] == i :
            li += 1
            count += 1
        lines.append ( '0' if count % 2 == 0 else '1' )
        while ri < Q and right [ ri ] == i :
            ri += 1
            count -= 1
    print ( ''.join ( lines ) )
