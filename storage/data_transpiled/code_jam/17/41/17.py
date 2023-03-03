def main ( arg ) :
    import sys
    class A ( object ) :
        def __init__ ( self , * args ) :
            self.TT = args [ 0 ]
    for ii in range ( 1 , TT + 1 ) :
        N = int ( N )
        P = int ( P )
        M = [ 0 for _ in range ( 5 ) ]
        for G in A :
            M [ G % P ] += 1
        ans = 1 + M [ 0 ]
        if P == 2 :
            ans += M [ 1 ] / 2
            if M [ 1 ] % 2 == 0 :
                ans -= 1
        elif P == 3 :
            min = min ( M [ 1 ] , M [ 2 ] )
            left = max ( M [ 1 ] , M [ 2 ] ) - min
            if left % 3 == 0 :
                ans -= 1
            left /= 3
            ans += min + left
        elif P == 4 :
            while M [ 2 ] >= 2 :
                ans += 1
                M [ 2 ] -= 2
            while M [ 1 ] > 0 and M [ 3 ] > 0 :
                ans += 1
                M [ 1 ] -= 2
                M [ 3 ] -= 2
            if M [ 2 ] == 1 :
                if M [ 1 ] % 4 >= 2 :
                    ans += 1
                    M [ 1 ] -= 2
                    M [ 2 ] -= 2
                elif M [ 3 ] % 4 >= 2 :
                    ans += 1
                    M [ 3 ] -= 2
                    M [ 2 ] -= 2
            threes = M [ 3 ] / 4
            ones = M [ 1 ] / 4
            ans += threes + ones
            if M [ 1 ] % 4 == 0 and M [ 3 ] % 4 == 0 and M [ 2 ] % 2 == 0 :
                ans -= 1
        sys.stdout.write ( "Case #%d: %d\n" % ( ii , ans ) )
