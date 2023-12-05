def Main ( $ ) :
    n = 2025 - _raw_input ( )
    _intlist = [ i for i in range ( 1 , 10 ) if n % i == 0 and n / i <= 9 ]
    print ( "%d x %d" % ( i , n / i ) )
