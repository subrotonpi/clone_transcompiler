def _import ( ) :
    from io import BytesIO
    from os import urandom
    from os import urandom
    from os import urandom
    from os import urandom
    from os import urandom
    from os.path import expanduser
    from os.path import expanduser
    from os.path import expanduser
    from os.path import expanduser
    from os.path import expanduser
    from os.path import expanduser
    from os.path import expanduser
    from os.path import expanduser
    from os.path import expanduser
    from os.path import expanduser
    from os.path import expanduser
    from os.environ import environ
    MOD = 1_000_000_007
    a = urandom ( 1 )
    b = urandom ( 2 )
    prime = Prime ( 1_000_000 )
    primes = prime.prime_list ( )
    hm = { }
    for x in range ( b + 1 , a + 1 ) :
        pf = urandom ( expanduser ( x ) )
        for k , value in pf.items ( ) :
            if k in hm :
                hm [ k ] = hm [ k ] + value
            else :
                hm [ k ] = value
    ans = 1
    for e in hm.values ( ) :
        ans *= ( e + 1 )
        ans %= MOD
    pr.write ( ans )
    def pf ( x ) :
        hm = { }
        n = x
        for p in primes :
            if long ( p ) * p > x :
                break
            cnt = 0
            while n % p == 0 :
                cnt += 1
                n //= p
            if cnt > 0 :
                hm [ long ( p ) ] = cnt
        if n != 1 :
            if n in hm :
                hm [ n ] = hm [ n ] + 1
            else :
                hm [ n ] = 1
        return hm
    from os import environ
    from os import urandom
    from os import path
    from os import environ as environ
    p = environ.copy ( )
    m = int ( os.environ.get ( 'PATH' , '' ) )
    for bi in urandom ( 1 ) :
        i = int ( i )
        p.write ( str ( bi ) )
    return p
