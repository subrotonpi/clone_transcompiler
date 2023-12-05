def main ( ) :
    import sys
    class B ( object ) :
        def __init__ ( self ) :
            self.T = int ( sys.stdin.read ( ) )
    T = B ( )
    for c in range ( 1 , T + 1 ) :
        n , s , p = B ( )
        high = low = 0
        if p < 2 :
            count = 0
            for t in range ( n ) :
                if t :
                    count += 1
            if p == 0 :
                ans = n
            else :
                ans = count
        else :
            for t in range ( n ) :
                if t >= 3 * p - 2 :
                    high += 1
                elif t >= 3 * p - 4 :
                    low += 1
            ans = ans = high + ( ( s , low ) if s < low else low )
        print ( "Case #{}: {}".format ( c , ans ) )
