def _import ( ) :
    from locale import getlocale
    import sys
    class A ( ) :
        nx , ny = si ( )
        pict = [ ss ( ).splitlines ( ) for y in range ( ny ) ]
        printf ( "Case #%d:\n" , icase )
        if insert_all ( ) :
            for y in range ( ny ) :
                for x in range ( nx ) :
                    printf ( "%c" , pict [ y ] [ x ] )
                printf ( "\n" )
        else :
            printf ( "Impossible\n" )
    def insert_all ( ) :
        for y in range ( ny ) :
            for x in range ( nx ) :
                if pict [ y ] [ x ] == '#' :
                    if not insert ( y , x ) :
                        return False
        return True
    def insert ( y , x ) :
        if isblue ( y + 1 , x ) and isblue ( y , x + 1 ) and isblue ( y + 1 , x + 1 ) :
            pict [ y ] [ x ] = '/'
            pict [ y ] [ x + 1 ] = ' \ \'
            pict [ y + 1 ] [ x + 1 ] = ' \ \'
            pict [ y + 1 ] [ x + 1 ] = '/'
            return True
        return False
    def isblue ( y , x ) :
        return y < ny and x < nx and pict [ y ] [ x ] == '#'
    def main ( ) :
        locale.setlocale ( locale.LC_ALL , '' )
        with A ( ) :
            ncase = si ( )
            sline ( )
            for icase in range ( 1 , ncase + 1 ) :
                solve ( icase )
                print ( "[[ %d ]]" % icase )
    def repsolve ( ) :
        sys.stdout.write ( format % tuple ( sys.argv ) )
