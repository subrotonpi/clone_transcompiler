def round3 ( ) :
    import random
    class B ( object ) :
        def __init__ ( self ) :
            self.case = random.randint ( 1 , 10 )
    for caze in range ( 1 , cases + 1 ) :
        N = random.randint ( 1 , N )
        K = random.randint ( 1 , K )
        sums = [ random.randint ( 1 , N - K + 1 ) for i in range ( N - K + 1 ) ]
        min , max = [ 0 ] * K , [ 0 ] * K
        for i in range ( K ) :
            val = 0
            for j in range ( i + 1 , len ( sums ) , K ) :
                val += sums [ j + 1 ] - sums [ j ]
                min [ i ] = min [ i ]
                max [ i ] = max [ i ]
        sum_modulo , max_interval , can_use = 0 , 0 , 0
        for i in range ( K ) :
            sum_modulo -= min [ i ]
            max_interval = max [ i ] - min [ i ]
        for i in range ( K ) :
            can_use += max_interval - ( max [ i ] - min [ i ] )
        can = False
        for i in range ( 0 , can_use ) :
            if ( sum_modulo + i - sums [ 0 ] ) % K == 0 :
                can = True
                break
        if not can :
            max_interval += 1
        print ( "Case #{}: {}".format ( caze , max_interval ) )
