def _ ( ) : return
def solve ( ) :
    a = ni ( )
    b = ni ( )
    d = ntable ( a , b )
    m = 100
    c = [ ]
    for v in c :
        a.append ( ni ( ) )
    def ntable ( n , m ) :
        for i in range ( 1 , n ) :
            a.append ( ni ( ) )
    def nlist ( n , m ) :
        for i in range ( 1 , m ) :
            for j in range ( 0 , m ) :
                c [ i ] [ j ] = max ( c [ i ] [ j ] , d [ x - 1 ] [ y - 1 ] - i * x - j * y )
    def ni ( ) :
        for x in range ( 1 , n ) :
            for y in range ( 1 , m ) :
                test = sys.stdin.read ( )
                for i in range ( 0 , m ) :
                    if c [ i ] [ j ] >= 0 :
                        test = min ( test , i * x + j * y + c [ i ] [ j ] )
            if test != d [ x - 1 ] [ y - 1 ] :
                print ( "Impossible" )
                return
    edges = m * 2
    for i in range ( 0 , m ) :
        for j in range ( 0 , m ) :
            if c [ i ] [ j ] >= 0 :
                edges += 1
    print ( "Possible" )
    print ( ( m + 1 ) * 2 , edges )
    for i in range ( 1 , m + 1 ) :
        print ( i , " " , ( i + 1 ) * 2 - j , " X" )
    for i in range ( m + 2 , ( m + 1 ) * 2 + 1 ) :
        print ( i , " " , ( i + 1 ) * 2 + " Y" )
    print ( " " , ( m + 1 ) * 2 )
