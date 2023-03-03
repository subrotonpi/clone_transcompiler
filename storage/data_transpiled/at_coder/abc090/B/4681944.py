def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.read ( )
        e = sc.read ( )
        cnt = 0
        for i in range ( s , e + 1 ) :
            rev = self._rev_rev ( i )
            if i == rev :
                cnt += 1
        print ( cnt )
    def _rev_rev ( i ) :
        ic = 0
        while i > 0 :
            ic = ic * 10 + i % 10
            i //= 10
        return ic
