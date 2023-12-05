def import re
import sys
import re
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.read ( )
        p = re.compile ( r'[ATCG]+' )
        m = p.findall ( s )
        length = 0
        for l in m :
            if length < l :
                length = l
        print ( length )
