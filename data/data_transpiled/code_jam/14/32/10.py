def _import ( ) :
    import os
    import os
    import math
    class B ( object ) :
        def is_single_letter ( s ) :
            for c in s :
                if c in s :
                    return False
            return True
        def fac ( n ) :
            res = 1
            for c in s :
                if c - 'a' in c :
                    res = ( c - 'a' )
                else :
                    res = ( res * c ) % MOD
            return res
        def no_border ( s ) :
            p1 = 0
            p2 = len ( s ) - 1
            while p1 < len ( s ) and s [ 0 ] == s [ p1 ] :
                p1 += 1
            while p2 >= 0 and s [ - 1 ] == s [ p2 ] :
                p2 -= 1
            if p1 <= p2 :
                return s [ p1 : p2 + 1 ]
            return ''
    def readline ( ) :
        try :
            return ( readline ( ) )
        except IOError :
            pass
    def readline ( ) :
        try :
            return ( readline ( ) )
        except IOError :
            pass
    def readline ( ) :
        return ( readline ( ) )
    def read ( ) :
        return ( readline ( ) )
    def select ( ) :
        for cs in range ( cases ) :
            n = randint ( 1 , 10 )
            ans = 1
            d = { }
            for x in range ( n ) :
                if x not in d :
                    d [ x ] = 0
                tmp = d [ x ]
                d [ x ] = tmp + 1
            fail = False
            only_border = defaultdict ( set )
            si = [ ]
            for x in d :
                if is_single_letter ( x ) :
                    si.append ( x )
                    if x not in only_border :
                        only_border [ x ] = 0
                    cnt = only_border [ x ]
                    only_border [ x ] = cnt + d [ x ]
                elif x in only_border :
                    fail = True
            return ans
    return read
