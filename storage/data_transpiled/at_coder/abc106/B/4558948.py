def main ( ) :
    import os
    import sys
    import os
    import sys
    class Main ( object ) :
        def solve_b ( self ) :
            with open ( os.path.join ( os.path.dirname ( __file__ ) , 'A' , 'B' , 'C' , 'D' ) , 'r' ) as f :
                num_a = f.read ( )
                num_b = f.read ( )
                print ( ( num_a - 1 ) * ( num_b - 1 ) )
                print ( '' )
        def solve_b ( self ) :
            with open ( os.path.join ( os.path.dirname ( __file__ ) , 'A' , 'B' , 'C' , 'D' ) , 'r' ) as f :
                num_n = f.read ( )
            count = 0
            for i in range ( 1 , num_n + 1 ) :
                if i % 2 == 0 :
                    continue
                wk = i
                wkdict = { }
                for j in range ( 2 , i ) :
                    if wk % j == 0 :
                        wk /= j
                        wkdict [ j ] = wkdict [ j ] or 1
                    else :
                        j += 1
                wkres = 1
                for val1 in wkdict.values ( ) :
                    wkres *= ( val1 + 1 )
                if wkres == 8 :
                    count += 1
            print ( count )
    def solve_c ( self ) :
        with open ( os.path.join ( os.path.dirname ( __file__ ) , 'A' , 'C' , 'D' , 'E' , 'D' ) , 'r' ) as f :
            num_n = f.read ( )
            print ( '' )
    def solve_d ( self ) :
        with open ( os.path.join ( os.path.dirname ( __file__ ) , 'A' , 'B' , 'C' , 'D' , 'E' , 'E' , 'E' , 'E' , 'E' , 'E' , 'E' , 'E' , 'E' , 'E' , 'E' ) ) as f :
            num_n = f.read ( )
        print ( '' )