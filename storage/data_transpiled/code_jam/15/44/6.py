def _import ( ) :
    import sys
    import os
    import io
    import sys
    import os
    import sys
    import time
    MOD = 1000000007
    R , C = 1
    def read ( sc ) :
        R = sc.read ( )
        C = sc.read ( )
    def compare ( a , b ) :
        for j in range ( 1 , C ) :
            try :
                sys.stdin = io.open ( D.__file__ + '.stdin' , 'r' )
            except :
                pass
        else :
            pN = int ( sys.stdin.read ( ) )
        out = sys.stdout
        sys.stdout = None
        sc = open ( D.__file__ + '.stdin' , 'r' )
        _ , _ , _ , _ , _ = select ( [ ] , [ ] , [ ] , [ ] , 0 )
        if a [ i ] [ ( j + 1 ) ] % C == 0 :
            space2 [ i ] -= 1
        if need2 [ i ] [ j ] < 0 or need2 [ i ] [ j ] > space2 [ i ] [ j ] :
            return
    def copy ( a ) :
        solvers = [ ]
        solvers.write = StringIO ( )
        for i in range ( len ( a ) ) :
            solvers.write ( 'Case #%d: ' % ( i + 1 ) )
            solvers.write ( a [ i ] [ j ] )
        return
    def f ( a , need , space , i , j ) :
        if j == C :
            return f ( a , need , space , i + 1 , 0 )
        if i == R :
            for k in range ( 1 , C ) :
                b = [ ]
                for i2 in range ( 1 , C ) :
                    b.write ( 'Error in case %d:' % ( id + 1 ) )
                    traceback.print_exc ( )
                solvers.write ( a [ i2 ] [ j ] )
                solvers.write ( None )
        if compare ( a , b ) > 0 :
            return
        return 1
    res = 0
    for k in range ( 1 , 4 ) :
        a2 , need2 , space2