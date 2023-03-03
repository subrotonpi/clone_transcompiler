def main ( ) :
    import sys
    for i in range ( sys.argv [ 1 ] ) :
        N = sys.argv [ 1 ]
        t = 1
        a = 1
        for i in range ( N ) :
            T = sys.argv [ 1 ]
            A = sys.argv [ 2 ]
            tx = - 1
            ax = - 1
            for ti in range ( T ) :
                if ( t + ti ) % T == 0 :
                    tx = t + ti
                    ax = ( tx / T ) * A
            ty = - 1
            ay = - 1
            for ai in range ( A ) :
                if ( a + ai ) % A == 0 :
                    ay = a + ai
                    ty = ( ay / A ) * T
            tn = - 1
            an = - 1
            if tx >= t and ax >= a :
                tn = tx
                an = ax
            if tn == - 1 or ty >= t and ay >= a and ( ty + ay ) < ( tn + an ) :
                tn = ty
                an = ay
            t = tn
            a = an
            if t == - 1 :
                zero = 1 / 2
                hoge = 10 / zero
        print ( t + a )
