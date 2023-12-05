def round2 ( ) :
    import os
    import sys
    import os
    import kattio
    class A ( object ) :
        def __init__ ( self ) :
            self.io = kattio.open ( 'round2/A-large.in' , 'w' )
            self.cases = io.get_int ( )
            for i in range ( 1 , self.cases + 1 ) :
                io.write ( 'Case #%d: ' % i )
                A ( ).solve ( io )
            io.close ( )
    def smallest ( c , depth ) :
        if not depth :
            return '%s' % c
        if c == 'P' :
            left , right = smallest ( 'P' , depth - 1 )
        elif c == 'R' :
            left , right = smallest ( 'R' , depth - 1 )
        elif c == 'S' :
            left , right = smallest ( 'P' , depth - 1 ) , smallest ( 'S' , depth - 1 )
        else :
            raise RuntimeError
        if left > right :
            return right + left
        else :
            return left + right
    def cnt ( s ) :
        res = [ ]
        for c in s :
            if c == 'P' :
                res.append ( 1 )
            elif c == 'R' :
                res.append ( 1 )
            elif c == 'S' :
                res.append ( 2 )
        return res
    def solve ( io ) :
        n , r , p , s = io.get_int ( )
        pcnt = cnt ( smallest ( 'P' , n ) )
        rcnt = cnt ( smallest ( 'R' , n ) )
        scnt = cnt ( smallest ( 'S' , n ) )
        if pcnt [ 0 ] == p and pcnt [ 1 ] == r and pcnt [ 2 ] == s :
            io.write ( smallest ( 'P' , n ) )
        elif pcnt [ 0 ] == p and rcnt [ 1 ] == r and pcnt [ 2 ] == s :
            io.write ( smallest ( 'R' , n ) )
        elif scnt [ 0 ] == p and scnt [ 2 ] ==