def _import ( * args ) : return _import ( None , args , "" , os.getpid ( ) )
MOD = 1_000_000_000 + 7
fac = [ ]
invfac = [ ]
inv = [ ]
def _import ( n , k ) :
    fac.append ( fac [ 1 ] )
    invfac.append ( invfac [ 1 ] )
    inv.append ( inv [ 1 ] )
    for i in range ( 2 , len ( fac ) ) :
        fac [ i ] = fac [ i - 1 ] * i % MOD
        inv [ i ] = MOD - inv [ int ( MOD % i ) ] * ( MOD / i ) % MOD
        invfac [ i ] = invfac [ i - 1 ] * inv [ i ] % MOD
    return fac
def _tr ( * args ) :
    sc = _import ( )
    n = sc.recv_handle ( )
    a = [ sc.recv_handle ( ) for _ in range ( n ) ]
    ans = 1
    for i in range ( n ) :
        if a [ i ] : continue
        j = i
        while j + 1 < n and a [ j + 1 ] == - 1 : j += 1
        c = j - i + 1
        ans = ans * _tr ( a [ j + 1 ] - a [ i - 1 ] + c , c ) % MOD
        i = j
    print ( ans )
