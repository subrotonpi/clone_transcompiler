def main ( * orange ) :
    import sys
    import random
    import sys
    class B ( object ) :
        def __init__ ( self , * orange ) :
            self.input = sys.stdin
            self.num_cases = len ( orange )
    for n in range ( num_cases ) :
        R , C , N = random.randint ( 1 , N )
        total = R * C
        total1 , total2 = total // 2 , total - total1
        mid = ( R - 2 ) * ( C - 2 )
        mid1 , mid2 = mid // 2 , mid - mid1
        corner = 4
        corner1 = 0 if R * C % 2 == 1 else 2
        corner2 = corner - corner1
        side = total - mid - corner
        side1 , side2 = total1 - mid1 - corner1 , total2 - mid2 - corner2
        if N <= ( R * C + 1 ) / 2 :
            ans = 0
        elif R == 1 or C == 1 :
            ans = R * C - 1 - 2 * ( R * C - N )
        else :
            cand1 , cand2 = [ ] , [ ]
            num_holes = R * C - N
            cand1 = ( R - 1 ) * C + ( C - 1 ) * R
            if num_holes >= mid1 :
                num_holes -= mid1
                cand1 -= 4 * mid1
            else :
                cand1 -= 4 * num_holes
                num_holes = 0
            if num_holes >= side1 :
                num_holes -= side1
                cand1 -= 3 * side1
            else :
                cand1 -= 3 * num_holes
                num_holes = 0
            cand1 -= 2 * num_holes
        print ( "Case #%d: " % ( n + 1 ) )
        print ( ans )
