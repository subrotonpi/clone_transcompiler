def _import ( ) :
    import math
    import os
    class Main ( object ) :
        def __init__ ( self , value , goal ) :
            print ( value , goal )
            if value == goal :
                return 0
            else :
                min = 1 << 30
                if value >= 2 and value > goal :
                    min = min ( min , _steps ( value - 1 , goal ) + 1 )
                if value < goal :
                    min = min ( min , _steps ( value + 1 , goal ) + 1 )
                for w in self.w :
                    min = min ( min , _steps ( value + w , goal ) + 10 )
                return min
        def main ( self ) :
            with open ( "/proc/input" , "r" ) as f :
                a , b , q = f.read ( ).split ( " " )
    def main ( ) :
        s , q = s.split ( " " )
        shrines , temples = sorted ( [ ] ) , sorted ( [ ] )
        for i in range ( a ) :
            shrines.append ( s.pop ( 0 ) )
        for i in range ( b ) :
            temples.append ( s.pop ( 0 ) )
        for i in range ( q ) :
            s = s.pop ( 0 )
            left_s , right_s , left_t = shrines.floor ( s ) , shrines.ceiling ( s ) , temples.floor ( s ) , temples.ceiling ( s )
            if not left_s :
                left_s = - 1 << 60
            if not left_t :
                left_t = - 1 << 60
            if not right_s :
                right_s = 1 << 60
            if not right_t :
                right_t = 1 << 60
            min = max ( s - left_s , s - left_t )
            min = min ( min , max ( right_s - s , right_t - s ) )
            min = min ( min , ( s - left_s ) + ( right_t - s ) + min ( ( s - left_s ) , ( right_t - s ) ) )
    return Main
