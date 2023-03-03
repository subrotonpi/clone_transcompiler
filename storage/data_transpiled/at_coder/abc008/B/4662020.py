def import _dicts_map
import Scanner
import defaultdict
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.ans = 0
    def __init__ ( self ) :
        sc = Scanner ( )
        d = defaultdict ( int )
        n = sc.next ( )
        for i in range ( n ) :
            s = sc.next ( )
            if s in d :
                d [ s ] = d [ s ] + 1
            else :
                d [ s ] = 1
        self.max = 0
        Max = ''
        for c1 in d :
            if self.max < d [ c1 ] :
                self.max = d [ c1 ]
                Max = c1
        print ( Max )
