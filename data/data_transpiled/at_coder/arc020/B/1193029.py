def _import ( ) :
    from math import sin , cos , pi
    def cost ( a , c1 , c2 ) :
        sum = 0
        for i in range ( 0 , len ( a ) , 2 ) :
            if a [ i ] != c1 :
                sum += 1
        for j in range ( 1 , len ( a ) , 2 ) :
            if a [ j ] != c2 :
                sum += 1
        return sum
    def main ( ) :
        sc = sys.stdin
        n , c = sc.readline ( ).split ( )
        a = [ ]
        for i in range ( n ) :
            a.append ( sc.readline ( ) )
        ans = sys.maxint
        for i in range ( 1 , 10 ) :
            for j in range ( 1 , 10 ) :
                if i == j :
                    continue
                ans = min ( ans , cost ( a , i , j ) * c )
        print ( ans )
    return main
