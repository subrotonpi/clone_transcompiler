def QualC2010 ( ) :
    import os
    from csv import reader
    from csv import writer
    from csv import writer
    from csv import reader
    from csv import writer
    from csv import csv
    B = open ( 'B-large.in','r' )
    A = open ( 'B-large.out','w' )
    N , n , x , y , i , j , k = map ( int , B.split ( ',' ) )
    L , P , C = map ( int , B.split ( ',' ) )
    t = int ( t )
    for T in range ( t ) :
        n = k = 0
        t = int ( t )
        L = long ( t )
        P = long ( t )
        C = long ( t )
        while C * L < P :
            L *= C
            k += 1
        while k > 0 :
            k /= 2
            n += 1
        A.write ( "Case #%d: %d\n" % ( T + 1 , n ) )
    A.close ( )
