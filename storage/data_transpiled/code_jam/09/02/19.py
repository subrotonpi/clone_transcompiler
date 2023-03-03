def qualifiers ( ) :
    import sys
    import os
    import sys
    import string
    import string
    import string
    import string
    import string
    class WaterSheds ( object ) :
        def __init__ ( self , dx , dy , map , labels , alpha ) :
            self.dx = [ ]
            self.dy = [ ]
            self.map = map
            self.labels = [ ]
            self.H = int ( self.map [ 0 ] )
            self.W = int ( self.map [ 1 ] )
            self.W = int ( self.map [ 1 ] )
            self.W = int ( self.map [ 2 ] )
        def drain ( self , row , col ) :
            if self.labels [ row ] [ col ] [ 0 ] != - 1 and self.labels [ row ] [ col ] [ 1 ] != - 1 :
                return self.labels [ row ] [ col ]
    def main ( ) :
        obj = WaterSheds ( )
        f = string.split ( '' )
        N = int ( f.strip ( ) )
        for i in range ( 1 , len ( f ) ) :
            t = f.split ( '' )
            for k in range ( 0 , W ) :
                f [ i ] [ k ] = int ( t [ k ] )
        ret = obj.categorize_basin ( f )
        print ( 'Case #' + str ( i ) + ':' )
        for j in range ( 0 , N ) :
            out = ''
            for k in range ( 0 , N ) :
                out += '' + str ( j )
            print ( out.strip ( ) )
    if low == int ( 0 ) :
        ret = [ ]
        ret = [ ]
    else :
        ret = drain ( ret [ 0 ] , ret [ 1 ] )
    labels = [ ]
    for i in range ( 0 , H ) :
        for j in range ( 0 , W ) :
            if i in labels :
                labels [ i ] [ j ] [ 0 ] = - 1
                labels [ i ] [ j ] [ 1 ] = - 1
    return ret
