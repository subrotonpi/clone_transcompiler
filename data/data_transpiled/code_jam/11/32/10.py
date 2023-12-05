def _import ( ) :
    from itertools import chain
    from random import randint , randrange , randrange
    from random import randrange , randrange
    from random import randrange
    from random import randrange
    from random import randrange
    from random import choice
    class B :
        def solve ( icase ) :
            L = si ( )
            t = sl ( ) // 2
            N = si ( )
            a = range ( si ( ) , N )
            hours = 0
            dists = [ ]
            for star in range ( N ) :
                dist = a [ star % len ( a ) ]
                if t >= dist :
                    t -= dist
                    hours += dist * 2
                elif t > 0 :
                    dists.append ( int ( dist - t ) )
                    hours += t * 2
                    t = 0
                else :
                    dists.append ( dist )
            dists.sort ( )
            for dist in dists [ : - 1 ] :
                hours += dist * ( 1 if L > 0 else 2 )
                L -= 1
            printf ( "Case #%d: %d\n" % ( icase , hours ) )
        def main ( ) :
            randrange ( 1 , 2 )
        def rep_solve ( ) :
            from random import randrange
            from random import randrange
            from random import randrange
            ncase = randrange ( 1 , 2 )
            sline ( )
            for icase in range ( 1 , ncase + 1 ) :
                solve ( icase )
                sys.stderr.write ( "[[ %d ]]\n" % icase )
        def si ( ) :
            return si ( )
        def sl ( ) :
            return sl ( ) // 2
        def ss ( ) :
            return ss ( )
        def sline ( ) :
            return sline ( )
        def printf ( format , * args ) :
            sys.stdout.write ( format % args )
