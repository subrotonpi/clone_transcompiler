def import _f2
class B ( object ) :
    def __init__ ( self ) :
        self.L = 1000 * 1000
        self.EPS = 1e-9
    def main ( self ) :
        with open ( "input.txt" , "r" ) as f :
            self.T = f.read ( )
    CAS :
        for cas in range ( 1 , T + 1 ) :
            n = len ( self.A )
            A = [ i for i in range ( n ) ]
            D = [ A [ i + 1 ] - A [ i ] for i in range ( n - 1 ) ]
            a_lo = - self.L
            a_hi = self.L
            while a_lo + EPS < a_hi :
                a1 = a_lo + ( a_hi - a_lo ) / 3
                a2 = a_hi - ( a_hi - a_lo ) / 3
                b_a1 = f1 ( a1 )
                b_a2 = f1 ( a2 )
                if f2 ( a1 , b_a1 ) < f2 ( a2 , b_a2 ) :
                    a_hi = a2
                else :
                    a_lo = a1
            a = a_lo
            b = f1 ( a )
            ans = f2 ( a , b )
            print ( "Case #%d: %.8f\n" % ( cas , ans ) )
    def f1 ( a ) :
        b_lo = - self.L
        b_hi = self.L
        while b_lo + EPS < b_hi :
            b1 = b_lo + ( b_hi - b_lo ) / 3
            b2 = b_hi - ( b_hi - b_lo ) / 3
            if f2 ( a , b1 ) < f2 ( a , b2 ) :
                b_hi = b2
            else :
                b_lo = b1
        return b_lo
    evals = 0
    def n ( self ) :
        self.evals += 1
        D2 = [ ]
        D2.append ( self.D [ 0 ] )
        D2.append ( self.D [ - 2 ] )
        ans = max ( abs ( a ) , abs ( b ) )
        avg = 0
        for i in range ( n - 1 ) :
            self.evals += 1
        return ans
