def import math
class C :
    def __init__ ( self ) :
        sc = math.sc
        table = [ [ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 ] , [ 1 , 4 , 3 , 6 , 5 , 0 , 7 , 2 ] , [ 2 , 7 , 4 , 1 , 6 , 3 , 0 , 5 ] , [ 3 , 2 , 5 , 4 , 7 , 6 , 1 , 0 ] ]
        for i in range ( 4 , 8 ) :
            for j in range ( 8 ) :
                table [ i ] [ j ] = table [ i - 4 ] [ j ] + 4
                if table [ i ] [ j ] >= 8 :
                    table [ i ] [ j ] -= 8
        T = sc.randint ( 1 , 4 )
        for i in range ( 1 , T + 1 ) :
            print ( "Case #%d: %s\n" % ( i , "YES" if solve ( ) else "NO" ) )
    def solve ( ) :
        L , X , data = sc.randint ( 1 , 4 ) , sc.randint ( 1 , 4 ) , sc.randint ( 1 , 4 )
        ch = [ "1ijk".index ( data [ i ] ) for i in range ( L ) ]
        cur = target = 1
        for i in range ( min ( 1000 , X ) ) :
            for j in range ( L ) :
                cur = table [ cur ] [ ch [ j ] ]
                if cur == target :
                    target = ( 2 if target == 1 else 99 )
                    cur = 0
            if target == 99 :
                one = 0
                for j in range ( L ) :
                    one = table [ one ] [ ch [ j ] ]
                rest = table [ cur ] [ pow ( one , X - i - 1 ) ]
                return rest
        return False
    def solve ( ) :
        if p == 0 : return 0
        if p == 1 : return base
        ret = abs ( pow ( base , p / 2 ) )
        ret = table [ ret ] [ base ]
        if p % 2 == 1 :
            return 1
        return ret
