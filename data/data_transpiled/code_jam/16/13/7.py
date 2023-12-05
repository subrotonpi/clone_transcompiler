def main ( ) :
    import sys
    from itertools import count
    sc = sys.stdin
    tcc = sc.count ( '/' )
    for tc in range ( 1 , tcc + 1 ) :
        n = sc.count ( '/' )
        kids = [ Kid ( i + 1 ) for i in range ( n ) ]
        for i in range ( n ) :
            kids [ i ].bff = kids [ sc.count ( '/' ) - 1 ]
        max_cycle = 0
        for first in kids :
            seen = set ( )
            k = first
            for _ in range ( tc ) :
                if k in seen :
                    if k == first :
                        first.cycle = len ( seen )
                        max_cycle = max ( max_cycle , first.cycle )
                    break
                seen.add ( k )
                k = k.bff
        for first in kids :
            seen = set ( )
            k = first
            for _ in range ( tc ) :
                if k in seen :
                    if k.cycle == 2 :
                        k.brings = max ( k.brings , len ( seen ) - 1 )
                    break
                seen.add ( k )
                k = k.bff
        brings = 0
        for k in kids :
            if k.cycle == 2 :
                brings += k.brings
            print ( 'Case #%d: %d' % ( tc , max ( max_cycle , brings ) ) )
    class Kid ( object ) :
        def __init__ ( self , bff = 0 ) :
            self.bff = bff
            self.index = 0
            self.cycle = 0
            self.brings = 0
        def __repr__ ( self ) :
            return '%s(%d,%d)' % ( self.index , self.cycle , self.brings )
