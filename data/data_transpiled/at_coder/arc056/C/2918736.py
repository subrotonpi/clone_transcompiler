def _import ( ) : return sys.stdin.read ( )
import io
import sys
import struct
class Main ( object ) :
    def solve ( ) :
        n , k = ni ( )
        w = [ [ ] for _ in range ( n ) ]
        for i in range ( n ) :
            for j in range ( n ) :
                w [ i ] [ j ] = i
        return - res if not ( b in '-' ) else res
    def nl ( ) :
        for i in range ( n ) :
            for j in range ( n ) :
                if ( ( i >> j ) & 1 ) == 0 :
                    continue
                for m in range ( j , n ) :
                    if ( ( i >> m ) & 1 ) == 1 :
                        sum [ i ] += w [ j ] [ m ]
        dp = [ ]
        for i in range ( 1 , n ) :
            for comb in range ( 1 , n ) :
                comb = ( ( comb & ~ ( comb + ( comb & - comb ) ) ) / ( comb & - comb ) >> 1 ) | comb + ( comb & - comb )
            dp.append ( k )
            for m in range ( ( 1 , n ) ) :
                m &= comb
                dp [ comb ] = max ( dp [ comb ] , dp [ m ] + dp [ comb & ( ~ m ) ] - ( sum [ comb ] - sum [ m ] - sum [ comb & ( ~ m ) ] ) )
        out.write ( dp [ ( 1 , n ) ] )
    def main ( ) :
        solve ( )
        out.flush ( )
    def stdin ( ) :
        out = sys.stdout.write
    def stdout ( ) :
        buffer = sys.stdin.read
        ptr = 0
        buflen = 0
        def has_next_byte ( ) :
            if ptr < buflen :
                return True
            ptr = 0
            try :
                buflen = buffer.index ( ptr )
            except ValueError :
                pass
            return ptr
        out.write ( buffer )
        return buf
