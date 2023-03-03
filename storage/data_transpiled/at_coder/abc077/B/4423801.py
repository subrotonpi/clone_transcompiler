def main ( ) :
    import math
    from numpy.core import zeros
    from numpy.linalg import norm
    sc = zeros ( ( 10 , 10 ) )
    N = sc.sum ( )
    sc.close ( )
    for i in range ( N , - 1 , - 1 ) :
        if norm ( i ) % 1 == 0 :
            print ( int ( i ) )
            break
