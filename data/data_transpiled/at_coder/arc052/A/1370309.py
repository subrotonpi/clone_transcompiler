def import re
import re
import re
import re
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        cnt = 0
        buf = [ ]
        S = sc.readline ( )
        chk = S.split ( '' )
        for chker in chk :
            regex = '[0-9]+'
            p = re.compile ( regex )
            m = p.search ( chker )
            if m :
                cnt += 1
                buf.append ( chker )
        print ( ''.join ( buf ) )
