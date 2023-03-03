def import sys , flag
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        r = sc.read ( )
        c = sc.read ( )
        kk = sc.read ( )
        field = [ ]
        for i in range ( r ) :
            field.append ( sc.read ( ).decode ( 'utf-8' ) )
        maxes = [ ]
        for i in range ( r ) :
            for j in range ( c ) :
                if field [ i ] [ j ] == 'x' :
                    maxes.append ( [ ] )
                    continue
                min = sys.maxint
                max = 1
                for k in range ( 1 , j - k + 1 , c ) :
                    if max < k :
                        max = k
                if min > max :
                    min = max
                max = 1
                for k in range ( 1 , j + k - 1 , c ) :
                    if max < k :
                        max = k
                if min > max :
                    min = max
                max = 1
                for k in range ( 1 , i - k + 1 , c ) :
                    if max < k :
                        max = k
                if min > max :
                    min = max
                max = 1
                for k in range ( 1 , i + k - 1 , r ) :
                    if max < k :
                        max = k
                if min > max :
                    min = max
                max = 1
                for k in range ( 1 , i + k - 1 , c ) :
                    if max < k :
                        max = k
                if min > max :
                    min = max
                max = 1
                for k in range ( 1 , i + k - 1 , r ) :
                    if max >= k :
                        max = k
                if max > min :
                    min = max
                maxes.append ( min )
        count = 0
        for i in range ( kk - 1 , r - kk + 1 ) :
            for j in range ( kk - 1 , c - kk + 1 ) :
                flag = True
                for k in range ( i + k , c - kk + 1 ) :
                    if max >= k :
                        break
                    