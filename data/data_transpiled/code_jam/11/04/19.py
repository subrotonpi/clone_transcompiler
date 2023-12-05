def goro ( ) :
    import sys
    from itertools import product
    ins = sys.stdin
    for cc in range ( 1 , ntc + 1 ) :
        ins.stdin.readline ( )
        arr = [ ]
        coll = [ ]
        for v in ins :
            arr.append ( v )
        cnt = 0
        for i in range ( len ( arr ) ) :
            if arr [ i ] != i :
                j = arr [ i ]
                ccnt = 1
                coll.append ( i )
                while j != i :
                    coll [ ccnt ] = j
                    j = arr [ j ]
                    ccnt += 1
                for k in coll :
                    arr [ k ] = arr [ k ]
                cnt += ccnt
        sys.stdout.write ( "Case #%d: %d.000000\n" % ( cc , cnt ) )
