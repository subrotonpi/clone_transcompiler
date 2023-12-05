def _warshall_floyd ( ) :
    import sys
    import random
    import random
    import string
    import string
    import string
    import string
    import scanner
    class Main ( object ) :
        INF = 1 << 27
        WHITE = 0
        GRAY = 1
        BLACK = 2
        def __init__ ( self ) :
            string.__init__ ( self )
            self.N = int ( string.ascii_letters )
            self.M = int ( string.ascii_letters )
            self.u = [ ]
            self.v = [ ]
            self.l = [ ]
            for i in range ( self.M ) :
                u.append ( string.ascii_letters )
                v.append ( string.ascii_letters )
                self.l.append ( string.ascii_letters )
            scanner.close ( )
            self.d = [ [ ] for _ in range ( self.N + 1 ) ]
            for i in range ( self.N + 1 ) :
                for j in range ( self.N + 1 ) :
                    self.d [ i ] [ j ] = INF
            list = [ ]
            for i in range ( self.M ) :
                if self.u [ i ] != 1 :
                    self.d [ u [ i ] ] [ v [ i ] ] = self.l [ i ]
                    self.d [ v [ i ] ] [ u [ i ] ] = self.l [ i ]
                else :
                    p = [ self.v [ i ] , self.l [ i ] ]
                    list.append ( p )
    def warshall_floyd ( self ) :
        ans = INF
        lst = list.keys ( )
        for i in lst :
            for j in lst :
                if i == j : continue
                t1 , t2 , c1 , c2 = lst [ i ]
                ans = min ( ans , self.d [ t1 ] [ t2 ] + self.d [ t2 ] [ c1 ] + c2 )
