def _main ( ) :
    import locale
    import os
    import time
    import locale
    import locale
    import locale
    import locale
    import locale
    if not locale.getdefaultlocale ( ) :
        locale.setlocale ( locale.LC_ALL , '' )
    for i in range ( r ) :
        for mprev in range ( 0 , mmm ) :
            for mhere in range ( 0 , c ) :
                ok = True
                cnt = 0
                for j in range ( 0 , c ) :
                    if ( 1 << j ) & mhere :
                        if prev or used ( mprev , j + 1 ) :
                            ok = False
                            break
                        cnt += 1
                    else :
                        prev = False
                if not ok : continue
                dp [ i + 1 ] [ mhere ] = max ( dp [ i + 1 ] [ mhere ] , cnt )
    for m in range ( 0 , mmm ) :
        result = max ( result , m )
    for m in range ( 0 , mmm ) :
        result = max ( result , m )
    print ( "Case #%d: %d" % ( caseNumber , result ) )
    def open ( infile ) :
        outfile = re.sub ( r"(\.in)?$" , ".out" , infile )
        print ( "Processing %s, writing %s..." % ( infile , outfile ) )
        infile = open ( infile )
        outfile = open ( outfile , 'w' )
    def do_case ( caseNumber ) :
        n = len ( infile )
        lastp = 0
        nl = True
        start = time.time ( )
        for i in range ( 1 , n + 1 ) :
            if nl :
                print ( datetime.now ( ).strftime ( "%H:%M:%S.%f" ) + " : " , end = '' )
                nl = False
            do_case ( caseNumber )
            print ( "." , end = '' )
            p = i * 20 / n
            if lastp != p :
                print ( "%d%%, ~%d sec more to go" % ( i * 100 / n , ( time.time ( )