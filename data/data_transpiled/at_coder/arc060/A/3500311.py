def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( )
        a = sc.readline ( )
        x = [ - 1 for i in range ( n + 1 ) ]
        dp = [ [ 0 ] * ( n + 1 ) for i in range ( n * 50 + 1 ) ]
        dp [ 0 ] [ 0 ] [ 0 ] = 1
        for i in range ( 1 , n + 1 ) :
            for m in range ( n + 1 ) :
                for s in range ( n * 50 + 1 ) :
                    diff = s - x [ i ]
                    if diff >= 0 & m >= 1 :
                        dp [ i ] [ m ] [ s ] = dp [ i - 1 ] [ m ] [ s ] + dp [ i - 1 ] [ m - 1 ] [ diff ]
                    else :
                        dp [ i ] [ m ] [ s ] = dp [ i - 1 ] [ m ] [ s ]
    num = 1
    summation = a
    answer = 0
    while num <= n & summation <= n * 50 :
        answer += dp [ n ] [ num ] [ summation ]
        num += 1
        summation += a
    print ( answer )
