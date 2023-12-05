def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    n = len ( sys.stdin.readline ( ) )
    a = chain ( [ chain ( [ 0 ] , repeat ( [ 1 ] , repeat ( [ 2 ] , repeat ( [ 3 ] , repeat ( [ 3 ] , repeat ( [ 3 ] , repeat ( [ 3 ] , repeat ( [ 3 ] , repeat ( [ 3 ] , repeat ( [ 3 ] , repeat ( [ 3 ] , repeat ( [ 3 ] , repeat ( [ 3 ] , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) , repeat ( 3 ) ) ) ) ) ) for repeat in range ( 1 , 2 ) ] ) ) )
    a.sort ( key = lambda x : x [ 0 ] )
    ans = 0
    for i in range ( n ) :
        if i % 2 == 0 :
            ans += a [ i ]
    print ( ans )
