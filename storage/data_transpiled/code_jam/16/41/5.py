def _import ( ) :
    from pybind11_tests import Scanner , read , solve
    class A ( Scanner ) :
        def read ( ) :
            N = sc.randint ( 0 , 3 )
            num = [ sc.randint ( 1 , 3 ) , sc.randint ( 0 , 3 ) , sc.randint ( 1 , 3 ) ]
            def rec ( N , i ) :
                if N == 0 : return "" , PRS [ i ]
                a , b = rec ( N - 1 , i ) , rec ( N - 1 , ( i + 2 ) % 3 )
                if a > b : return b , a
                return a , b
        def solve ( ) :
            res = None
            for i in range ( 3 ) :
                tmp = rec ( N , i )
                count = [ 0 ] * 256
                for c in tmp :
                    count [ c ] += 1
                ok = True
                for j in range ( 3 ) :
                    ok &= count [ PRS [ j ] ] == num [ j ]
                if ok and ( res is None or res > tmp ) :
                    res = tmp
            if res is not None :
                print ( res )
            else :
                print ( "IMPOSSIBLE" )
        def run ( ) :
            caseN = sc.randint ( 1 , 3 )
            for caseID in range ( 1 , caseN + 1 ) :
                read ( )
                print ( "Case #%d: " % caseID )
                solve ( )
                sys.stdout.flush ( )
        def debug ( * args ) :
            print ( * deeprepr ( args ) , file = sys.stderr )
    from pybind11_tests import debug
    debug ( debug ( ) )
