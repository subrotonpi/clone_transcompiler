def _import ( ) :
    import os
    import sys
    import threading
    import time
    class B ( ) :
        def solve ( self ) :
            self.d = [ ]
            self.d.sort ( )
            x = 0
            while x < len ( self.d [ 0 ] ) and self.d [ 0 ].get ( x ) == 0 :
                x += 1
            y = 0
            while y < len ( self.d [ 1 ] ) and self.d [ 1 ].get ( y ) == 0 :
                y += 1
            cnt = max ( self.d [ 0 ] , self.d [ 1 ] )
            cnt = max ( cnt , x + y )
            if cnt == x + y :
                return cnt , '%d 0' % cnt
            z = cnt - x - y
            ans = 0
            for p in range ( n ) :
                a = self.count [ 0 ] [ p ]
                b = self.count [ 1 ] [ p ]
                if a + b > cnt :
                    ans += a + b - cnt
            return cnt , ans
    n , c = [ ] , [ ]
    d = [ ]
    count = [ ]
    def run ( self ) :
        n , c , m = self.n , self.c , self.d
        d = [ ]
        for p in range ( c ) :
            d.append ( p )
            count [ b ] [ p ] += 1
        return d
    def run ( self ) :
        n_threads = 4
        filename_suffix = ''
        format_out = "Case #%2$d: %1$s"
        format_system_out = format_out
        fname = re.sub ( "_.*" , "" , self.d [ 0 ] ).lower ( ) + filename_suffix
        input_fname = fname + ".in"
        output_fname = fname + ".out"
        self.run ( self )
    run ( )
