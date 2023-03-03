def main ( ) :
    import math
    from numpy import linspace
    from numpy.linalg import daikd
    from numpy.random import random
    N = random.randint ( 1 , N )
    x = random.randint ( 0 , N )
    y = random.randint ( 0 , N )
    t = random.randint ( 0 , N )
    r = random.randint ( 0 , N )
    if N == 1 :
        print ( 0.0 )
        return
    G = [ [ math.sqrt ( float ( pow ( x [ i ] - x [ j ] , 2.0 ) ) + float ( pow ( y [ i ] - y [ j ] , 2.0 ) ) ) / float ( min ( t [ i ] , r [ j ] ) ) for i in range ( N ) ] for j in range ( N ) ]
    d = daikd ( G , 0 )
    d = [ max ( d , d [ i ] + N - i - 1 ) for i in range ( N ) ]
    print ( "%10.10f\n" % max )
    def daikd ( G , start ) :
        n = G.shape [ 0 ]
        d = [ ]
        used = [ False for i in range ( n ) ]
        d.append ( 0.0 )
        while True :
            v = - 1
            for u in range ( n ) :
                if not used [ u ] and ( v == - 1 or d [ u ] < d [ v ] ) :
                    v = u
            if v == - 1 :
                break
            used [ v ] = True
            for u in range ( n ) :
                d [ u ] = min ( d [ u ] , d [ v ] + G [ v ] [ u ] )
        return d
    return daikd
