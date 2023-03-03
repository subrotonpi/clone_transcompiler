def _import ( ) : return int ( next ( ) )
def __next__ ( n ) : return int ( next ( ) )
def __next__ ( n ) : return next ( )
def __next__ ( n ) : return next ( )
def __next__ ( n ) : return next ( )
def __next__ ( n ) : return next ( )
def __next__ ( n ) : return next ( )
def __next__ ( n ) : return next ( )
def solve ( ) :
    result = [ ]
    for i in range ( 29 ) :
        t = int ( pow ( 2 , i ) )
        BT = [ i for i in B if i % 2 == 0 ]
        for j in range ( N ) :
            BT [ j ] %= 2 ** t
        BT.sort ( )
        cnt = 0
        for j in range ( N ) :
            at = A [ j ] % ( 2 ** t )
            cnt += search ( t - at , 2 ** t - at , BT )
            cnt += search ( 3 ** t - at , 4 ** t - at , BT )
            cnt %= 2
        if cnt % 2 == 1 :
            result.append ( True )
    ans = 0
    for i in range ( 29 ) :
        if result [ i ] :
            ans += 1 << i
    return ans
def search ( from_number , to_number , BT ) :
    f = lower_bound ( from_number , BT )
    t = lower_bound ( to_number , BT )
    return t - f
def lower_bound ( a , array ) :
    low = 0
    high = len ( array )
    while low < high :
        mid = ( low + high ) // 2
        if array [ mid ] < a :
            low = mid + 1
        else :
            high = mid
    return low
class FastScanner ( object ) :
    def __init__ ( self , stream = None ) :
        self.stream = stream or None
    def __next__ ( self ) :
        if self.stream is None or not self.stream :
            try :
                return next ( )
            except StopIteration :
                raise StopIteration
        else :
            self.stream = stream or None
