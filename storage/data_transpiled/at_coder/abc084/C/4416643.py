def main ( ) :
    import sys
    class Main ( object ) :
        def solve_c ( self ) :
            with open ( self.filename , 'r' ) as f :
                num_m = f.read ( )
            print ( 0 )
        def solve_d ( self ) :
            with open ( self.filename , 'r' ) as f :
                num_k = f.read ( )
            print ( 24 + 24 - num_m )
        def solve_b ( self ) :
            with open ( self.filename , 'r' ) as f :
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
            res = 0
            c , s , f = self.csf [ current_i ]
            if current_time < s :
                res = s
            else :
                res = current_time
            if res % f != 0 :
                res = res + ( f - res % f )
            res += c
            res = get_time ( self.current_i + 1 , res )
            return res
    c_num_n = 0
    for i in range ( len ( self.csf ) ) :
        c_num_n = i
        csf = [ [ ] for i in range ( self.c_num_n - 1 , 3 ) ]
        for i in range ( self.csf [ current_i ] ) :
            print ( get_time ( i , 0 ) )
