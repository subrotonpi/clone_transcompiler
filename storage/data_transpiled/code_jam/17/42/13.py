def _ import _ , sys , os , sys , out , _ ) :
    import sys
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import sys
    import os
    import sys
    import locale
    class B ( Scanner ) :
        def read ( self , s ) :
            self.Scanner = s
        def int_line ( self ) :
            return int ( self.Scanner.line ( ) )
        def fill ( self , seat , rides ) :
            left = 0
            res = 0
            for i in range ( 1 , len ( seat ) ) :
                diff = rides - seat [ i ]
                if diff < 0 :
                    res -= diff
                left += diff
                if left < 0 :
                    return - 1
            return res
        def solve ( self ) :
            n , c , m = select ( [ 0 ] , [ ] , [ ] , [ ] )
            seat = [ 0 ] * n + [ c ]
            cust = [ 0 ] * c + [ c ]
            max_cust = 0
            for p in select ( [ 0 ] , [ ] , [ ] ) :
                b = select ( [ 0 ] , [ ] , [ ] )
                cust [ b ] += 1
                seat [ p ] += 1
                max_cust = max ( max_cust , cust [ b ] )
            for res in range ( max_cust ) :
                x = fill ( seat , res )
                if x >= 0 :
                    return res , x
    def main ( ) :
        locale.setlocale ( locale.LC_ALL , '' )
        cn = os.path.join ( os.path.dirname ( __file__ ) , 'src' , B.__name__ )
        sample_name = '%s-sample.in' % cn
        small_name = '%s-small-attempt0.in' % cn
        large_name = '%s-large.in' % cn
        name = large_name
        out_name = name.split ( '.' ) [ 0 ] + '.out'
        f = open ( name , 'r' )
        out = None
        if not out :
            out = sys.stdout
        with open ( out_name , 'w' ) as f :
            out = f.write ( b'' )