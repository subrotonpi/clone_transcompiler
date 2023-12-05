def main ( ) :
    n = ni ( )
    a = na ( n )
    b = na ( n )
    cost = 0
    can = [ [ ] for i in range ( 51 ) ]
    for i in range ( 50 ) :
        can [ i ] [ a [ i ] ] = True
    for k in range ( 50 ) :
        for i in range ( 51 ) :
            for j in range ( 1 , k ) :
                g = [ ]
                for i in range ( 51 ) :
                    g.append ( i )
    def ntable ( n , m ) :
        for i in range ( 50 ) :
            for j in range ( 1 , k ) :
                g [ i ] [ i % j ] = True
    def nlist ( n , m ) :
        for i in range ( 50 ) :
            for j in range ( 50 ) :
                if can [ i ] [ j ] and g [ j ] [ b [ i ] ] :
                    flg = True
                    break
            if not flg :
                if k == 50 :
                    print ( - 1 )
                    return
                cost |= 1 << k + 1
                use = True
                break
        if use :
            for i in range ( n ) :
                tmp = [ ]
                for j in range ( 51 ) :
                    tmp [ j ] |= can [ i ] [ j ]
                    tmp [ j % ( k + 1 ) ] |= can [ i ] [ j ]
                can [ i ] = tmp
    print ( cost )
    def wf ( d ) :
        for k in range ( 50 ) :
            for i in range ( 50 ) :
                for j in range ( 50 ) :
                    if d [ i ] [ k ] and d [ k ] [ j ] :
                        d [ i ] [ j ] = True
    return d
