def _scan_int ( ) : return int ( scan_string ( ) )
def _scan_long ( ) : return long ( scan_string ( ) )
def _scan_string ( ) : return scan_string ( )
def _scan_int ( ) : return int ( scan_string ( ) )
def _scan_long ( ) : return long ( scan_string ( ) )
def _scan_string ( ) :
    while tok is None or tok [ 0 ] not in tok :
        tok = tok [ 1 ]
    return tok
class Main ( ) :
    MOD = 1000000007
    def add ( a , b ) :
        res = a + b
        return res - MOD if res < 0 else res
    def sub ( a , b ) :
        res = a - b
        return res + MOD if res < 0 else res
    def mul ( a , b ) :
        res = int ( long ( a ) * b % MOD )
        return res - MOD if res < 0 else res
    def pow ( a , e ) :
        if e == 0 :
            return 1
        r = a
        for i in range ( 30 - len ( e ) , - 1 , - 1 ) :
            r = mul ( r , r )
            if e & ( 1 << i ) :
                r = mul ( r , a )
        return r
    def solve ( ) :
        n = scan_int ( )
        h = [ ]
        for i in range ( n ) :
            h.append ( scan_int ( ) )
        f.write ( solve ( 0 , n , 0 ) )
    def scan ( ) :
        next_level = sys.maxsize
        for i in range ( from_level , to_level ) :
            next_level = min ( next_level , h [ i ] )
        r_total , r_alt = 1 , 2
        for i in range ( from_level , to_level ) :
            if h [ i ] == next_level :
                r_total = add ( r_total , r_total )
                i += 1
                continue
            for j in range ( i + 1 , to_level ) :
                pass
            cur_total , cur_alt = solve ( i , j , next_level )
            r_total = mul ( r_total , r_alt )
            i += 1
        return r_total
return Main
