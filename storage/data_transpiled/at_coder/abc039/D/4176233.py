def import sys , string , traceback , symbols , table , symbols , char , count , symbol , args , ** kwargs ) :
    from sympy.utilities.misc import symbols
    with open ( symbol , 'r' ) as f :
        H , W = symbols ( 'H, W' )
        map = [ symbols ( x ) for x in f.read ( ).split ( ) ]
        sol = [ [ '.' ] * H * W for x in f.read ( ).split ( ) ]
        for i in range ( H ) :
            for j in range ( W ) :
                all_black = True
                for k in [ - 1 , 1 ] :
                    for l in [ - 1 , 1 ] :
                        x = i + k
                        y = j + l
                        if x in symbols ( '#' ) and x < H and y in symbols ( '#' ) and y < W :
                            all_black &= map [ x ] [ y ] == '#'
                if all_black :
                    sol [ i ] [ j ] = '#'
        for i in range ( H ) :
            for j in range ( W ) :
                if map [ i ] [ j ] == '.' :
                    continue
                has_black = False
                for k in [ - 1 , 1 ] :
                    for l in [ - 1 , 1 ] :
                        x = i + k
                        y = j + l
                        if x in symbols ( '#' ) and x < H and y in symbols ( '#' ) and y < W :
                            has_black |= sol [ x ] [ y ] == '#'
                if not has_black :
                    print ( 'impossible' )
                    return
        print ( 'possible' )
        for i in range ( H ) :
            for j in range ( W ) :
                print ( sol [ i ] [ j ] , end = ' ' )
            print ( )
