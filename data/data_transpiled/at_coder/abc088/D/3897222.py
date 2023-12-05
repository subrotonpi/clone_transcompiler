def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        h = sc.__next__ ( )
        w = sc.__next__ ( )
        grid = [ [ - 1 ] * w for i in range ( w ) ]
        w_count = 0
        for s in sc.split ( ) :
            for j in range ( w ) :
                if s [ j ] == '.' :
                    grid [ j ] [ i ] = - 1
                    w_count += 1
                else :
                    grid [ j ] [ i ] = int ( s [ j ] )
        grid [ 0 ] [ 0 ] = 0
        for i in range ( w_count ) :
            for j in range ( w ) :
                for k in range ( h ) :
                    if grid [ j ] [ k ] == i :
                        if j != 0 :
                            if grid [ j - 1 ] [ k ] == - 1 :
                                grid [ j - 1 ] [ k ] = i + 1
                        if j != w - 1 :
                            if grid [ j + 1 ] [ k ] == - 1 :
                                grid [ j + 1 ] [ k ] = i + 1
                        if k != 0 :
                            if grid [ j ] [ k - 1 ] == - 1 :
                                grid [ j ] [ k - 1 ] = i + 1
                        if k != h - 1 :
                            if grid [ j ] [ k + 1 ] == - 1 :
                                grid [ j ] [ k + 1 ] = i + 1
        if grid [ w - 1 ] [ h - 1 ] != - 1 :
            print ( w_count - grid [ w - 1 ] [ h - 1 ] - 1 )
            return
    print ( - 1 )
