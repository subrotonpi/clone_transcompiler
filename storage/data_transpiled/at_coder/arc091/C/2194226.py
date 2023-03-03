def import os , sys , stdin , stdout , sys , stderr , line , count , a , b , * , args , ** kwargs ) :
    from io import BufferedReader , open
    bf = BufferedReader ( stdin )
    f = open ( stdout , 'w' )
    line = bf.readline ( ).split ( )
    n , a , b = map ( int , line.split ( ) )
    if a + b > n + 1 :
        f.write ( '-1' )
    elif n > 1 * a * b :
        f.write ( '-1' )
    else :
        lines = [ ]
        lengths = [ 1 ] * b
        lengths [ 0 ] = a
        count = a + b - 1
        for i in range ( 1 , b ) :
            while count < n :
                lengths [ i ] += 1
                count += 1
                if lengths [ i ] == a :
                    break
        cur = n
        for i in range ( b ) :
            for j in range ( cur - lengths [ i ] + 1 , cur + 1 ) :
                lines.append ( "%d " % j )
            cur -= lengths [ i ]
        f.write ( '\n'.join ( lines ) )
    f.close ( )
    sys.exit ( 0 )
