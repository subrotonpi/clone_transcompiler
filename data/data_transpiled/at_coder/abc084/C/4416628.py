def main ( ) :
    import sys
    class Main ( object ) :
        def solve_c ( self ) :
            with open ( '/proc/csf/c' , 'r' ) as f :
                num_m = f.read ( )
            with open ( '/proc/csf/c' , 'r' ) as f :
                num_k = f.read ( )
            with open ( '/proc/csf/c' , 'r' ) as f :
                num_s = f.read ( )
            print ( 24 + 24 - num_m )
        def solve_b ( self ) :
            with open ( '/proc/csf/c' , 'r' ) as f :
                num_a = f.read ( )
                num_b = f.read ( )
                s = f.read ( )
                try :
                    wka = s [ : num_a ]
                    wkb = s [ num_a + 1 : len ( s ) ]
                    int ( wka )
                    int ( wkb )
                    if num_a + num_b + 1 == len ( s ) :
                        wk = s [ num_a : num_a + 1 ]
                        if wk == '-' :
                            print ( 'Yes' )
                            return
                except ValueError :
                    pass
            print ( 'No' )
        def get_time ( self , current_i , current_time ) :
            if current_i == self.c_num_n - 1 :
                return current_time
            res = current_time
            c , s , f = self.csf [ current_i ]
            if current_time < s :
                res = s
            elif current_time % f != 0 :
                res = res + ( f - res % f )
            res += c
            res = get_time ( self , current_i + 1 , res )
            return res
    c_num_n = 0
    csf = [ ]
    for i in range ( len ( sys.argv ) ) :
        sys.argv.append ( sys.argv [ 0 ] )
    for i in range ( len ( sys.argv ) ) :
        sys.argv.append ( sys.argv [ 0 ] )
    return Main ( )
