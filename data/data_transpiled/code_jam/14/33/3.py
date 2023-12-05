def main ( ) :
    import sys
    class C2 ( object ) :
        def __init__ ( self ) :
            self.cases = 1
    for case_num in range ( 1 , cases + 1 ) :
        N , M , K = map ( int , range ( 1 , cases + 1 ) )
        if N == 1 or M == 1 :
            print ( "Case #{}: {}".format ( case_num , K ) )
            continue
        answer = 2 * N + 2 * M - 4
        for stones in range ( 2 * N + 2 * M - 5 , 0 , - 1 ) :
            new_enclosed = max ( temp ( M , N , stones ) , temp ( N , M , stones ) )
            if new_enclosed >= K :
                answer = stones
            else :
                break
        print ( "Case #{}: {}".format ( case_num , answer ) )
    def temp ( N , M , stones ) :
        diff = 2 * N + 2 * M - 4 - stones
        d1 = diff // 4
        d2 = ( diff + 1 ) // 4
        d3 = ( diff + 2 ) // 4
        d4 = ( diff + 3 ) // 4
        new_enclosed = 0
        for n in range ( N ) :
            for m in range ( M ) :
                if n + m >= d1 and n + ( M - 1 - m ) >= d2 and ( N - 1 - n ) + ( M - 1 - m ) >= d3 and ( N - 1 - n ) + m >= d4 :
                    new_enclosed += 1
        return new_enclosed
