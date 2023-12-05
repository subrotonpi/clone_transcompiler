def import __cookie_Clicker
class CookieClicker ( ) :
    def __init__ ( self ) :
        self.times = int ( self.times )
    def f ( c , f , x , cnt ) :
        self.times = int ( self.times )
        for t in range ( 1 , times + 1 ) :
            c = self.c
            f = self.f
            x = self.x
            low = 0
            high = int ( 1e7 )
            while low + 1000 < high :
                left_third = ( 2 * low + high ) / 3
                right_third = ( low + 2 * high ) / 3
                fLeft = self.f ( c , f , x , left_third )
                fRight = self.f ( c , f , x , right_third )
                if fLeft < fRight :
                    high = right_third
                else :
                    low = left_third
            _min = 1e18
            took = - 1
            for i in range ( low , high + 1 ) :
                chk = self.f ( c , f , x , i )
                if chk < _min :
                    took = i
                    _min = min ( _min , chk )
            if took == int ( 1e7 ) :
                print ( "WARNING" )
                sys.exit ( )
            print ( "Case #%d: %.7f\n" % ( t , _min ) )
    def f ( c , f , x , cnt ) :
        time = 0
        rate = 2
        cookies = 0
        for i in range ( cnt ) :
            time += max ( 0 , ( c - cookies ) / rate )
            cookies += max ( 0 , ( c - cookies ) ) - c
            rate += f
        time += max ( 0 , ( x - cookies ) / rate )
        return time
