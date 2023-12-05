def pycompany ( ) :
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import string
    import string
    class ProbB ( object ) :
        def __init__ ( self ) :
            self.re_direct = True
            self.T = len ( self.T )
            for cas in range ( 1 , T + 1 ) :
                ans = self.run ( )
                print ( "Case #%d: %s" % ( cas , ans ) )
        def run ( self ) :
            input = self.input
            arr = string.split ( input ) [ 0 ].split ( '.' )
            x = len ( arr )
            for i in range ( len ( arr ) - 1 ) :
                if arr [ i ] > arr [ i + 1 ] :
                    x = i + 1
                    break
            if x == len ( arr ) :
                return input
            y = x - 1
            while y > 0 and arr [ y ] == arr [ y - 1 ] :
                y -= 1
            arr [ y ] -= 1
            for i in range ( y + 1 , len ( arr ) ) :
                arr [ i ] = '9'
            return string.join ( arr )
        def re_direct ( self ) :
            with open ( 'B-large.in' , 'rb' ) as file_obj :
                self.scanner = file_obj.read ( )
            with open ( 'bout-large.txt' , 'wb' ) as file_obj :
                sys.stdout = file_obj
    return ProbB
