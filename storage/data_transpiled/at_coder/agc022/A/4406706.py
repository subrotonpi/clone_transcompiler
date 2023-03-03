def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.next ( )
        alphabet = [ True ] * 26
        for c in s :
            alphabet [ c - 'a' ] = True
        if len ( s ) < 26 :
            for i in range ( 26 ) :
                if alphabet [ i ] == False :
                    print ( s , chr ( i + 'a' ) )
                    return
        else :
            temp = _next_permutation ( s )
            if temp == 'Final' :
                print ( - 1 )
                return
            for i in range ( len ( s ) ) :
                if s [ i ] != temp [ i ] :
                    print ( temp [ : i + 1 ] )
                    return
    def _next_permutation ( s ) :
        s = [ s [ i ] for i in range ( len ( s ) ) ]
        pivot_pos = - 1
        pivot = None
        for i in range ( len ( s ) - 2 , - 1 , - 1 ) :
            if s [ i ] < s [ i + 1 ] :
                pivot_pos = i
                pivot = s [ i ]
                break
        if pivot_pos == - 1 and pivot == None :
            return 'Final'
        L , R = pivot_pos + 1 , len ( s ) - 1
        min_pos = - 1
        min = sys.maxsize
        for i in range ( R , L , - 1 ) :
            if pivot < s [ i ] :
                if s [ i ] < min :
                    min = s [ i ]
                    min_pos = i
        s.reverse ( )
        s = [ s [ i ] for i in range ( L ) ]
        return ''.join ( s )
return Main
