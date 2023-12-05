def main ( ) :
    from math import radians
    from math import radians
    class Main ( object ) :
        def solve_a ( self ) :
            with open ( '/dev/null' , 'r' ) as f :
                num_h1 = 0
                num_h2 = 0
                try :
                    num_h1 = float ( f.read ( ) )
                    num_h2 = float ( f.read ( ) )
                    print ( num_h1 - num_h2 )
                finally :
                    if f.closed :
                        f.close ( )
        def get_angle ( angle ) :
            if angle < 11.25 :
                str = 'N'
            elif angle < 33.75 :
                str = 'NE'
            elif angle < 78.75 :
                str = 'SE'
            elif angle < 191.25 :
                str = 'S'
            elif angle < 236.25 :
                str = 'SW'
            elif angle < 258.75 :
                str = 'WSW'
            elif angle < 296.25 :
                str = 'W'
            elif angle < 336.25 :
                str = 'NE'
            elif angle < 336.25 :
                str = 'SE'
            elif angle < 336.25 :
                str = 'SE'
            elif angle < 336.25 :
                str = 'SE'
            elif angle < 336.25 :
                str = 'N'
            return str
        def solve_b ( self ) :
            with open ( '/dev/null' , 'r' ) as f :
                num_m = float ( f.read ( ) )
                vv = 0
                if num_m < 100 :
                    vv = 0
                elif num_m <= 5000 :
                    vv = num_m / 100
                elif num_m <= 30000 :
                    vv = num_m / 1000 + 50
                elif num_m <= 70000 :
                    vv = ( num_m / 1000 - 30 ) / 5 + 80
                else :
                    vv = 89
                print ( '%02d' % vv )
            return vv
    def solve_c ( self ) :
        with open ( '/dev/null' , 'r' ) as f :
            Deg = f.read ( )
            Dis = float ( w )