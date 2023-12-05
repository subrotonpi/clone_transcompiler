def _import ( ) :
    from math import sin , cos , sqrt , solve
    class B ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            self.N , W , L = sc.regs [ : 2 ]
            r = [ ]
            maxr = 0
            maxi = 0
            for i in range ( N ) :
                r.append ( sc.regs [ i ] )
                if r [ i ] > maxr :
                    maxr = r [ i ]
                    maxi = i
            x = [ ]
            y = [ ]
            random.seed ( )
            x.append ( 0 )
            y.append ( 0 )
            OUT :
                while True :
                    for i in range ( N ) :
                        if i == maxi :
                            continue
                        success = False
                        for t in range ( 100 ) :
                            x.append ( random.uniform ( 0 , W ) )
                            y.append ( random.uniform ( 0 , L ) )
                            if sq ( x [ i ] - x [ maxi ] , y [ i ] - y [ maxi ] ) <= sq ( r [ i ] + r [ maxi ] ) :
                                continue
                            ok = True
                            for j in range ( i ) :
                                if sq ( x [ i ] - x [ j ] , y [ i ] - y [ j ] ) <= sq ( r [ i ] + r [ j ] ) :
                                    ok = False
                                    break
                            if ok :
                                success = True
                                break
                        if not success :
                            continue
                    for i in range ( N ) :
                        print ( "%f %f" % ( x [ i ] , y [ i ] ) , end = ' ' )
                        if i != N - 1 :
                            print ( " " , end = ' ' )
                    print ( )
                    return
    sq = solve ( )
    for i in range ( 1 , T + 1 ) :
        print ( "Case #%d: " % i , end = ' ' )
    print ( )
