def _import ( ) :
    from locale import getlocale
    import select
    class B ( object ) :
        mins = [ 0 ] * 3000001
        def solve ( icase ) :
            x = si ( )
            y = si ( )
            k = mins [ abs ( x ) + abs ( y ) ]
            res = [ ]
            while x or y or k :
                if abs ( x ) > abs ( y ) :
                    if x :
                        x -= k
                        c = 'E'
                    else :
                        x += k
                        c = 'W'
                else :
                    if y :
                        y -= k
                        c = 'N'
                    else :
                        y += k
                        c = 'S'
                k -= 1
                res.append ( c )
            printf ( "Case #%d: " % icase )
            for c in res :
                print ( c , end = '' )
            print ( )
    def main ( ) :
        locale.setlocale ( locale.LC_ALL , '' )
        with B ( ) :
            rep_solve ( )
        def rep_solve ( ) :
            k = 0
            for i in range ( 1 , len ( mins ) ) :
                k += i
                if k >= len ( mins ) :
                    break
                for j in range ( k , 0 , - 2 ) :
                    if mins [ j ] :
                        break
                    mins [ j ] = i
            s = sys.stdin.readline ( )
            ncase = si ( )
            sline ( )
            for icase in range ( 1 , ncase + 1 ) :
                solve ( icase )
                print ( "[[ %d ]]" % icase , file = sys.stderr )
    with open ( 'i.txt' , 'r' ) as f :
        si ( )
        sl ( )
        ss ( )
        sline ( )
    def printf ( format , * args ) :
        print ( format % args , file = sys.stderr )
