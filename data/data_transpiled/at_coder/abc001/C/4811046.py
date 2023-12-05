def main ( ) :
    import decimal
    import sys
    class Main ( object ) :
        def solve_a ( self ) :
            with open ( '/dev/null' , 'r' ) as f :
                num_h1 = 0
                num_h2 = 0
                try :
                    num_h1 = f.read ( )
                    num_h2 = f.read ( )
                    print ( num_h1 - num_h2 )
                finally :
                    if num_h2 >= 0 :
                        num_h2 = 0
        def get_angle ( angle ) :
            str = ''
            if angle < 11.25 :
                str = 'N'
            elif angle < 56.25 :
                str = 'NE'
            elif angle < 101.25 :
                str = 'ESE'
            elif angle < 146.25 :
                str = 'SE'
            elif angle < 168.75 :
                str = 'S'
            elif angle < 213.75 :
                str = 'SW'
            elif angle < 236.25 :
                str = 'SW'
            elif angle < 296.25 :
                str = 'W'
            elif angle < 296.25 :
                str = 'NE'
            elif angle < 296.25 :
                str = 'E'
            elif angle < 296.25 :
                str = 'SE'
            elif angle < 296.25 :
                str = 'SE'
            elif angle < 296.25 :
                str = 'SE'
            elif angle < 296.25 :
                str = 'S'
            return str
        def solve_b ( self ) :
            with open ( '/dev/null' , 'r' ) as f :
                Deg = f.read ( )
                Dis = f.read ( )
            w = Dis / 60.0
            w = Decimal ( str ( w ) ).quantize ( 1 , rounding = ROUND_HALF_UP )
            ans = get_power ( w )
            if ans :
                print ( get_angle ( Deg / 10 ) , end = '' )
            else :
                print ( 'C' , end = '' )
            print ( '' , end = '' )
            print ( ans )
            print ( )
    return Main ( )
