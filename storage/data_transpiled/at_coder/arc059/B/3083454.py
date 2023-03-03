def _import ( ) :
    from math import sin , cos , exp
    from os import urandom
    from os.path import join
    class Main ( object ) :
        def max_of_array ( a ) :
            ans = a [ 0 ]
            for i in a [ 1 : ] :
                if i > ans :
                    ans = i
            return ans
        def min_of_array ( a ) :
            ans = a [ 0 ]
            for i in a [ 1 : ] :
                if i < ans :
                    ans = i
            return ans
        def unbalanced ( s ) :
            count = [ 0 ] * 26
            for i in s :
                count [ i - 'a' ] += 1
            return max_of_array ( count ) > len ( s ) / 2
        def solve ( s ) :
            if len ( s ) < 3 :
                return ( '1 2' if unbalanced ( s ) else '-1 -1' )
            for i in range ( len ( s ) - 2 ) :
                if unbalanced ( s [ i : i + 3 ] ) :
                    return ( ( i + 1 , ) + s [ i + 3 : i + 3 ] )
            return '-1 -1'
    with open ( join ( sys.argv [ 1 : ] , '..' ) , 'r' ) as sc :
        s = sc.read ( )
        print ( solve ( s ) )
