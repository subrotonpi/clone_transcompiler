def round1a ( ) :
    import random
    from math import ceil
    from math import sin , cos , sin , cos , log
    with open ( "test.txt" , "r" ) as f :
        cases = int ( f.read ( ) )
        for caze in range ( 1 , cases + 1 ) :
            N = int ( f.read ( ) )
            cant = [ sin ( x ) for x in f.read ( ) ]
            first , second , max = 0 , 0 , 0
            for i in range ( 1 , N ) :
                if cant [ i - 1 ] > cant [ i ] :
                    dif = cant [ i - 1 ] - cant [ i ]
                    first += dif
                    max = max ( max , dif )
            for i in range ( 1 , N ) :
                second += min ( max , cant [ i - 1 ] )
            print ( "Case #{}: {} {}".format ( caze , first , second ) )
