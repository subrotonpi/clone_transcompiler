def _import ( bif , * args ) :
    from itertools import repeat
    from itertools import repeat
    from itertools import repeat
    class Main ( object ) :
        def __init__ ( self , bif , * args ) :
            super ( Main , self ).__init__ ( * args )
        def __reduce__ ( self , * args ) :
            n = ni ( )
            k = ni ( )
            sum = 0
            a = [ ]
            for i in range ( n ) :
                a.append ( i )
            sum += a [ i ]
            if sum == k :
                print ( 1 )
            else :
                dp = [ [ ] for _ in range ( n + 1 ) ]
                for i in range ( 0 , n ) :
                    dp.append ( [ 0 ] )
                dp [ 0 ].append ( 0 )
                s = 0
                for i in range ( 0 , n ) :
                    for j in range ( 0 , n ) :
                        if dp [ i ] [ j ] == int ( i ) :
                            continue
                        dp [ i + 1 ] [ j ] = min ( dp [ i + 1 ] [ j ] , dp [ i ] [ j ] )
                        u = dp [ i ] [ j ]
                        ns = s + a [ i ]
                        if s == 0 :
                            v = 1
                        else :
                            v = ( u * ns ) / s + 1
                        if v - u <= a [ i ] <= k :
                            dp [ i + 1 ] [ j + 1 ] = min ( dp [ i + 1 ] [ j + 1 ] , int ( v ) )
                    s += a [ i ]
                for i in range ( 0 , n ) :
                    if dp [ n ] [ i ] != int ( i ) :
                        print ( i )
                        break
        def __reduce__ ( self , * args ) :
            return repeat ( args )
        def __reduce__ ( self , * args ) :
            return repeat ( args )
    return Main
