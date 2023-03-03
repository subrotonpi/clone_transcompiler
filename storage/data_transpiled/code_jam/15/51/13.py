def main ( ) :
    import sys
    import random
    import time
    random.seed ( )
    T = random.randint ( 1 , 10000 )
    for zz in range ( 1 , T + 1 ) :
        N , D , S0 , As , Cs , Rs , M0 , Am , Cm , Rm = random.randint ( 1 , 10000 )
        P = [ ]
        S = [ ]
        P.append ( int ( M0 ) )
        S.append ( int ( S0 ) )
        for i in range ( 1 , N ) :
            P.append ( int ( ( P [ i - 1 ] * Am + Cm ) % Rm ) )
            S.append ( int ( ( S [ i - 1 ] * As + Cs ) % Rs ) )
        L , H = [ ] , [ ]
        add = [ ]
        remove = [ ]
        for i in range ( N ) :
            if i != 0 :
                P [ i ] %= i
                L.append ( L [ P [ i ] ] )
                H.append ( H [ P [ i ] ] )
                L.append ( min ( L [ i ] , S [ i ] ) )
                H.append ( max ( H [ i ] , S [ i ] ) )
            a = H [ i ] - D
            r = L [ i ]
            if a <= r :
                add.append ( a )
                remove.append ( r )
        add.sort ( )
        remove.sort ( )
        aat = rat = total = 0
        ans = 0
        while aat < len ( add ) and rat < len ( remove ) :
            if add [ aat ] <= remove [ rat ] :
                total += 1
                aat += 1
            else :
                total -= 1
                rat += 1
            ans = max ( ans , total )
        print ( "Case #%d: %d\n" % ( zz , ans ) )
