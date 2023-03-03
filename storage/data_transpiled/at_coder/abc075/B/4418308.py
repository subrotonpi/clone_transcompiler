def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( ).split ( )
        H , W = [ int ( s [ 0 ] ) for s in s [ 1 : ] ]
        sx = [ - 1 , - 1 , - 1 , 0 , + 1 , + 1 , + 1 , 0 ]
        sy = [ - 1 , 0 , + 1 , + 1 , + 1 , 0 , - 1 , - 1 ]
        field = [ ]
        for i in range ( H ) :
            field.append ( sc.readline ( ).split ( ) )
        for i in range ( H ) :
            for j in range ( W ) :
                count = 0
                if field [ i ] [ j ] == '.' :
                    for k in range ( 8 ) :
                        if i + sx [ k ] >= 0 and i + sx [ k ] < H and j + sy [ k ] >= 0 and j + sy [ k ] < W :
                            if field [ i + sx [ k ] ] [ j + sy [ k ] ] == '#' :
                                count += 1
                field [ i ] [ j ] = chr ( count + '0' )
            print ( '' , end = ' ' )
