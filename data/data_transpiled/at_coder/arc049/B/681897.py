def import _solve
class Main ( object ) :
    def solve ( self ) :
        N = self.size
        mans = [ [ self.mani , self.mani ] for self in range ( N ) ]
        ans = calc_max ( mans , True )
        print ( max ( ans , calc_max ( mans , False ) ) )
    def calc_max ( mans , is_search_width ) :
        max_time_left = 0
        max_time_right = 0
        l = 1e5
        r = - 1e5
        x = 0 if is_search_width else 1
        for i in range ( 100 ) :
            target_l = ( l * 2 + r ) / 3
            target_r = ( l + r * 2 ) / 3
            max_time_left = 0
            max_time_right = 0
            for mani in range ( len ( mans ) ) :
                max_time_left = max ( max_time_left , ( abs ( target_l - mani [ x ] ) * mani [ 2 ] ) )
                max_time_right = max ( max_time_right , ( abs ( target_r - mani [ x ] ) * mani [ 2 ] ) )
            if max_time_left > max_time_right :
                l = target_l
            else :
                r = target_r
        return max ( max_time_left , max_time_right )
return Main
