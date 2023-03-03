def main ( ) :
    import sys
    import os
    import getopt
    try :
        opts , args = getopt.getopt ( sys.argv [ 1 : ] , "r" )
    except getopt.error as msg :
        print ( "Error: %s" % msg )
        return
    for o , a in opts :
        kases = int ( a )
        INF = 1000000
        for kase in range ( 1 , kases + 1 ) :
            s = o.strip ( )
            N = int ( s )
            a = [ ]
            b = [ ]
            for s in args :
                f = s.split ( )
                a.append ( int ( f [ 0 ] ) )
                b.append ( int ( f [ 1 ] ) )
            pts = wk = 0
            while pts < 2 * N :
                good = 0
                for i in range ( N ) :
                    if b [ i ] <= pts :
                        wk += 1
                        good += 1
                        if a [ i ] == INF :
                            pts += 1
                        else :
                            pts += 2
                        b [ i ] = INF
                        a [ i ] = INF
                if good == 0 :
                    high = - 1
                    for i in range ( N ) :
                        if a [ i ] <= pts and ( high < 0 or b [ i ] > b [ high ] ) :
                            high = i
                    if high >= 0 :
                        wk += 1
                        pts += 1
                        good += 1
                        a [ high ] = INF
                if good == 0 :
                    break
            if pts == 2 * N :
                print ( "Case #%d: %d" % ( kase , wk ) )
            else :
                print ( "Case #%d: %d" % ( kase , "Too Bad" ) )
