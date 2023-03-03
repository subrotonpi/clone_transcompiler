def _ import _ , os , sys , imp , code , compile , code , sys ) :
    import random
    import sys
    mod = 998244353
    def add ( x , y ) :
        x += y
        if x >= mod :
            x -= mod
        return x
    def mul ( x , y ) :
        return int ( x * 1 * y % mod )
    def cache ( ) :
        while not code or not code :
            s = None
            try :
                s = open ( code , 'r' )
            except IOError :
                pass
            else :
                if s :
                    return s
        return code
    def solve ( code ) :
        res = cache ( )
        if not res :
            n = len ( code )
            dp = [ 1 ] * ( n + 1 )
            for pref in range ( n ) :
                cur = dp [ pref ]
                if cur == 0 :
                    continue
                dp [ pref + 1 ] = add ( dp [ pref + 1 ] , cur )
                if code [ pref ] == '1' :
                    dp [ pref + 1 ] = add ( dp [ pref + 1 ] , cur )
                more = n - pref
                for len in range ( 1 , more // 2 + 1 ) :
                    tmp = [ ]
                    for cnt in range ( 2 , more + 1 ) :
                        for i in range ( len ) :
                            have_zero = False
                            for j in range ( cnt ) :
                                if code [ pref + j * len + i ] == '0' :
                                    have_zero = True
                                    break
                            if have_zero :
                                tmp.append ( '0' )
                            else :
                                tmp.append ( '1' )
                        ways = solve ( ''.join ( tmp ) )
                        dp [ pref + cnt * len ] = add ( dp [ pref + cnt * len ] , mul ( ways , cur ) )
                cache ( )
            return cache ( )
        def solve22 ( code ) :
            rnd = random.Random ( 123 )
            t = [ '1' if rnd.random ( ) else '0' for i in range ( 100 ) ]
            code = compile ( t )
            return code
        return solve ( solve22 )
    