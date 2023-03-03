def rush ( ) :
    import sys
    import random
    import time
    import sys
    import random
    import sys
    import random
    import sys
    class rush ( object ) :
        def cmp ( self , A , B ) :
            if A [ 0 ] != B [ 0 ] :
                return A [ 0 ] - B [ 0 ]
            return A [ 1 ] - B [ 1 ]
        def cmp2 ( self , A , B ) :
            if A [ 0 ] != B [ 0 ] :
                return A [ 0 ] - B [ 0 ]
            if A [ 1 ] != B [ 1 ] :
                return B [ 1 ] - A [ 1 ]
            return A [ 1 ] - B [ 1 ]
    def main ( ) :
        with open ( 'test.txt' , 'r' ) as f :
            TE = random.randint ( 1 , 10 )
            CASE :
            for cas in range ( 1 , TE + 1 ) :
                T = sorted ( cmp ( A , B ) , key = cmp2 )
                O = sorted ( cmp2 ( A , B ) , key = cmp2 )
                n = random.randint ( 1 , 10 )
                P = [ ]
                done = [ ]
                for i in range ( n ) :
                    a = random.randint ( 1 , 10 )
                    b = random.randint ( 1 , 10 )
                    P.append ( ( a , b ) )
                    T.append ( ( b , i ) )
                    O.append ( ( a , b , i ) )
                ans = 0
                cur = 0
                OUTER :
                while cur < 2 * n :
                    ans += 1
                    best_o = - 1
                    for i in range ( n ) :
                        if cur >= P [ i ] [ 1 ] and done [ i ] < 2 :
                            cur += 2 - done [ i ]
                            done [ i ] = 2
                            continue OUTER
                        if cur >= P [ i ] [ 0 ] and done [ i ] < 1 :
                            best_o = i
    return ans
