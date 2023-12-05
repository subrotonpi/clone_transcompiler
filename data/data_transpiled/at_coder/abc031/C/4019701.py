def _import ( ) : return int ( next ( ) )
def _import ( ) : return int ( next ( ) )
def _import ( ) : return float ( next ( ) )
def _main ( ) :
    sc = _import ( )
    N = sc.__next__ ( )
    ary = [ ]
    for i in range ( N ) :
        ary.append ( sc.__next__ ( ) )
    ths = [ ]
    aok = [ ]
    for i in range ( N ) :
        ths.append ( 114514 )
        aok.append ( - 114514 )
    for i in range ( N ) :
        for j in range ( N ) :
            if i != j :
                tkhs = _calc_kisu ( min ( i , j ) , max ( i , j ) , ary )
                aoki = _calc_gusu ( min ( i , j ) , max ( i , j ) , ary )
                if aoki > aok [ i ] :
                    aok [ i ] = aoki
                    ths.append ( tkhs )
    tkhsp = - 114514
    for i in range ( N ) :
        tkhsp = max ( tkhsp , ths [ i ] )
    pl ( tkhsp )
    def _calc_kisu ( s , g , a ) :
        sum = 0
        for i in range ( s , g + 1 , 2 ) :
            sum += a [ i ]
        return sum
    def _calc_gusu ( s , g , a ) :
        sum = 0
        for i in range ( s + 1 , g + 1 , 2 ) :
            sum += a [ i ]
        return sum
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
