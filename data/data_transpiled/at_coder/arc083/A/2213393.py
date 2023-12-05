def main ( ) :
    import sys
    from itertools import repeat
    sc = sys.stdin
    a , b , c , d , e , f = map ( int , repeat ( a , 100 * a ) )
    water = 0
    sugar = 0
    for i in range ( 0 , f + 1 , 100 * a ) :
        for j in range ( 0 , i + 1 , 100 * b ) :
            for k in range ( 0 , i + 1 , f + 1 , c ) :
                for l in range ( 0 , i + 1 , f + 1 , d ) :
                    if ( k + l ) * 100 <= e * ( i + j ) :
                        if ( water == 0 and sugar == 0 ) or sugar * ( i + 1 + j + k + l ) < ( k + l ) * water :
                            water = i + 1 + j + k + l
                            sugar = k + l
    print ( water , sugar )
