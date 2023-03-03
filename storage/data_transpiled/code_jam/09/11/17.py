def _import ( ) :
    from os import urandom
    from os import urandom
    from os import fdopen
    from os.path import expanduser
    from os.path import expanduser
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    from os import sep
    from os.path import join
    from os import sep
    from os.path import join
    from os import sep
    from os.path import join
    from os import sep
    from os.path import join
    from os import chdir
    MAX = 2000000 + 1
    ans = zeros ( [ MAX , 11 ] )
    def oko ( value , k ) :
        if ( value < MAX ) :
            return ans [ value ]
        res = value
        isi = [ False ] * 2 ** k
        while ( res >= 2 ** k ) or ( not isi [ res ] ) :
            if res < 2 ** k :
                isi [ res ] = True
            res2 = 0
            while res > 0 :
                modu = res % k
                res2 += modu ** 2
                res /= k
            res = res2
        if value < MAX :
            if res == 1 :
                ans [ value ] = 1
            else :
                ans [ value ] = 2
        return ( res == 1 )
    def run ( ) :
        input = open ( join ( expanduser ( '~' ) , 'input.txt' ) , 'w' )
        output = open ( join ( expanduser ( '~' ) , 'output.txt' ) , 'w' )
        t = input.readline ( )
        input.readline ( )
        for tt in t :
            print ( tt )
            s = input.readline ( )
            vs = [ int ( v ) for v in s.split ( ) ]
            MAX = int ( max ( vs ) )
            ans = 2
            for j in range ( 2 , MAX ) :
                ok = True
                for k in vs :
                    if ( k != 2 ) :
                        if not oko ( j , k ) :
                            ok = False
                            break
                    if ok :
                        ans = j
                        break
            output.write ( "Case #%d: %s\n" % ( tt + 1 , ans ) )
        