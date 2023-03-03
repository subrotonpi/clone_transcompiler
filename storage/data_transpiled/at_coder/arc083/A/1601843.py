def main ( ) :
    import sys
    from numpy import array
    from numpy.linalg import norm
    from numpy.random import randint
    A = randint ( 1 , 100 )
    B = randint ( 1 , 100 )
    C = randint ( 1 , 100 )
    D = randint ( 1 , 100 )
    E = randint ( 1 , 100 )
    F = randint ( 1 , 100 )
    sys.stdout.write ( '\n' )
    x = [ 100 * A * i + 100 * B * j for i in range ( 0 , A * 100 ) for j in range ( 0 , B * 100 ) ]
    y = [ C * i + D * j for i in range ( 0 , C * 100 ) for j in range ( 0 , D * 100 ) ]
    maxtotal = 100 * A
    maxs = maxper = 0
    for i in x :
        for j in range ( 0 , Y ) :
            amounts = y [ j ]
            amountw = x [ i ]
            if not amounts and not amountw :
                continue
            if amounts + amountw <= F and 100 * amounts <= E * amountw :
                if float ( amounts ) / float ( amounts + amountw ) > maxper :
                    maxtotal = amounts + amountw
                    maxs = amounts
                    maxper = float ( amounts ) / float ( amounts + amountw )
    print ( maxtotal , maxs )
