def _import ( ) :
    from itertools import count , repeat
    def main ( * args , ** kwargs ) :
        n = args [ 0 ]
        a = sum ( args [ 1 : ] )
        return sum ( a )
    def main ( * args , ** kwargs ) :
        k1 , k2 = - 50 * n , 0
        for i in range ( n - 1 , - 1 , - 1 ) :
            if i == j :
                continue
            s = 0
            for k in range ( min ( i , j ) + 1 , max ( i , j ) + 1 , 2 ) :
                s += a [ k ]
            if k1 <= s :
                k1 , k2 = s , j
        s = 0
        for k in range ( min ( i , k2 ) , max ( i , k2 ) + 1 , 2 ) :
            s += a [ k ]
        return s
    return main
