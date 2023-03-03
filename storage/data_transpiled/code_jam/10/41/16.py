def main ( arg ) :
    import sys
    class A ( object ) :
        def __init__ ( self , * args ) :
            sc = sys.stdin
            T = int ( sc.readline ( ) )
            for ii in range ( 1 , T + 1 ) :
                k = sc.randint ( 1 , T + 1 )
                d = [ ]
                for i in range ( 2 * k - 1 ) :
                    n = ( i + 1 ) if i <= k - 1 else k - ( i - ( k - 1 ) )
                    init = ( i <= k - 1 )
                    for s in range ( init , n + init ) :
                        d.append ( [ i - s , s ] )
            for i in range ( k ) :
                for j in range ( k ) :
                    sys.stderr.write ( "%s " % ( d [ i ] [ j ] ) )
                sys.stderr.write ( "\n" )
    MIN = k
    MAX = 2 * k
    while MIN < MAX :
        piv = ( MIN + MAX ) / 2
        if piv == MAX :
            piv -= 1
        t = False
        for offset in range ( 0 , piv - k ) :
            for offsetj in range ( 0 , piv - k ) :
                if check ( d , offset , offsetj , piv ) :
                    t = True
                    break
        if t :
            sys.stderr.write ( "%s : Works\n" % ( piv ) )
            MAX = piv
        else :
            sys.stderr.write ( "%s : Doesnt Work\n" % ( piv ) )
            MIN = piv + 1
    print ( "Case #%d: %s\n" % ( ii , ( MIN * MIN - k * k ) ) )
