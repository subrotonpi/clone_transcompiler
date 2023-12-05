def round1 ( ) :
    import decimal
    import os
    import sys
    import math
    import os
    import sys
    if sys.platform == 'win32' :
        import decimal
        if sys.version_info [ 0 ] < 3 :
            sys.exit ( "Error: 'C-small.in' is not supported" )
    infile = open ( 'C-small.in' , 'r' )
    outfile = open ( 'C-small-out' , 'w' )
    ans = [ ]
    ans.append ( '027' )
    tmp = ''
    a = decimal.Decimal ( '2.2360679774997896964091736687313' )
    a = a + decimal.Decimal ( 3 )
    b = a * a * a
    for i in range ( 3 , 30 + 1 ) :
        tmp = str ( b ).split ( '.' ) [ 0 ]
        ans.append ( tmp [ - 3 : len ( tmp ) ] )
        b = b * a
    T = int ( infile.readline ( ) )
    for i in range ( 1 , T + 1 ) :
        n = int ( infile.readline ( ) )
        outfile.write ( 'Case #{}: {}\n'.format ( i , ans [ n ] ) )
    outfile.flush ( )
