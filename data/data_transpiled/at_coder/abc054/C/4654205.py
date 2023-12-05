def import _iter_edges
import itertools
import itertools
class Main ( object ) :
    def __init__ ( self ) :
        self.next = None
    def __next__ ( self ) :
        sc = _iter_edges ( )
        ( N , M ) = sc.__next__ ( )
        edges = np.zeros ( ( N , N ) )
        for i in range ( M ) :
            from_i = sc.__next__ ( ) - 1
            to_i = sc.__next__ ( ) - 1
            edges [ from_i ] [ to_i ] = edges [ to_i ] [ from_i ] = True
        path = _iter_edges ( )
        count = 0
        while True :
            if path [ 0 ] != 0 :
                continue
            good_path = True
            for i in range ( len ( path ) - 1 ) :
                if not edges [ path [ i ] ] [ path [ i + 1 ] ] :
                    good_path = False
                    break
            if good_path :
                count += 1
        if next_permutation ( path ) :
            print ( count )
    def next_permutation ( x ) :
        n = len ( x )
        k = n - 1
        while k > 0 and x [ k ] < x [ k - 1 ] :
            k -= 1
        if k == 0 :
            return False
        k -= 1
        l = n - 1
        while l > k and x [ l ] < x [ k ] :
            l -= 1
        tmp = x [ k ]
        x [ k ] = x [ l ]
        x [ l ] = tmp
        for i , j in zip ( range ( k + 1 , l + 1 ) , range ( len ( x ) - 1 , k ) ) :
            tmp = x [ i ]
            x [ i ] = x [ j ]
            x [ j ] = tmp
        return True
