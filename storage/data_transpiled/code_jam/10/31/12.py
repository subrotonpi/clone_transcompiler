def gcj2010r1c ( ) :
    import os
    from time import time
    from sys import argv
    try :
        if argv [ 1 ] :
            f = open ( argv [ 1 ] )
        else :
            f = sys.stdin
        lines = f.readlines ( )
    except :
        lines = [ ]
    case_count = int ( lines [ 0 ] )
    start_time = time ( )
    for i in range ( case_count ) :
        lines = f.readlines ( )
        nums = lines [ 0 ].split ( )
        n = int ( nums [ 0 ] )
        a = [ ]
        b = [ ]
        for j in range ( n ) :
            lines = f.readlines ( )
            nums = lines [ 1 ].split ( )
            a.append ( int ( nums [ 0 ] ) )
            b.append ( int ( nums [ 1 ] ) )
        print ( "Case #" , end = "" )
        print ( i + 1 , end = "" )
        print ( ": " , end = "" )
        print ( count_intersect ( a , b ) )
    print ( "Elasped Time : " , time ( ) - start_time , file = sys.stderr )
    f.close ( )
