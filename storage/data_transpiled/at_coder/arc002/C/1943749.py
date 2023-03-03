def _import ( s , s ) : return s
class Main ( object ) :
    def solve ( self ) :
        e = [ 'AA' , 'AB' , 'AX' , 'AY' , 'BA' , 'BB' , 'BX' , 'BY' , 'XA' , 'XB' , 'XX' , 'XY' , 'YA' , 'YB' , 'YX' , 'YY' , ]
        n = g_int ( )
        v = s.next ( )
        r = 114514
        for a in e :
            for b in e :
                r = min ( r , len ( re.sub ( '(%s|%s)' % ( a , b ) , '#' , v ) ) )
        print ( r )
    def main ( self , $ ) :
        super ( Main , self ).solve ( )
        sys.stdout.flush ( )
    class System ( object ) :
        import sys
        import StringIO
        import time
        import traceback
        traceback.print_exc ( )
        sys.stdout.flush ( )
    s = System ( )
    def g_int ( self ) : return s.__next__ ( )
    def g_long ( self ) : return s.__next__ ( )
    def g_double ( self ) : return s.__next__ ( )
    def rep ( self , i ) : return range ( i )
    def f ( self , t ) : return range ( f , t )
    class Range ( Iterable , _PrimitiveIterator ) :
        def __init__ ( self , l = 0 , r = 0 ) :
            self.from = 0
            self.to = 0
            self.c = 0
        def range ( self , n ) : self.range = n - 1
        def __iter__ ( self ) : return self
        def next ( self ) : return self.c <= n
        def __iter__ ( self ) : return self.next
