def _import ( s ) : return s.next ( )
class Main :
    def solve ( self ) :
        n = g_int ( )
        f = [ [ '' ] * ( 9 - n ) for i in self.rep ( 1 , n ) ]
        r = 0
        for i in self.rep ( 1 , n ) :
            for j in self.rep ( 9 ) :
                if f [ i ] [ j ] == 'x' :
                    r += 1
                elif f [ i ] [ j ] == 'o' and f [ i - 1 ] [ j ] != 'o' :
                    r += 1
        print ( r )
    def main ( self ) :
        super ( Main , self ).solve ( )
        sys.stdout.flush ( )
    class System :
        import StringIO
        import sys
        sys.stdout = StringIO.StringIO ( )
        sys.stdout = sys.stdout = StringIO.StringIO ( )
    def __init__ ( self , s ) :
        self.s = s
    def g_int ( self ) :
        return self.s.__next__
    def g_long ( self ) :
        return self.s.__next__
    def g_double ( self ) :
        return self.s.__next__
    def rep ( self , i ) :
        return range ( i )
    def rep ( self , f , t ) :
        return range ( self.f , t )
    class Range ( Iterable ) :
        def __init__ ( self , l ) :
            self.from = 0
            self.to = 0
            self.c = 0
        def range ( self , n ) :
            self.range = range ( self.l , self.r )
        def __iter__ ( self ) :
            return self.iter ( self )
        def next ( self ) :
            return self.c <= self.n
        def __repr__ ( self ) :
            return '<%s>' % repr ( self.__repr__ ( ) )
