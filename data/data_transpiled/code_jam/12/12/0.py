def _import ( ) :
    from itertools import repeat
    from itertools import chain
    class B ( object ) :
        def read ( self ) :
            N = len ( self._import ( ) )
            a , b = [ next ( self ) for _ in range ( N ) ]
            return a + b
        def solve ( self ) :
            star = [ 0 ] * N
            total , res = 0 , 0
            while total < N * 2 :
                ok = False
                for i in range ( N ) :
                    if star [ i ] < 2 and b [ i ] <= total :
                        total += 2 - star [ i ]
                        star [ i ] = 2
                        res += 1
                        ok = True
                if ok :
                    continue
                p = - 1
                for i in range ( N ) :
                    if star [ i ] == 0 and a [ i ] <= total and ( p < 0 or b [ p ] < b [ i ] ) :
                        p = i
                if p < 0 :
                    print ( "Too Bad" )
                    return
                total += 1
                star [ p ] = 1
                res += 1
            print ( res )
        def run ( self ) :
            caseN = len ( self._import ( ) )
            for caseID in range ( 1 , caseN + 1 ) :
                read ( )
                print ( "Case #%d: " % caseID )
                solve ( self )
                sys.stdout.flush ( )
        def debug ( self , * args ) :
            print ( * deeprepr ( args ) , file = sys.stderr )
        def debug ( self , * args ) :
            print ( * deeprepr ( args ) , file = sys.stderr )
    B.run ( )
