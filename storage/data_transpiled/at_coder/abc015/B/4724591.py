def main ( ) :
    import math
    from math import ceil
    from math import floor
    from math import ceil
    from math import ceil
    from math import ceil
    from math import floor
    from math import ceil
    from math import ceil
    from math import floor
    from math import ceil
    N = int ( sys.stdin.read ( ) )
    A = [ 0 for i in range ( 100 ) ]
    cnt = 0
    sum = 0
    for i in range ( N ) :
        A [ i ] = floor ( i )
        if A [ i ] > 0 :
            cnt += 1
        sum += A [ i ]
    sum /= cnt
    sum = ceil ( sum )
    ans = int ( sum )
    print ( ans )
