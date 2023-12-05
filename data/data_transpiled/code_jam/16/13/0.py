def import _readline
import readline
import sys
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import sys
import os
import locale
import sys
class Main ( readline ) :
    import locale
    import readline
    import readline
    import readline
    import readline
    import readline
    import readline
    import readline
    import readline
    import readline
    import readline
    import readline
    import readline
    import readline
    import time
    try :
        import locale
    except :
        pass
    with open ( filename + '-large' , 'w' ) as f :
        N = iread ( )
        bff = [ i - 1 for i in range ( N ) ]
        test = [ i for i in range ( N ) ]
        ans1 = 0
        ans2 = 0
        was = [ ]
        for i in range ( N ) :
            cur = 0
            was.append ( 0 )
            x = i
            while was [ x ] == 0 :
                cur += 1
                was.append ( cur )
                x = bff [ x ]
            cycle = cur - was [ x ] + 1
            if cycle == 2 :
                if cur > test [ x ] :
                    ans2 += cur - test [ x ]
                    test.append ( cur )
                    if test [ bff [ x ] ] == 0 :
                        test [ bff [ x ] ] = 2
            else :
                ans1 = max ( ans1 , cycle )
        ans = max ( ans1 , ans2 )
        out.write ( "%d" % ans )
    def solve_gcj ( ) :
        tests = iread ( )
        for test in range ( 1 , tests + 1 ) :
            out.write ( "Case #%d: " % test )
            solve ( )
            out.write ( "\n" )
    def run ( ) :
        try :
            f = open ( filename + '.in' , 'r' )
            out = open ( filename + '.out' , 'w' )
            solve_gcj ( )
            out.flush ( )
        except :
            sys.exit ( 1 )
    iread ( )
    dread ( )
    return ''
