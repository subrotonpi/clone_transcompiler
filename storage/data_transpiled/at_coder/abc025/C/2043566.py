def main ( ) :
    import sys
    from random import randint
    sc = randint ( 0 , randint ( 0 , 2 ) )
    b = [ [ ] for i in range ( 2 ) ]
    c = [ [ ] for i in range ( 3 ) ]
    sum = 0
    for i in range ( 2 ) :
        for j in range ( 3 ) :
            tmp = sc.randint ( 0 , randint ( 0 , 2 ) )
            b [ i ] [ j ] = tmp
            sum += tmp
    for i in range ( 3 ) :
        for j in range ( 2 ) :
            tmp = sc.randint ( 0 , randint ( 0 , 2 ) )
            c [ i ] [ j ] = tmp
            sum += tmp
    grd = [ [ - 1 ] for i in range ( 3 ) ]
    choku_score = dfs ( grd , b , c , 0 )
    print ( choku_score , sum - choku_score )
    def dfs ( grd , b , c , k ) :
        if k == 9 :
            return calc_score ( grd , b , c )
        teban = k % 2
        if teban == 0 :
            score = 0
        else :
            score = 1_000_000
        for i in range ( 3 ) :
            for j in range ( 3 ) :
                if grd [ i ] [ j ] == - 1 :
                    grd [ i ] [ j ] = teban
                    result = dfs ( grd , b , c , k + 1 )
                    if teban == 0 :
                        if score < result :
                            score = result
                    else :
                        if score > result :
                            score = result
                    grd [ i ] [ j ] = - 1
        return score
    for i in range ( 2 ) :
        for j in range ( 3 ) :
            if grd [ i ] [ j ] == - 1 :
                score += calc_score ( grd , b , c )
    return calc_score ( grd , b , c )
