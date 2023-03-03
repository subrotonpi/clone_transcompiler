def _import ( ) :
    from math import sin , cos , pi , pi
    class C ( object ) :
        def __init__ ( self ) :
            self.__dict__ [ '__init__' ] = 0
        def run ( self ) :
            with open ( self.__dict__ [ '__init__' ] ) as sc :
                n = sc.read ( )
                for o in range ( 1 , n + 1 ) :
                    f , R , t , r , g = sc.read ( )
                    res = 0
                    for i in range ( 1100 ) :
                        for j in range ( 1100 ) :
                            res += calc ( ( g + r * 2 ) * i + r + f , ( g + r * 2 ) * i + r + g - f , ( g + r * 2 ) * j + r + f , ( g + r * 2 ) * j + r + g - f , R - t - f )
                    print ( "Case #%d: %.8f" % ( o , 1 - res * 4 / ( pi * R ** 2 ) ) , end = "" )
        def calc ( left , right , down , up , r ) :
            if left >= right or down >= up :
                return 0
            if left ** 2 + down ** 2 >= r ** 2 :
                return 0
            if right ** 2 + up ** 2 <= r ** 2 :
                return ( right - left ) * ( up - down )
            return calc ( left , down , r ) - calc ( left , up , r ) - calc ( right , down , r )
        def calc ( x , y , r ) :
            if x ** 2 + y ** 2 >= r ** 2 :
                return 0
            xx , yy = sqrt ( r ** 2 - y ** 2 ) , sqrt ( r ** 2 - x ** 2 )
            return ( r ** 2 * ( atan2 ( yy , x ) - atan2 ( y , xx ) ) - ( x * ( yy - y ) + ( xx - x ) ** 2 ) ) / 2
        def debug ( self , * os ) :
            print ( self.__dict__ [ '__init__' ] , file = sys.stderr )
