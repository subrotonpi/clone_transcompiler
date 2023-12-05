def import import sys , StringIO , getopt
class Test ( object ) :
    def __init__ ( self ) :
        self.stdout = sys.stdout
        self.stdout = StringIO ( )
    def solve ( ) :
        tc = [ ]
        for t in range ( tc ) :
            print ( "Case #%d: " % ( t + 1 ) , end = ' ' )
            n = [ ]
            p = [ ]
            cnt = [ ]
            for i in range ( n ) :
                cnt [ i % p ] += 1
            res = cnt [ 0 ]
            if p == 2 :
                res += ( cnt [ 1 ] + 1 ) / 2
            elif p == 3 :
                m = min ( cnt [ 1 ] , cnt [ 2 ] )
                res += m
                cnt [ 1 ] -= m
                cnt [ 2 ] -= m
                v = max ( cnt [ 1 ] , cnt [ 2 ] )
                res += ( 2 + v ) / 3
            elif p == 4 :
                m = min ( cnt [ 1 ] , cnt [ 3 ] )
                res += m
                cnt [ 1 ] -= m
                cnt [ 3 ] -= m
                res += cnt [ 2 ] / 2
                cnt [ 2 ] %= 2
                m = max ( cnt [ 1 ] , cnt [ 3 ] )
                if cnt [ 2 ] == 0 :
                    res += ( m + 3 ) / 4
                else :
                    if m > 2 :
                        res += ( m + 5 ) / 4
                    else :
                        res += 1
            print ( res , end = ' ' )
            sys.stderr.write ( "%d/%d done\n" % ( t + 1 , tc ) )
    def run ( ) :
        try :
            f = open ( "test.in" , "r" )
        except IOError :
            pass
        else :
            f.close ( )
        f = open ( "test.out" , "w" )
        solve ( )
        f.close ( )
    def runIO ( ) :
        f = open ( "test.in" , "r" )
        out = open ( "test.out" , "w" )
        solve ( )
        f.close ( )
    return Test
