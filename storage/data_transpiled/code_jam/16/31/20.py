def _import ( ) : return int ( next ( ) )
def _import ( ) : return long ( next ( ) )
def _import ( ) : return float ( next ( ) )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) :
def _import ( ) :
    while not _import ( ) or not _import ( ) :
        _import ( )
    return _import ( )
def _import ( ) :
    f = _import ( )
    g = _import ( )
    cnttest = _import ( )
    for test in range ( 1 , cnttest + 1 ) :
        print ( "Case #%d: " % test , end = ' ' )
        n = _import ( )
        p = [ _import ( ) ]
        sum = 0
        for i in range ( 1 , n + 1 ) :
            p.append ( _import ( ) )
            sum += p [ i ]
        q = [ _import ( ) for _ in range ( 1 , n + 1 ) ]
        while not q.empty ( ) :
            if len ( q ) == 1 :
                ind = q.pop ( ).ind
                print ( chr ( ind + ord ( 'A' ) - 1 ) , end = ' ' )
                p [ ind ] -= 1
                sum -= 1
                if p [ j ] > 0 :
                    q.append ( ( p [ j ] , ind ) )
            else :
                i , j = q.pop ( )
                if 2 * p [ j ] > sum - 1 :
                    print ( chr ( i + ord ( 'A' ) - 1 ) , end = ' ' )
                    p [ i ] -= 1
                    sum -= 2
                    if p [ i ] > 0 :
                        q.append ( ( p [ i ] , i ) )
    g ( )
