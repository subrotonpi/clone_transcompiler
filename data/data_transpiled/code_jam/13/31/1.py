def test_A ( ) :
    from locale import getlocale
    from locale import getlocale
    class A :
        def solve ( icase ) :
            name = ss ( )
            n = si ( )
            sline ( )
            idx = [ ]
            v = 0
            last_idx = - 1
            for i in range ( len ( name ) - 1 , - 1 , - 1 ) :
                c = cons ( name [ i ] )
                if not c :
                    v = 0
                else :
                    v += 1
                if v >= n :
                    last_idx = i + n - 1
                idx.append ( last_idx )
            res = 0
            for i in idx :
                if i in idx :
                    res += len ( idx ) - i
            printf ( "Case #%d: %d\n" , icase , res )
        def cons ( c ) :
            return c != "a" and c != "e" and c != "i" and c != "o" and c != "u"
    def main ( ) :
        locale.setlocale ( getlocale ( LC_ALL ) , getlocale ( LC_ALL ) )
        with A ( ) as repsolve :
            ncase = si ( )
            sline ( )
            for icase in range ( 1 , ncase + 1 ) :
                solve ( icase )
                print ( "[[ %d ]]" % icase , file = sys.stderr )
    with getlocale ( LC_ALL ) as si :
        return si ( )
    sl = getlocale ( LC_ALL )
    ss = getlocale ( LC_ALL )
    sline = getlocale ( LC_ALL )
    printf ( format % ( '%%s' , '%%s' , '%%s' ) , sline ( ) )
