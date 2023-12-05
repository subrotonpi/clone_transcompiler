def _import ( ) : return
from itertools import izip , repeat
class A ( object ) :
    def __init__ ( self , f ) :
        self.f = f
        self.rnd = random.Random ( 123 )
        def sum ( r , cnt ) :
            rr = next ( self.f )
            cc = next ( self.f )
            pi = 1
            two = next ( self.f )
            tmp1 = sum ( cnt + 1 ) * pi
            tmp2 = two * rr + 1
            tmp3 = two * cc + tmp2
            res = tmp1 * tmp3
            max = sum ( int ( res ) )
            if res >= max : return int ( res )
            return res
        def solve ( ) :
            R , t = next ( self.f )
            l , r = 0 , long ( 1e18 ) + 1000
            while r - l > 1 :
                m = ( l + r ) / 2
                ss = sum ( R , m )
                if ss <= t :
                    l = m
                else :
                    r = m
            print ( l + 1 )
        def run ( self ) :
            try :
                self.f = open ( "A.in" , "r" )
                self.f = open ( "A.out" , "w" )
                self.test_number = next ( self.f )
                for test in range ( 1 , test_number + 1 ) :
                    print ( "Case #%d: " % ( test ) , end = ' ' )
                    self.solve ( )
                    print ( test )
                self.f.close ( )
            except StopIteration :
                pass
    def run_io ( self ) :
        self.f = open ( "A.in" , "r" )
        self.f = open ( "A.out" , "w" )
        try :
            self.f.close ( )
        except StopIteration :
            pass
