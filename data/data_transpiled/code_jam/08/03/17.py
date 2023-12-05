def _import ( ) :
    from math import pi , sin , cos , atan
    class FlySwatter ( object ) :
        def __init__ ( self , x , y ) :
            self.x = x
            self.y = y
        def area ( pnt ) :
            res = 0.0
            for ii in range ( 0 , len ( pnt ) ) :
                for jj in range ( 0 , len ( pnt ) ) :
                    x = [ i ]
                    y = [ i + 1 ]
                    bx = ii * ( r + g )
                    y = [ i + g ]
                    res += ( pnt [ i ] [ 0 ] - pnt [ i ] [ 1 ] )
            pnt.append ( [ i + g , i + g ] )
            return sum ( [ i for i in range ( 0 , len ( pnt ) ) ] )
        def f ( self , x , y ) :
            if not inside [ 0 ] :
                return math.pi / 2
            if not inside [ 1 ] :
                return 0.0
            return atan ( pnt [ 1 ] / pnt [ 0 ] )
        def segm ( A , B , R ) :
            pnt = [ ]
            pnt.append ( [ 0 , 0 ] )
            pnt.append ( A )
            pnt.append ( B )
            pnt.append ( [ 0 , 0 ] )
            tri = area ( pnt )
            a , b = getAngle ( A ) , getAngle ( B )
            sect = abs ( a - b ) * R ** 2 / 2.0
            return sect - tri
        def intersect ( A , B , R ) :
            if A [ 0 ] == B [ 0 ] :
                x = R ** 2 - A [ 0 ] ** 2
                if x < 0.0 :
                    x = 0.0
                return ( A [ 0 ] , sqrt ( x ) )
            else :
                x = R ** 2 - A [ 1 ] ** 2
                if x < 0.0 :
                    x = 0.0
                return ( sqrt ( x ) , A [ 1 ] )
        def doMain ( self ) :
            with open ( 'input.txt' , 'r' ) as sc :
                with open ( 'output.txt' , 'w' ) as pw :
                    cases = sc.readlines ( )
                    for case_num in cases :
                    INDENT