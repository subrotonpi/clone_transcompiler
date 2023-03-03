def main ( ) :
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            sc = random.choice ( [ '' , '' , '' ] )
            N = sc.randint ( 0 , N )
            H = sc.randint ( 0 , N )
            katana = [ ]
            max = 0
            for i in range ( N ) :
                katana.append ( sc.randint ( 0 , N ) )
                max = max ( katana [ i ] [ 0 ] , max )
                katana [ i ] [ 1 ] = sc.randint ( 0 , N )
            cnt = 0
            for i in range ( N ) :
                if katana [ i ] [ 1 ] > max :
                    cnt += 1
            if cnt > 0 :
                tmp = 0
                nage = [ ]
                for i in range ( N ) :
                    if katana [ i ] [ 1 ] > max :
                        nage.append ( [ katana [ i ] [ 1 ] , 0 ] )
                        tmp += 1
                quick_sort ( nage , 0 , tmp - 1 )
                cp = [ ]
                cp.append ( [ nage [ tmp - 1 ] [ 0 ] , nage [ tmp - 1 ] [ 0 ] ] )
                for i in range ( 1 , tmp ) :
                    cp.append ( [ nage [ tmp - 1 - i ] [ 0 ] , nage [ tmp - 1 ] [ 1 ] , cp [ i ] [ 0 ] ] )
                if H >= cp [ tmp - 1 ] [ 1 ] :
                    H -= cp [ tmp - 1 ] [ 1 ]
                    kaisu = ( H + max - 1 ) / max
                    print ( kaisu , tmp )
                else :
                    sm = [ ]
                    for i in range ( tmp ) :
                        sm.append ( cp [ i ] [ 1 ] )
                    kaisu = lowerBound ( sm , H )
                    print ( kaisu , tmp )
    return Main ( )
