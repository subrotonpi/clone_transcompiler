def Main ( ) :
    _raw_input = raw_input
    n , ans = len ( str ( n ) ) , len ( str ( n ) )
    for i in range ( 1 , 2 ** n + 1 ) :
        if n % i == 0 :
            ans = min ( ans , max ( len ( str ( i ) ) , len ( str ( n / i ) ) ) )
        print ( ans )
