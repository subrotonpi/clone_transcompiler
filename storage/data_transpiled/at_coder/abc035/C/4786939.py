def Main ( ) :
    global a
    n , q = _raw_input ( ) , _raw_input ( )
    a = [ 0 ] * ( n + 1 )
    for i in range ( q ) :
        a [ i - 1 ] += 1
        a [ i ] -= 1
    for i in range ( 1 , n + 1 ) :
        a [ i ] += a [ i - 1 ]
    for i in range ( n ) :
        print ( a [ i ] % 2 , end = ' ' )
    print ( )
