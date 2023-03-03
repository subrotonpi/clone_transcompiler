def main ( ) :
    import sys
    from itertools import repeat
    sc = sys.stdin
    n = sc.randint ( 1 , 10000 )
    a = repeat ( sc.randint ( 1 , 10000 ) , n )
    sc.close ( )
    if n == 1 :
        print ( 0 )
        return
    elif n == 2 :
        if a [ 0 ] > a [ 1 ] :
            print ( 1 )
        else :
            print ( 0 )
        return
    if n % 2 == 0 :
        a1 , a2 = [ a [ i * 2 ] for i in range ( n // 2 ) ]
    else :
        a1 , a2 = [ a [ i * 2 + 1 ] for i in range ( n // 2 ) ]
    a1 = sorted ( a1 )
    ans = 0
    for i in a1 :
        pos = sum ( a [ i ] for i in a1 )
        if pos % 2 == 1 :
            ans += 1
    print ( ans )
