def import sys , string , count , sum2 , op
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.randint ( 0 , n )
        a = [ ]
        for i in range ( n ) :
            a.append ( sc.randint ( 0 , n ) )
        cnt = 0
        for i in range ( 0 , n , 2 ) :
            if a [ i ] > 0 :
                cnt += a [ i ]
                s.append ( i )
        if len ( s ) == 0 :
            idx = 0
            for i in range ( 0 , n , 2 ) :
                if a [ i ] > a [ idx ] : idx = i
            s.append ( idx )
            sum = a [ idx ]
        op = [ ]
        cnt = 0
        for i in range ( n - 1 , s [ - 1 ] + 1 , - 1 ) :
            cnt += 1
            op.append ( i + 1 )
        for i in range ( len ( s ) - 2 , s [ - 1 ] + 1 , - 1 ) :
            cnt += 1
            op.append ( s [ i ] + 3 )
        cnt += 1
        op.append ( s [ i ] + 2 )
    for i in range ( 0 , s [ 0 ] ) :
        cnt += 1
        op.append ( 1 )
    s2 = [ ]
    sum2 = 0
    for i in range ( 1 , n , 2 ) :
        if a [ i ] > 0 :
            sum2 += a [ i ]
            s2.append ( i )
    if len ( s2 ) == 0 :
        idx = 1
        for i in range ( 1 , n , 2 ) :
            if a [ i ] > a [ idx ] : idx = i
        s2.append ( idx )
        sum2 = a [ idx ]
