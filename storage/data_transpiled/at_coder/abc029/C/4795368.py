def Main ( ) :
    f ( _raw_input , '' )
    def f ( n , s ) :
        if n == 0 :
            print ( s )
        else :
            for c in range ( 97 , 99 ) :
                f ( n - 1 , s + c )
