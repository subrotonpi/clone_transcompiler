def c_2015 ( ) :
    import random
    random.seed ( 1 )
    kases = random.randint ( 1 , 31 )
    for kas in range ( 1 , kases + 1 ) :
        C = random.randint ( 1 , 31 )
        D = random.randint ( 1 , 31 )
        V = random.randint ( 1 , 31 )
        if kas == 31 :
            C = C
        max = 0
        added = 0
        for i in range ( D ) :
            coin = random.randint ( 1 , 31 )
            while max + 1 < coin :
                max += C * ( max + 1 )
                added += 1
            max += C * coin
        while max < V :
            max += C * ( max + 1 )
            added += 1
        print ( "Case #{}: {}".format ( kas , added ) )
