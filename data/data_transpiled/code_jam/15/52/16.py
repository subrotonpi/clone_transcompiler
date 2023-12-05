def main ( ) :
    import sys
    ( sys.stdin.write , sys.stdout.flush ( ) )
    def solve ( ) :
        with open ( sys.argv [ 1 ] , 'r' ) as cin :
            T = cin.read ( )
            for C in range ( 1 , T + 1 ) :
                N = cin.read ( )
                K = cin.read ( )
                M = N - K + 1
                sum = [ cin.read ( ) for _ in range ( M ) ]
                min = [ 0 ] * K
                max = [ 0 ] * K
                cur = [ 0 ] * K
                for i in range ( 1 , M ) :
                    diff = sum [ i ] - sum [ i - 1 ]
                    index = ( i - 1 ) % K
                    cur [ index ] += diff
                    min [ index ] = min [ index ]
                    max [ index ] = max [ index ]
                ret = 0
                pos = 0
                for i in range ( K ) :
                    ret = max [ i ] - min [ i ]
                    if ret == max [ i ] - min [ i ] :
                        pos = i
                Up = 0
                Dn = 0
                for i in range ( K ) :
                    Up += max [ pos ] - max [ i ]
                    Dn += min [ pos ] - min [ i ]
                fit = 0
                rep = 0
                for i in range ( min [ Up , Dn ] , max [ Up , Dn ] + 1 ) :
                    fit |= ( ( sum [ : - i ] ) % K == 0 )
                    rep += 1
                    if rep >= K :
                        break
                if fit == False :
                    ret += 1
                print ( "Case #%d: %d" % ( C , ret ) )
    solve ( )
