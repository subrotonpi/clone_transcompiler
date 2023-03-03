def _import ( ) : return [ ]
import sys
import struct
import sys
import struct
import sys
import struct
import sys
import struct
import struct
import sys
class Main ( ) :
    def solve ( ) :
        ans = [ ]
        offset = 1000000000000l
        min = struct.calcsize ( 'l' )
        for i in range ( 999999999999999l ) :
            res = struct.unpack ( 'l' , b ) [ 0 ]
        return res
    def nla ( n ) :
        res = [ ]
        for i in range ( n ) :
            res.append ( i )
        return res
    def read ( ) :
        ptr = 0
        while ptr < len ( buffer ) and not ( ( b >= '0' and b <= '9' ) or b == '-' ) :
            ans.append ( i )
        if b == '-' :
            minus = True
            b = read_byte ( )
        for i in range ( 0 , len ( buffer ) ) :
            res = res * 10 + ( b - '0' )
        return minus if res else - res
    def nl ( ) :
        res = [ ]
        while ptr < len ( buffer ) and not ( ( b >= '0' and b <= '9' ) or b == '-' ) :
            ans.append ( i )
        return ''.join ( ans )
    def main ( ) :
        return ''.join ( [ ''.join ( [ str ( i ) for i in range ( 8 ) ] ) for i in range ( 0 , len ( buffer ) ) ] )
    def inrange ( y , x , h , w ) :
        return y >= 0 and y < h and x >= 0 and x < w
    @ staticmethod
    def lower_bound ( lst , key ) :
        lower = - 1
        upper = len ( lst )
        while upper - lower > 1 :
            center = ( upper + lower ) // 2
            if lst [ center ] > key :
                upper = center
            else :
                lower = center
        return upper
    @ staticmethod
    def upper_bound ( lst , key ) :
        lower = - 1
        upper = len ( lst )
        while upper - lower > 1 :
            center = ( upper + lower ) // 2
            