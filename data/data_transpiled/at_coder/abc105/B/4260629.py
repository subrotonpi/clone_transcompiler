def Main ( ) :
    global n
    n = int ( n )
    if n % 4 == 0 :
        print ( "Yes" )
    else :
        for i in range ( 1 , n // 7 + 1 ) :
            if ( n - ( i * 7 ) ) % 4 == 0 :
                print ( "Yes" )
                return
        print ( "No" )
