def import import os , time
class B ( object ) :
    def __init__ ( self ) :
        self.out = sys.stdout
        self.stdin = sys.stdin
        self.case = 'b2'
    def solve ( self ) :
        with open ( self.case , 'w' ) as f :
            self.out.write ( "%s\n" % self.case )
    def sqr ( self , a ) :
        return a * a
    def sqrt ( a ) :
        if a < 1E-8 :
            return 0
        else :
            return math.sqrt ( a )
    def solve ( self ) :
        locale.setlocale ( locale.LC_ALL , '' )
        self.out = open ( self.case + '.out' , 'w' )
        self.stdin = open ( self.case + '.in' , 'r' )
        self.N = len ( self.cases )
        for t in range ( 1 , N + 1 ) :
            print ( "Case #%d: " % t , end = ' ' )
            n = len ( self.cases )
            x , y , z , vx , vy , vz = self.cases [ t ]
            a = sqr ( vx ) + sqr ( vy ) + sqr ( vz )
            b = 2 * ( x * vx + y * vy + z * vz )
            c = sqr ( x ) + sqr ( y ) + sqr ( z )
            if a != 0 :
                time = - b / ( 2.0 * a )
            else :
                time = 0
            if time < 0 :
                time = 0
            d = sqrt ( ( a * time ** 2 + b * time + c ) ) / n
            print ( "%d %d" % ( d , time ) , end = ' ' )
