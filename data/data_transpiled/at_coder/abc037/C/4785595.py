def Main ( ) :
    global _number
    n , k = _number
    print ( _number * min ( min ( min ( i + 1 , n - i ) , k ) , n - k + 1 ) )
