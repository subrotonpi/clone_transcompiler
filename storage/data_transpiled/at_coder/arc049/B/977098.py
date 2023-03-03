def _solve ( n , p , c ) :
    import numpy as np
    from math import sin , cos , sqrt
    maxt = 0.0
    for i in range ( n ) :
        for j in range ( n ) :
            if p [ i ] > p [ j ] :
                x = ( c [ i ] * p [ i ] + c [ j ] * p [ j ] ) / ( c [ i ] + c [ j ] )
                t = c [ i ] * ( p [ i ] - x )
                maxt = max ( maxt , t )
    return maxt
