def import _a
class a ( object ) :
    def __init__ ( self ) :
        self.input = sys.stdin
    T = len ( sys.stdin )
    for t in range ( T ) :
        print ( "Case #%d: " % ( t + 1 ) , end = '' )
        n , p , q , r , s = [ int ( ( int ( i * p + q ) % r + s ) ) for i in range ( n ) ]
        data = [ ]
        for i in range ( n ) :
            data.append ( int ( ( long ( i * p + q ) % r ) % s ) )
        lo , hi = 1 , int ( 1e13 )
        while lo < hi - 1 :
            mid = ( lo + hi ) // 2
            if _can_do ( data , mid ) :
                hi = mid
            else :
                lo = mid
        if not _can_do ( data , lo ) :
            lo += 1
        data = [ ]
        for i in range ( n ) :
            data.append ( i )
        res = 1.* lo / data
        print ( "%.9f\n" % ( 1 - res ) , end = '' )
def can_do ( data , max ) :
    count , sum = 1 , 0
    n = len ( data )
    for i in range ( n ) :
        if data [ i ] > max :
            return False
        sum += data [ i ]
        if sum > max :
            count += 1
            sum = data [ i ]
            if count > 3 :
                return False
        return count <= 3
