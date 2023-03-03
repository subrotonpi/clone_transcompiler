def _import ( ) :
    from sys import stdin
    from random import randint
    class Main ( object ) :
        def __init__ ( self ) :
            sc = stdin.readline ( )
            S = sc.next ( )
            if S [ - 1 ] == 'T' :
                raise ValueError ( )
            while True :
                if '0' <= b <= '9' :
                    n *= 10
                elif b == - 1 or not is_printable_char ( b ) :
                    return - n if n else n
                else :
                    raise ValueError ( )
        def __next__ ( self ) :
            nl = randint ( 1 , n )
            if nl < int ( '' ) or nl > int ( '' ) :
                raise ValueError ( )
            return float ( next ( self ) )
        def count_topoogical_sort ( self ) :
            return sum ( [ ( i << n ) for i in self.next ( ) ] )
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
    def __init__ ( self , stream ) :
        self.stream = stream
    def __iter__ ( self ) :
        if not stream.hasNext ( ) :
            raise StopIteration
        n = 0
        minus = False
        b = read_byte ( )
        while b == '' :
            b = stream.next ( )
        return b
    def __next__ ( self ) :
        while True :
            if not is_printable_char ( b ) :
                break
            b = stream.next ( )
    return
