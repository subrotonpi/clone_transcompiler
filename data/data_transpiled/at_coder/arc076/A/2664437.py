def test_solve ( ) :
    import random
    solve ( )
    random.seed ( 1 )
    n = random.randint ( 1 , 4 )
    m = random.randint ( 1 , 4 )
    ans = 1
    mod = long ( random.randint ( 10 , 9 ) ) + 7
    if n == m :
        for i in range ( n , 0 , - 1 ) :
            ans = ( ( ans * long ( i ) ) % mod ) * long ( i ) % mod
        ans = ( ans * 2 ) % mod
    elif int ( abs ( n - m ) ) == 1 :
        for i in range ( int ( min ( n , m ) ) , int ( max ( n , m ) ) ) :
            ans = ( ( ans * long ( i ) ) % mod ) * long ( i ) % mod
        ans = ( ans * long ( max ( n , m ) ) ) % mod
    else :
        ans = 0
    print ( ans )
