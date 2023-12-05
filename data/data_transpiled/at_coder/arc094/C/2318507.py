def import import sys , StringIO , os , sys , sys , flags = 0 ) :
    from io import StringIO
    from math import sin , cos
    bf = sys.stdin
    f = StringIO ( )
    n = int ( bf.readline ( ) )
    a = [ ]
    b = [ ]
    sum = 0
    min = sys.maxint
    for i in range ( n ) :
        line = bf.readline ( ).split ( )
        a.append ( int ( line [ 0 ] ) )
        b.append ( int ( line [ 1 ] ) )
        if a [ i ] > b [ i ] :
            if b [ i ] < min :
                min = b [ i ]
        sum += a [ i ]
    if min == sys.maxint :
        f.write ( "\n" )
    else :
        f.write ( "%.2f\n" % ( sum - min ) )
    f.close ( )
    sys.exit ( 0 )
