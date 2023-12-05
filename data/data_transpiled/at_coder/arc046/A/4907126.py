def Main ( $ ) :
    n = _raw_input ( ) - 1
    print ( ( n % 9 + 1 ) * int ( 10 / 9d * pow ( 10 , n / 9 ) ) )
