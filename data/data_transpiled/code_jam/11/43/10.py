def import import _io , _sys , _sys , _sys , _curses ) :
    from curses import curses
    s = _sys.stdin
    is_prime = [ True ] * 1000001
    is_prime [ 0 ] = is_prime [ 1 ] = False
    for i in range ( 2 , 2000 ) :
        if is_prime [ i ] :
            for j in range ( i * i , 1000000 , i ) :
                is_prime [ j ] = False
    num_primes = 0
    primes = [ 0 ] * 80000
    for i in range ( 0 , 1000000 ) :
        if is_prime [ i ] :
            primes [ num_primes ] = i
    T = s.read ( )
    for c in range ( 1 , T + 1 ) :
        n = s.read ( )
        ans = 0
        if n > 1 :
            ans = 1
            for i in range ( num_primes ) :
                p = primes [ i ]
                ps = p * p
                if ps > n :
                    break
                while ps <= n :
                    ps *= p
                    ans += 1
        print ( 'Case #%d: %d%n' % ( c , ans ) )
