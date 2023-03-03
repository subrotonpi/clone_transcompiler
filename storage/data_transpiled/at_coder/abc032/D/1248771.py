def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            N = sc.randint ( 1 , 200 )
            W = sc.randint ( 1 , 200 )
            v = [ ]
            w = [ ]
            flg = True
            for i in range ( 1 , N ) :
                v.append ( sc.randint ( 1 , N ) )
                w.append ( sc.randint ( 1 , N ) )
            for i in range ( 1 , N ) :
                x = A [ 0 ]
                if x [ 0 ] >= temp :
                    v.append ( x [ 0 ] )
            for i in range ( 1 , N ) :
                x = B [ 0 ]
                if x [ 0 ] >= temp :
                    v.append ( temp )
            for i in range ( 1 , N ) :
                wt = x [ 0 ]
                if w [ 0 ] <= temp :
                    right = len ( alist )
    elif flg :
        dp = [ ]
        for j in range ( 1 , 200 * 1000 + 1 ) :
            if j <= v [ 0 ] :
                dp.append ( [ ] )
            else :
                dp.append ( [ ] )
        for i in range ( 1 , int ( math.pow ( 2 , m ) ) ) :
            vt = 0
            for j in range ( 1 , N ) :
                if i & ( 1 << j ) :
                    vt += v [ j ]
                    wt += w [ j ]
            x = [ vt , wt ]
            A.append ( x )
        for i in range ( 1 , int ( math.pow ( 2 , N - m ) ) ) :
            if i & ( 1 << j ) :
                v.append ( int ( math.pow ( 2 , m ) ) )
            else :
                v.append ( int ( math.pow ( 2 , m ) ) )
        for j in range ( 1 , N ) :
            if j & ( 1 << j ) :
                v.append ( j )
                wt += w [ j ]
    print ( ans )
