def _import ( ) : return sys.stdin
import io
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
def lowerBound ( a , x ) :
    high = len ( a )
    low = - 1
    while high - low > 1 :
        mid = ( high + low ) // 2
        if a [ mid ] < x :
            low = mid
        else :
            high = mid
    return high
class Main ( ) :
    def __init__ ( self , a , x ) :
        self.stdin = io.StringIO ( )
        self.stdout = io.StringIO ( )
        self.stdin = io.StringIO ( )
        self.stdout = io.StringIO ( )
        self.stdin.write ( self.stdin )
        self.stdin.write ( self.stdout )
        self.stdin.close ( )
    def solve ( self , test_number , in_stream , out_stream ) :
        x1 = in_stream.readline ( )
        y1 = in_stream.readline ( )
        x2 = in_stream.readline ( )
        y2 = in_stream.readline ( )
        if x1 > x2 :
            tmp = x1
            x1 = x2
            x2 = tmp
            tmp = y1
            y1 = y2
            y2 = tmp
        sign = 1 if y1 < y2 else - 1
        y1 *= sign
        y2 *= sign
        n = len ( in_stream.read ( ) )
        d = defaultdict ( int )
        for i in range ( n ) :
            x = in_stream.read ( )
            y = sign * in_stream.read ( )
            if x1 <= x <= x2 and y1 <= y <= y2 :
                d [ x ] += 1
        lis = tokenize.generate_tokens ( ( ) , int ( 1e9 ) )
        for x in d.values ( ) :
            index = bisect.bisect_left ( lis , x )
            lis [ index ] = x
        lis = map ( lambda x : x , lis )
        if len ( lis ) == min ( x2 - x1 , y2 - y1 ) + 1 :
            out_stream.write ( 100.0 * ( x2 - x1 + y2 - y1 ) + ( 20 * math.pi / 4 - 20 ) * ( len ( lis ) - 1 ) + 20 * math.pi / 2 - 20 )
        