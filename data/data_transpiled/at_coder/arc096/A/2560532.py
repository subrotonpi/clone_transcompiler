def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            a = sc.read ( )
            b = sc.read ( )
            c = sc.read ( )
            x = sc.read ( )
            y = sc.read ( )
            sum = 0
            max_xy = Max ( x , y )
            min_xy = Min ( x , y )
            max_ab = Max ( a , b )
            if max_xy == x :
                max_num , min_num = a , b
            else :
                max_num , min_num = b , a
            if c * 2 >= a + b :
                sum = a * x + b * y
            if c * 2 < a + b :
                if c * 2 >= max_num :
                    sum = max_num * abs ( x - y ) + 2 * min_xy * c
                else :
                    sum = 2 * max_xy * c
            print ( sum )
        def Max ( self , p , q ) :
            if p >= q :
                res = self.p
            else :
                res = q
            return ( res )
        def Min ( self , p , q ) :
            if p <= q :
                res = self.p
            else :
                res = self.q
            return ( res )
    return Main
