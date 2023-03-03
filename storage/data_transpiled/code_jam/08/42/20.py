def import import os , sys , stdin , stdout , stderr , line , verbose , problem , problem , args , problem , args , warnings , verbose , problem , args , filename , line , args , warnings , ** kwargs ) :
    import inspect
    import os
    if problem :
        FNAME = args [ 0 ]
    else :
        FNAME = args [ 0 ]
    def open ( filename , mode = 'r' ) :
        f = open ( filename , mode )
    def run ( ) :
        tn = len ( args )
        for test in range ( 1 , tn + 1 ) :
            n = len ( args )
            m = len ( args )
            a = len ( args )
            print ( "Case #{}: ".format ( test ) , end = ' ' , file = sys.stderr )
            ok = False
            for x2 in range ( 1 , n + 1 ) :
                y2 = ( a + x2 - 1 ) // x2
                if y2 > m :
                    continue
                t = x2 * y2 - a
                if t <= n :
                    print ( "0 0 {} 1 {} {}".format ( x2 , t , y2 ) , end = ' ' , file = sys.stderr )
                    ok = True
                    break
                if t <= m :
                    print ( "0 0 {} {} 1 {}".format ( x2 , t , y2 ) , end = ' ' , file = sys.stderr )
                    ok = True
                    break
            if not ok :
                print ( "IMPOSSIBLE" )
    return run
