def _import ( ) : return int ( next ( ) )
def _solve ( ) :
    n = ni ( )
    m = ni ( )
    aary = na ( m )
    aary = sorted ( aary )
    mary = [ - 1 , 2 , 5 , 5 , 4 , 5 , 6 , 3 , 7 , 6 ]
    cary = [ ]
    for i in range ( m ) :
        cary.append ( mary [ aary [ i ] ] )
    dp = [ ]
    dp.append ( int ( 0 ) )
    for i in range ( 1 , n + 1 ) :
        for j in range ( m ) :
            before = i - cary [ j ]
            if before >= 0 :
                dp [ i ] = max ( dp [ i ] , dp [ before ] + 1 )
    rest = n
    parts = [ ]
    for i in dp [ n : ] :
        for j in range ( m - 1 , 0 , - 1 ) :
            if rest - mary [ aary [ j ] ] >= 0 and dp [ rest - mary [ aary [ j ] ] ] == i - 1 :
                rest -= mary [ aary [ j ] ]
                parts.append ( aary [ j ] )
                break
    print ( ' '.join ( parts ) )
def _open ( ) :
    debug_data_path = os.getenv ( 'DD_PATH' )
    if debug_data_path is not None :
        with open ( debug_data_path , 'r' ) as f :
            return f.read ( )
    _solve ( )
def _readline ( ) :
    while not _readline ( ) or not _readline ( ) :
        try :
            _readline ( )
        except :
            raise
    return _readline ( )
return _readline ( )
