def _import ( ) :
    from math import sqrt
    from math import sin , cos
    class Q2 ( object ) :
        def __init__ ( self , t , d ) :
            self.t = t
            self.d = d
        def __repr__ ( self ) :
            return "(%s,%s)" % ( self.t , self.d )
    def get_result ( self ) :
        d = float ( self.t )
        n = len ( self.s )
        a = len ( self.s )
        other_car = [ ( s [ 0 ] , s [ 1 ] ) for s in self.s ]
        for i in range ( 1 , n ) :
            pos = other_car [ i ]
            prev = other_car [ i - 1 ]
            if pos.d > d :
                their_speed = ( pos.d - prev.d ) / ( pos.t - prev.t )
                t = ( d - prev.d ) / their_speed + prev.t
                other_car.insert ( i , ( t , d ) )
                break
        res = [ ]
        for a_index , acc in enumerate ( self.s ) :
            straight_time = solve ( 0.5 * acc , 0 , - d )
            penalties = 0
            for pos in other_car :
                if pos.d > d :
                    break
                my_time = solve ( 0.5 * acc , 0 , - pos.d )
                if my_time + penalties < pos.t :
                    penalties = pos.t - my_time
            res.append ( straight_time + penalties )
        return res
    def solve ( a , b , c ) :
        s = ( - b - sqrt ( b ** 2 - 4 * a * c ) ) / ( 2 * a )
        if s > 1e-6 :
            return s
        return solve ( 0.5 * a , 0 , - d )
    def solve ( a , b , c ) :
        s = ( - b - sqrt ( b ** 2 - 4 * a * c ) ) / ( 2 * a )
        if s > 1e-6 :
            return s
        return solve ( 0.5 * a , 0 , - d )
    return solve ( 0.5 * a , 0 , - d )
