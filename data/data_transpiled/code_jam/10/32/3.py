def test_TWO ( ) :
    import math
    from sympy import factorial
    from sympy.utilities.misc import get_filesystem_encoding
    f = open ( 'test.txt' , 'r' )
    T = int ( f.readline ( ) )
    for t in range ( 1 , T + 1 ) :
        line = f.readline ( ).split ( )
        L , P , C = [ int ( x ) for x in line [ : - 1 ] ]
        y = 1
        while L ** 2 < P and L ** 2 > 0 :
            L *= C
            y += 1
        print ( "Case #{}: {}".format ( t , int ( math.log ( y ) / math.log ( 2 ) + 0.9999 ) ) )
