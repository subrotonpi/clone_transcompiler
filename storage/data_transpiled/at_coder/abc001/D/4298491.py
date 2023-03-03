def _import ( ) :
    import sys
    import os
    import sys
    import time
    import time
    import sys
    import os
    import sys
    import os.path
    import sys
    class Main ( ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.stdout = sys.stdout
        def next1 ( self , a , idx ) :
            if idx == - 1 :
                return - 1
            for i in range ( idx , len ( a ) ) :
                if a [ i ] == 1 :
                    return i
            return - 1
        def last1 ( self , a , idx ) :
            if idx == - 1 :
                return - 1
            for i in range ( idx , len ( a ) ) :
                if a [ i ] == 0 :
                    return i - 1
            return - 1
        def seiri ( self , m ) :
            r = [ ]
            i = 0
            while True :
                lidx = next1 ( self , m , i )
                ridx = last1 ( self , m , lidx + 1 )
                if lidx == - 1 :
                    break
                ls , rs = self._idx_to_time ( lidx )
                if ridx == - 1 :
                    rs = '2400'
                    i = - 1
                else :
                    rs , i = self._idx_to_time ( ridx )
                r.append ( [ ls , rs ] )
            return r
        def _time_to_idx ( t ) :
            h , m = t // 100 , t % 100
            return h * 60 + m
        def _idx_to_time ( idx ) :
            return '%02d%02d' % ( idx // 60 , ( idx % 60 ) )
        def main ( self ) :
            with open ( self.stdin ) as sc :
                n = sc.readline ( ).split ( ) [ 0 ]
                m = [ ]
                for s in sc :
                    lhs , rhs = [ int ( s [ : 4 ] ) for s in s [ 5 : 9 ] ]
                    lhs -= ( 5 - ( rhs % 5 ) ) % 5
                    rhs += 1
                return m
            return n
    return Main
