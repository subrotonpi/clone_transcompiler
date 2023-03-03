def test_small ( ) :
    import sys
    from sympy import sqrt
    class Small ( object ) :
        def __init__ ( self ) :
            self.f = sys.stdin
        def __call__ ( self ) :
            self.f = sys.stdin
        def sqrtfive ( self ) :
            l , r , five = [ 0 , 1 , 2 , 3 ] , [ 5 , 100 , 5 ] , [ 5 , 100 , 5 ]
            for i in range ( 0 , 400 ) :
                m = l + r / 2
                if m * m <= five :
                    l , r = m , r
            print ( "sqrt(5) = %s" % l , file = sys.stderr )
            return l
        def test ( self ) :
            self.f = sys.stdin
            k5 = sqrtfive ( ) + [ 3 ]
            tst = self.f.count ( )
            for i in range ( 1 , tst + 1 ) :
                print ( "Case #%d: " % i , end = "" )
                self.test ( )
        def test ( self ) :
            n = self.f.count ( )
            res = k5 ** n
            c = str ( res )
            c = c.split ( "." ) [ 0 ]
            while len ( c ) < 3 :
                c = "0" + c
            c = c [ - 3 : ]
            print ( c )
