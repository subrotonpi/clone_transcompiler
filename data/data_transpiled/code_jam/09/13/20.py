def r1a ( ) :
    import numpy as np
    comb = np.zeros ( ( 41 , 41 ) )
    comb [ 0 , 0 ] = 1
    for n in range ( 1 , len ( comb ) ) :
        comb [ n , 0 ] = 1
        for m in range ( 1 , len ( comb ) ) :
            comb [ n , m ] = comb [ n - 1 , m ] + comb [ n - 1 , m - 1 ]
    with open ( 'test.txt' , 'r' ) as sc :
        T = sc.read ( )
        for t in range ( 1 , T + 1 ) :
            C = sc.read ( )
            N = sc.read ( )
            exp = np.zeros ( C + 1 )
            probs = np.zeros ( C + 1 )
            probs [ 0 ] = 1.0
            probs [ N ] = 1.0
            for e in range ( 1 , C + 1 ) :
                if e < N :
                    continue
                same = comb [ e , N ] * 1.0 / comb [ C , N ]
                other = ( 1.0 - same )
                for x in range ( 1 , N + 1 ) :
                    if e + x > C :
                        continue
                    prob = ( comb [ C - e , x ] * 1.0 / comb [ C , N ] ) * comb [ e , N - x ]
                    prob /= other
                    probs [ e + x ] += probs [ e ] * prob
        exp [ 0 ] = 0.0
        exp [ N ] = 1.0
        for e in range ( 1 , C + 1 ) :
            if e < N :
                continue
            same = comb [ e , N ] * 1.0 / comb [ C , N ]
            other = ( 1.0 - same )
            wtime = 1.0 / ( 1.0 - same )
            et = exp [ e ]
            net = ( et + wtime )
            for x in range ( 1 , N + 1 ) :
                if e + x > C :
                    continue
                prob = ( comb [ C - e , x ] * 1.0 / comb [ C , N ] ) * comb [ e , N - x ]
                prob /= other
                exp [ e + x ] += net * prob * ( probs [ e ] / probs [ e + x ] )
