def r1c ( ) :
    import os
    import math
    import os
    import math
    class B ( object ) :
        def answer ( self ) :
            sx , sy , sz , svx , svy , svz = [ ] , [ ] , [ ] , [ ] , [ ]
            for i in range ( n ) :
                sx += self.get ( i )
                sy += self.get ( i )
                sz += self.get ( i )
                svx += self.get ( i )
                svy += self.get ( i )
                svz += self.get ( i )
        def answer ( self ) :
            a = self.get ( )
            b = 2 * ( self.get ( ) )
            c = self.get ( )
            if a != 0 :
                out_t = - b / ( 2 * a )
                if out_t < 0 :
                    out_t = 0
            else :
                out_t = 0
            out_d = a * out_t ** 2 + b * out_t + c
            if out_d < 0 :
                out_d = 0
            out_d = math.sqrt ( out_d ) / n
            print ( out_d , out_t )
        def answer ( self ) :
            try :
                infile = open ( self.filename , 'r' )
                t = infile.readline ( ).split ( )
                infile.close ( )
                for i in range ( t ) :
                    print ( "Case #{}: ".format ( i + 1 ) , end = '' )
                    self.answer ( infile )
                infile.close ( )
            except :
                print ( "Exception occured, stacktrace to follow." )
                pass
    return B
