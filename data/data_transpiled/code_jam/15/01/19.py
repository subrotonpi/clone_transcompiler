def codejam15 ( ) :
    import os
    from chardet import Scanner
    sc = Scanner ( )
    f = PrintWriter ( "a.out" )
    tc = sc.count ( )
    for t in range ( 1 , tc + 1 ) :
        l = sc.count ( )
        s = sc.next ( )
        cnt = 0
        added = 0
        for i in range ( 0 , l ) :
            if i > cnt :
                need = i - cnt
                added += need
                cnt += need
            cnt += s [ i + 1 ] - '0'
        f.write ( "Case #%d: %d\n" % ( t , added ) )
    sc.close ( )
    f.close ( )
