def main ( ) :
    n = ni ( )
    m = ni ( )
    a = na ( m )
    ax = [ ]
    ptr = 1
    op = 0
    for v in a :
        if v % 2 == 1 :
            if op == 2 :
                print ( "Impossible" )
                return
            ax.append ( [ 0 if op == 0 else m - 1 ] )
            op += 1
        else :
            ax.append ( [ ptr ] )
            ptr += 1
    def ntable ( n , m ) :
        if m > 1 :
            l = ( m - 1 ) if m == 1 else m
            bx = [ ]
            for i in range ( l ) :
                if i == m - 1 :
                    bx.append ( ax [ i ] - 1 )
                elif i == 0 :
                    bx.append ( ax [ i ] + 1 )
                else :
                    bx.append ( ax [ i ] )
        elif ax [ 0 ] > 1 :
            l = 2
            bx = [ ax [ 0 ] - 1 , 1 ]
        else :
            l = 1
            bx = [ 1 ]
        for i in range ( m ) :
            print ( ax [ i ] + ( "" if i < m - 1 else "" ) , end = "" )
        print ( )
        print ( l )
        for i in range ( l ) :
            print ( bx [ i ] + ( "" if i < l - 1 else "" ) , end = "" )
        print ( )
    def main ( ) :
        with open ( sys.argv [ 1 ] , "r" , encoding = "utf-8" ) as f :
            start = time.time ( )
            debug = sys.argv [ 1 ] if debug else None
            if debug :
                with open ( sys.argv [ 1 ] , "r" , encoding = "utf-8" ) as f :
                    f.write ( f.read ( ) )
    return main
