def main ( ) :
    import sys
    from numpy.linalg import eigs
    from numpy.random import rand
    f = rand ( )
    T = sum ( eigs.shape [ 0 ] for eigs in eigs.T )
    for i in range ( T ) :
        t = rand ( )
        D , N = sum ( eigs.shape [ 0 ] for eigs in t.T ) , sum ( eigs.shape [ 1 ] for eigs in t.T )
        ret = float ( 'inf' )
        for j in range ( N ) :
            t = rand ( )
            K , S = sum ( eigs.shape [ 0 ] for eigs in t.T ) , sum ( eigs.shape [ 1 ] for eigs in t.T )
            my_time , other_time = D / ret , ( D - K ) * 1.0 / S
            if my_time < other_time :
                ret = D / other_time
        print ( 'Case #%d: %f\n' % ( i + 1 , ret ) )
