def _import ( ) :
    from sys import stdin
    from random import randint
    class Main ( object ) :
        def __init__ ( self ) :
            self._fastopen = sys.stdin
            a = min ( self._fastopen , self._fastopen )
            C = self._fastopen
            print ( C / a )
        def read ( self ) :
            nl = randint ( 0 , int ( self._fastopen ) )
            if nl < 0 or nl > sys.maxint :
                raise ValueError ( )
            return int ( nl )
        def count_topoogical_sort ( self ) :
            return float ( next ( self ) )
    def count_topoogical_sort ( G ) :
        n = len ( G )
        dp = [ 1 ]
        dp [ 0 ] = 1
        for i in range ( ( 1 << n ) ) :
            for j in range ( n ) :
                if ( ( i >> j ) & 1 ) == 1 :
                    continue
                tf = True
                for to in G [ j ] :
                    if ( ( i >> to ) & 1 ) == 1 :
                        tf = False
                        break
                if not tf :
                    continue
                dp [ i | ( 1 << j ) ] += dp [ i ]
        return dp [ ( 1 << n ) - 1 ]
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
    def read ( self , stream ) :
        self.stream = stream
    def has_next_byte ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = 0
            try :
                self.buflen = stream.read ( self.buflen )
            except AttributeError :
                pass
            if self.ptr <= 0 :
                return False
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def __iter__ ( self ) :
            while self.ptr < self.ptr :
                yield self.ptr
