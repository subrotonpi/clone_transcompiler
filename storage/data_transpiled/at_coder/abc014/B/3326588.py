def main ( args ) :
    import sys
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    n = len ( sys.stdin.readline ( ) )
    x = len ( sys.stdin.readline ( ) )
    a = chain ( [ n ] , repeat ( n ) )
    ans = 0
    ind = 0
    for i in range ( x , 0 , 2 ) :
        if i % 2 == 1 :
            ans += a [ ind ]
        ind += 1
    print ( ans )
