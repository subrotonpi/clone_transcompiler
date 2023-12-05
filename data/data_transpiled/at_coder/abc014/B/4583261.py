def import import string
import sys
import string
import string
import sys
if sys.version_info >= ( 3 , 0 ) :
    mo = [ ]
    answer = 0
    with open ( '/proc/%d/input' % sys.argv [ 0 ] ) as f :
        num , du = f.read ( ).split ( ' ' )
        d = string.fromhex ( du )
        for i in range ( 0 , len ( d ) ) :
            c = string.fromhex ( d [ - 1 - i ] )
            if d [ - 1 - i ] == '1' :
                answer += c
        print ( answer + " " )
