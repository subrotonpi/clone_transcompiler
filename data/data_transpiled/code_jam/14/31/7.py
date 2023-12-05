def _import ( ) :
    from math import ceil
    from math import sin , cos
    from os.path import join
    from os import sep
    from os import curdir
    from os.path import join
    from os import sep
    from os import curdir
    from os import sep
    from os import sep
    from os import sep
    from os import sep
    from os import sep
    from os import sep
    from os import chdir
    def solve ( ) :
        test_no = int ( sys.maxint )
        for test in range ( 1 , test_no + 1 ) :
            print ( 'Test %d' % test )
            p = sep.join ( [ x , sep.join ( [ y , x ] ) ] )
            q = sep.join ( [ x , sep.join ( [ y , x ] ) ] )
            d = gcd ( p , q )
            p /= d
            q /= d
            p2 = 0
            good = True
            while q > 1 :
                if q % 2 :
                    good = False
                    break
                q /= 2
                p2 += 1
            if good :
                while p > 1 :
                    p /= 2
                    p2 -= 1
                print ( 'Case #%d: %d\n' % ( test , p2 ) , end = ' ' )
            else :
                print ( 'Case #%d: impossible\n' % test )
    def gcd ( x , y ) :
        while y :
            t = y
            y = x % y
            x = t
        return x
    def out ( format , * s ) :
        sys.stdout.write ( format % s )
        sys.stdout.write ( format % s )
        sys.stdout.flush ( )
    def run ( ) :
        try :
            f = open ( join ( dirname ( __file__ ) , 'A-large.in' ) , 'r' )
            out = open ( join ( dirname ( __file__ ) , 'A-large.out' ) , 'w' )
            solve ( )
            f.close ( )
        except IOError :
            pass
    run ( )
