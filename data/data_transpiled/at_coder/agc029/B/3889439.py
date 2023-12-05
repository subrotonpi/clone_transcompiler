def _import ( ) : return int ( next ( ) )
def _import ( ) : return long ( next ( ) )
class Main :
    def __init__ ( self , to ) :
        pot = 1
        while pot <= n_val [ to ] : pot *= 2
        target = pot - n_val [ to ]
        left , right = 0 , to + 1
        while left + 1 < right :
            med = ( left + right ) // 2
            if n_val [ med ] > target :
                right = med
            else :
                left = med
        if n_val [ left ] == target and ( left < to and freq [ left ] > 0 or left == to and freq [ left ] > 1 ) :
            freq [ to ] -= 1
            freq [ left ] -= 1
            return True
        return False
    def main ( ) :
        sc = MyScanner ( )
        out = sys.stdout
        N = sc.__next__ ( )
        values = [ sc.__next__ ( ) for _ in range ( N ) ]
        values.sort ( )
        diff = 1
        for i in range ( 1 , N ) :
            if values [ i ] != values [ i - 1 ] :
                diff += 1
        n_val = [ ]
        freq = [ ]
        idx = 0
        n_val.append ( values [ 0 ] )
        freq.append ( 1 )
        for i in range ( 1 , N ) :
            if values [ i ] != values [ i - 1 ] :
                n_val.append ( values [ i ] )
            freq [ idx ] += 1
        ans = 0
        for i in range ( diff - 1 , - 1 , - 1 ) :
            while freq [ i ] > 0 and can ( i ) :
                ans += 1
        out.write ( ans )
        out.flush ( )
