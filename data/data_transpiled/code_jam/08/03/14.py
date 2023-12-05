def prob_c ( ) :
    import math
    import math
    class prob_C ( object ) :
        def triangle_sector ( r , x , y ) :
            if x == 0 : return 0
            if y < 0 :
                x *= - 1
                y *= - 1
            if abs ( x ) > r :
                theta = math.atan ( y / x )
                return r ** 2 * theta / 2
            y2 = math.sqrt ( r ** 2 - x ** 2 )
            if y < y2 :
                return x * y / 2
            theta1 = math.atan ( y2 / x )
            theta2 = math.atan ( y / x )
            return x * y2 / 2 + r ** 2 * ( theta2 - theta1 ) / 2
        def rect_at_center ( r , x , y ) :
            return triangle_sector ( r , x , y ) + triangle_sector ( r , y , x )
        def rect_at_center ( r , x1 , y1 , x2 , y2 ) :
            return ( rect_at_center ( r , x2 , y2 ) - rect_at_center ( r , x1 , y2 ) ) - ( rect_at_center ( r , x2 , y1 ) - rect_at_center ( r , x1 , y1 ) )
        def main ( ) :
            f = open ( 'input.txt' , 'r' )
            N = int ( f.readline ( ) )
            for s in f.readlines ( ) :
                k = 0
                num = [ ]
                for h in s.split ( ' ' , k + 1 ) :
                    if h == - 1 :
                        h = len ( s )
                    num.append ( float ( s [ k : h ] ) )
                    k = h
                p = one_case ( num [ 0 ] , num [ 1 ] , num [ 2 ] , num [ 3 ] , num [ 4 ] )
                print ( "Case #%d: %f" % ( i + 1 , p ) )
    return prob_C
