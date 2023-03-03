def import re
import re
import re
import re
import re
import re
import re
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        S = sc.readline ( )
        chk = S.split ( '' )
        cnt = 0
        buf = [ ]
        for chker in chk :
            regex = '[0-9]+'
            p = re.compile ( regex )
            m = p.search ( chker )
            if m :
                cnt += 1
                buf.append ( chker )
            elif cnt >= 1 :
                continue
        print ( ''.join ( buf ) )
