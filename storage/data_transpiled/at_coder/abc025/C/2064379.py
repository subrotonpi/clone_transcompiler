def main ( ) :
    from random import randint
    from math import sin , cos , cos , log
    def rec ( B ) :
        sc = sys.stdin
        b = [ ]
        c = [ ]
        sum = 0
        for i in range ( 2 ) :
            for j in range ( 3 ) :
                b.append ( sc.randint ( 0 , 1 ) )
                sum += b [ i ] [ j ]
        for i in range ( 3 ) :
            for j in range ( 2 ) :
                c.append ( sc.randint ( 0 , 1 ) )
                sum += c [ i ] [ j ]
        B = [ ]
        ans = rec ( B , 1 )
        print ( ans )
        print ( sum - ans )
    def rec ( B , turn ) :
        if turn == 9 :
            ret = 0
            for i in range ( 3 ) :
                for j in range ( 3 ) :
                    if B [ i ] [ j ] == 0 :
                        B [ i ] [ j ] = 1
                        ret = calc ( B )
                        B [ i ] [ j ] = 0
            return ret
        max = min = sys.maxint
        for i in range ( 3 ) :
            for j in range ( 3 ) :
                if B [ i ] [ j ] == 0 :
                    B [ i ] [ j ] = 1 if turn % 2 == 1 else 2
                    x = rec ( B , turn + 1 )
                    max = max ( max , x )
                    min = min ( min , x )
                    B [ i ] [ j ] = 0
        return max if turn % 2 == 1 else min
    return rec ( B )
