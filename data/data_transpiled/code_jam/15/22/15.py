def codejam2015 ( ) :
    import os
    import sys
    import os
    import sys
    import string
    import string
    import string
    class Noisy ( object ) :
        def __init__ ( self ) :
            if not sys.stdin.isatty ( ) or not sys.stdin.isatty ( ) :
                s = string.strip ( sys.stdin.readline ( ) )
                if not s :
                    return None
                self.s = string.split ( s )
        def __next__ ( self ) :
            return int ( self.s )
    f = open ( os.path.join ( os.path.dirname ( __file__ ) , 'codejam2015' , 'b.in' ) , 'r' )
    f.write ( '#' )
    f.close ( )
    f = open ( os.path.join ( os.path.dirname ( __file__ ) , 'codejam2015' , 'b.out' ) , 'w' )
    T = random.randint ( 1 , 10 )
    for t in range ( T ) :
        R , C , N = next ( f ) , next ( f ) , next ( f )
        ans = 0
        odd = ( R * C ) % 2 == 1
        if N <= ( R * C + 1 ) / 2 :
            ans = 0
        elif R == 1 or C == 1 :
            diff = N - ( R * C + 1 ) / 2
            if odd :
                ans += 1
                ans += 1
            diff -= 1
            while diff > 0 :
                ans += 2
                diff -= 1
        elif N == ( R * C + 3 ) / 2 :
            ans = 3 if odd else 2
        elif N == ( R * C + 5 ) / 2 :
            ans = 6 if odd else 4
        else :
            walls = ( R * C * 4 - 2 * R - 2 * C ) / 2
            diff = R * C - N
            inner = R * C - 2 * R - 2 * C + 4
            if diff <= ( inner + 1 ) / 2 :
                ans = walls - diff * 4
            else :
                ans = walls - ( inner + 1 ) / 2 * 4
                diff -= ( inner + 1 ) / 2
                if not odd :
                    ans -= diff * 3
                    