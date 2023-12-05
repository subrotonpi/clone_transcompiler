def _import ( ) : return sys.stdin.read ( 1024 )
import math
import text
class Main ( ) :
    def solve ( ) :
        w , h = randint ( 1024 , 2048 )
        big = max ( w , h ) - 1
        small = min ( w , h ) - 1
        divisor = big_factorial ( 2 , small - 1 )
        dividend = big_factorial ( big + 1 , small )
        ans = dividend / divisor
        ans = ans % pow ( MOD , n )
        out.write ( ans )
    def next_int ( n ) :
        ar = [ ]
        for i in range ( n ) :
            ar.append ( randint ( 0 , 32 ) )
        return ar
    def next_int ( n ) :
        if not hasNext ( ) : raise StopIteration
        temp = read_byte ( )
        if temp == '-' :
            minus = True
            temp = read_byte ( )
        if temp < '0' or temp < '9' :
            n *= 10
            n += temp - '0'
        else : raise StopIteration
        temp = read_byte ( )
        while is_printable ( temp ) :
            ans.append ( temp )
        return ans
    def next_int ( n ) :
        return random.randint ( 0 , 32 )
    def next_int ( n ) :
        ar = [ ]
        for i in range ( n ) :
            ar.append ( randint ( 0 , 32 ) )
        t , length = 1 , len ( ar )
        while t <= length :
            for i in range ( 0 , length ) :
                if t + i < length :
                    ar [ i ] = ar [ i ] * ar [ i + t ]
                    ar [ i + t ] = None
            gc.collect ( )
            t = t << 1
        return ar
    def main ( ) :
        out = sys.stdout
        with out :
            return Main ( ).solve ( )
            out.flush ( )
    MAX_INT , MIN_INT = int ( max ( * ar ) ) , int ( min ( * ar ) )
PI = math.pi
MOD = 1000000007
def max ( * ar ) :
    for i in range ( len ( ar ) ) :
        out.write ( ar [ i ] )
    out.write ( '