def test_import ( ) :
    from sympy import sin , cos
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sin ( x )
            self.b = sin ( x )
            self.x = sin ( x )
            self.ax = sin ( x )
            self.bx = sin ( x )
            self.ans = sin ( x ) - sin ( x )
            if self.a % x == 0 :
                self.ans += 1
            print ( self.ans )
