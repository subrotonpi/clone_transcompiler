def Main ( ) :
    _sys.stdin.write ( '\n' )
    n , m , sum = _sys.stdin.read ( ).split ( '\n' )
    a = [ 0 ] * ( m + 1 )
    for i in range ( n ) :
        l , r , s = _sys.stdin.read ( ).split ( '\n' )
        a [ l ] += s
        a [ r ] -= s
        sum += s
    _sys.stdout.write ( '\n'.join ( map ( str , a ) ) )
    print ( sum - _sys.stdout.read ( ) )
