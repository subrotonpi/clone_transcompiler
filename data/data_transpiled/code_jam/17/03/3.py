def _solve ( n , m ) :
    from sympy.polys.orderings import PolyElement
    from sympy.polys.orderings import Order
    from sympy.polys.orderings import PolyElement
    from sympy.polys.orderings import Order
    class Main ( object ) :
        def __init__ ( self , n , m ) :
            if m == 1 :
                return n
            n , m = self.n , self.m
            x , y = self.x , self.y , self.x
            sum_x = sum_y = Order ( 1 )
            for _ in range ( m ) :
                m , x , y = self.m - sum_x , self.y , self.x
                tx , ty , t_sum_x , t_sum_y = self.sum_x , self.sum_y
                tx , x , y = x.as_independent ( )
                if tx == x :
                    sum_x = sum_x + t_sum_x
                else :
                    sum_y = sum_y + t_sum_x
                if ty == x :
                    sum_x = sum_x + t_sum_y
                else :
                    sum_y = sum_y + t_sum_y
            return m , sum_x , sum_y
    def solve ( self , n , m ) :
        with open ( "input.txt" , "r" ) as f :
            t = f.readline ( ).strip ( )
            for i in range ( 1 , t + 1 ) :
                n , m = self.n , self.m
                sum = solve ( n , m )
                sum = sum.subs ( x , y )
                div = sum.div ( x )
                print ( "Case #{}: {} {}".format ( i , sum - div , div ) )
