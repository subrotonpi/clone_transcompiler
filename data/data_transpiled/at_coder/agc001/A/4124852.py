def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    N2 = len ( sys.stdin.readline ( ) ) * 2
    L = [ ]
    for i in range ( N2 ) :
        L.append ( sys.stdin.readline ( ) )
    L = chain ( L , repeat ( N2 ) )
    ans = 0
    for i in range ( 0 , N2 , 2 ) :
        ans += L [ i ]
    print ( ans )
