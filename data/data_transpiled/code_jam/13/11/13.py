def _import ( p ) : return p [ 0 ]
import math
import time
import time
import sys
import sys
class Main ( object ) :
    def sum_sq ( self , i ) : return math.pow ( i , i + 1 ) * math.pow ( 2 * i + 1 , 6 )
    def sum_ev_sq ( self , i ) : return math.pow ( 4 , sum_sq ( i / 2 ) )
    def sum_odd_sq ( self , i ) : return sum_sq ( i ) - sum_ev_sq ( i - 1 )
    def case_ev ( self , i ) : return sum_ev_sq ( i ) - sum_odd_sq ( i - 1 )
    def case_odd ( self , i ) : return sum_odd_sq ( i ) - sum_ev_sq ( i - 1 )
    def go ( self ) :
        ttt = sc.randint ( 1 , 100 )
        for tt in range ( 1 , ttt + 1 ) :
            r , t = sc.randint ( 0 , 100 ) , sc.randint ( 0 , 100 )
            lo , hi = 0 , long ( 1e12 )
            while hi - lo > 1 :
                mid = ( lo + hi ) // 2
                if r % 2 == 1 :
                    if case_ev ( r - 1 + 2 * mid ) - case_ev ( r - 1 ) <= t :
                        lo = mid
                    else :
                        hi = mid
                else :
                    if case_odd ( r - 1 + 2 * mid ) - case_odd ( r - 1 ) <= t :
                        lo = mid
                    else :
                        hi = mid
            print ( "Case #%d: %d\n" % ( tt , lo ) )
