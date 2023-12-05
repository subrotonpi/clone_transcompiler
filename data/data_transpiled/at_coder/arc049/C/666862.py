def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
        A = sys.maxint
        x = [ ]
        y = [ ]
        m = [ [ ] for i in range ( A ) ]
        x.append ( [ - 1 ] * N )
        y.append ( [ - 1 ] * N )
        m [ x [ i ] , y [ i ] ] = True
    B = sys.maxint
    u = [ - 1 ] * B
    v = [ - 1 ] * B
    ans = 0
    used = [ False ] * N
    for t in range ( 1 << B ) :
        cnt = 0
        [ used ] = False
        updated = True
        while updated :
            updated = False
            for i in range ( N ) :
                if used [ i ] :
                    continue
                ng = False
                for j in range ( B ) :
                    if ( ( t >> j ) & 1 ) == 0 :
                        if u [ j ] == i :
                            ng = True
                            break
                    else :
                        if v [ j ] == i and not used [ u [ j ] ] :
                            ng = True
                            break
                if ng :
                    continue
                for j in range ( A ) :
                    if x [ j ] == i and not used [ y [ j ] ] :
                        ng = True
                        break
            if not ng :
                used [ i ] = True
                cnt += 1
                updated = True
        ans = max ( ans , cnt )
    print ( ans )
    sys.exit ( 0 )
