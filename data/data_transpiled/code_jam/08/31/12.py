def gcj ( ) :
    import os
    import sys
    from os.path import join
    from os import sep
    from os.path import join
    from os import sep
    from os.path import join
    from os import sep
    from os import chdir
    class MainA ( ) :
        def reverse ( p ) :
            i , j = 0 , len ( p ) - 1
            while i < j :
                a = p [ i ]
                p [ i ] , p [ j ] = p [ j ] , a
                i += 1
                j -= 1
            return p
    cin = open ( 'D:\\topcoder\\eclipse-workspace\\ACM\\gcj\\A-small.in' , 'r' )
    out = open ( 'D:\\topcoder\\eclipse-workspace\\ACM\\gcj\\Aout.txt' , 'w' )
    testcase = int ( cin.readline ( ) )
    for tst in range ( 1 , testcase + 1 ) :
        P , K , L = [ int ( x ) for x in cin.readline ( ).split ( ) ]
        hits = [ ]
        hits = [ int ( x ) for x in cin.readline ( ).split ( ) ]
        hits.sort ( )
        reverse ( hits )
        res = 0
        for i in hits :
            res += ( i // K + 1 ) * hits [ i ]
        out.write ( 'Case #%d: %d\n' % ( tst , res ) )
