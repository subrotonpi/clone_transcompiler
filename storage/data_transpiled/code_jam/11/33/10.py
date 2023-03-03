def _import ( ) :
    from random import randint , randrange
    init_FileIO ( large = False )
    cases = randint ( 1 , randrange ( 1 , 10 ) )
    for cas in range ( 1 , cases + 1 ) :
        n , lo , hi = randint ( 1 , randrange ( 1 , 10 ) )
        a = [ randint ( 1 , n ) for _ in range ( n ) ]
        print ( "Case #%d: " % cas , end = ' ' )
        ans = - 1
        for f in range ( lo , hi + 1 ) :
            ok = True
            for i in range ( len ( a ) ) :
                ok &= ( a [ i ] and f % a [ i ] == 0 ) or ( f and a [ i ] % f == 0 )
            if ok :
                ans = f
                break
        if ans < 0 :
            print ( "NO" )
        else :
            print ( ans )
    f = open ( 'C-%s.in' % ( 'large' if large else 'small-attempt0' ) , 'r' )
    def init_FileIO ( large ) :
        sys.stdin = open ( 'C-%s.in' % ( 'large' if large else 'small-attempt0' ) , 'r' )
        sys.stdout = sys.stdout
        f = open ( 'C-%s.out' % ( 'large' if large else 'large-attempt0' ) , 'r' )
    def next ( ) :
        while not f.closed :
            s = f.readline ( )
            if not s :
                return None
            yield s
    f.close ( )
    return next
