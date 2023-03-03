def main ( ) :
    import sys
    import os
    from itertools import count
    class Main ( object ) :
        def __init__ ( self ) :
            file = sys.stdout
            with open ( '/dev/null' , 'w' ) as sc :
                self._solve ( sc , file )
            self._solve ( sc , file )
            file.flush ( )
            sc.close ( )
        def getintlist ( self ) :
            s = nstr ( sc )
            a = 0
            b = 0
            c = 0
            d = 0
            e = 0
            f = 0
            for i in range ( len ( s ) ) :
                s [ i ] = nint ( sc )
            return s
        def getintlist ( self ) :
            s = nstr ( sc )
            a = 0
            b = 0
            c = 0
            d = 0
            e = 0
            f = 0
            for i in range ( len ( s ) ) :
                x = s [ i ]
                if x == 'A' :
                    a += 1
                elif x == 'B' :
                    b += 1
                elif x == 'C' :
                    c += 1
                elif x == 'D' :
                    d += 1
                elif x == 'E' :
                    e += 1
                elif x == 'F' :
                    f += 1
            file.write ( "%d %d %d %d\n" % ( a , b , c , d , e , f ) )
    def nint ( self ) :
        return int ( self._solve ( sc , file ) )
    def nlong ( self ) :
        return long ( self._solve ( sc , file ) )
    def ndouble ( self ) :
        return float ( self._solve ( sc , file ) )
    def nfloat ( self ) :
        return float ( self._solve ( sc , file ) )
    def nstr ( self ) :
        return str ( self._solve ( sc , file ) )
    def maxfromlist ( self ) :
        return maxfromlist ( self._solve ( sc , file ) )
    def minfromlist ( self ) :
        return minfromlist ( self