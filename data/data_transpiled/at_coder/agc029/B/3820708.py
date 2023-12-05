def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        a = [ int ( i ) for i in sc.readline ( ).split ( ) ]
        a = [ i for i in a if i not in a ]
        d = { }
        for i in a :
            if d.has_key ( i ) :
                d [ i ] = 1 + d [ i ]
            else :
                d [ i ] = 1
        res = 0
        for i in range ( N - 1 , - 1 , - 1 ) :
            if d [ i ] == 0 : continue
            d [ i ] = d [ i ] - 1
            diff = 2 * int ( d [ i ] ) - d [ i ]
            if diff in d and d [ diff ] > 0 :
                res += 1
                d [ diff ] = d [ diff ] - 1
        print ( res )
