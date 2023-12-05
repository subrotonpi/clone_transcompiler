def import __main__
class Main ( object ) :
    def __init__ ( self , a , b ) :
        sc = sys.stdin
        n = sc.randint ( 1 , 4 )
        m = sc.randint ( 1 , 4 )
        cakes = [ ( sc.randint ( 0 , 4 ) , sc.randint ( 0 , 4 ) , sc.randint ( 0 , 4 ) ) for i in range ( n ) ]
        max = 0
        for type in range ( 4 ) :
            [ x , y , z ] = __main__.get_cakes ( type )
            total = abs ( x ) + abs ( y ) + abs ( z )
            if total > max :
                max = total
            x , y , z = __main__.get_cakes ( type )
            total = abs ( x ) + abs ( y ) + abs ( z )
            if total > max :
                max = total
        print ( max )
    def abs ( x ) :
        if x > 0 :
            return x
        else :
            return - x
    def mycmp ( self , c1 , c2 ) :
        if type == 0 :
            a = c1 [ 0 ] + c1 [ 1 ] + c1 [ 2 ]
            b = c2 [ 0 ] + c2 [ 1 ]
        elif type == 1 :
            a = - c1 [ 0 ] + c1 [ 2 ]
            b = - c2 [ 0 ] + c2 [ 2 ]
        elif type == 2 :
            a = c1 [ 0 ] - c1 [ 1 ] + c1 [ 2 ]
            b = c2 [ 0 ] - c2 [ 1 ]
        elif type == 3 :
            a = c1 [ 0 ] + c1 [ 1 ]
            b = c2 [ 0 ] - c2 [ 2 ]
        else :
            a = c1 [ 0 ] + c1 [ 2 ]
            b = c2 [ 0 ] - c2 [ 2 ]
        print ( a )
