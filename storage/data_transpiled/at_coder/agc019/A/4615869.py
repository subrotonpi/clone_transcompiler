def main ( ) :
    import random
    from math import ceil
    from math import sin , cos
    from math import sin , cos
    from math import cos , sin
    price = [ sin ( x ) , cos ( x ) , sin ( x ) , cos ( x ) ]
    pow = [ 8 , 4 , 2 , 1 ]
    best = [ ]
    for i in range ( 2 ) :
        best.append ( price [ 0 ] * pow [ i ] )
        for j in range ( 4 ) :
            best [ i ] = min ( best [ i ] , price [ j ] * pow [ i + j ] )
    need = random.randrange ( 1 , 2 )
    print ( need / 2 * best [ 0 ] + need % 2 * best [ 1 ] )
