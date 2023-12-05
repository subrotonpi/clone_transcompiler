def main ( ) :
    n = ni ( )
    a = na ( n )
    turn = 1
    while True :
        even = odd = 0
        oddNum = 0
        for v in a :
            if v % 2 == 0 :
                even += 1
            else :
                odd += 1
                oddNum = v
        if even % 2 == 1 :
            print ( 'First' if turn == 1 else 'Second' )
            break
        elif even % 2 == 0 and ( odd != 1 or oddNum == 1 ) :
            print ( 'Second' if turn == 1 else 'First' )
            break
        turn = - turn
        gcd = 0
        for i in range ( n ) :
            if a [ i ] % 2 == 1 :
                a [ i ] -= 1
            gcd = gcd or a [ i ]
        for i in range ( n ) :
            a [ i ] /= gcd
    def main ( ) :
        with None , open ( sys.argv [ 1 ] , 'r' ) as f :
            start = time.time ( )
            debug = sys.argv [ 1 ] if len ( sys.argv ) > 1 else None
            if debug :
                with _open ( sys.argv [ 1 ] , 'r' ) as f :
                    f.write ( '%.4f' % ( sys.argv [ 1 ] , ) )
        return f.read ( 32768 )
    def next ( ) :
        while not sys.argv [ 1 ] or not sys.argv [ 1 ] :
            try :
                sys.argv.remove ( sys.argv [ 1 ] )
            except :
                sys.argv.remove ( sys.argv [ 1 ] )
        return sys.argv [ 1 ]
    def next ( ) :
        while True :
            sys.argv.remove ( sys.argv [ 1 ] )
    def next ( ) :
        sys.argv.remove ( sys.argv [ 1 ] )
    return next
