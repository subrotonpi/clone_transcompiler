def _import ( a , b , c , d , i , j , k ) :
    import sys
    import string
    import sys
    sj = string.join ( [ str ( a ) , str ( b ) , str ( c ) , str ( d ) , str ( i ) , str ( j ) , str ( k ) ] )
    sj = string.join ( [ str ( a ) , str ( b ) , str ( c ) , str ( d ) , str ( i ) , str ( j ) , str ( k ) ] )
    sj = string.join ( [ str ( a ) , str ( b ) , str ( c ) , str ( d ) , str ( i ) , str ( j ) , str ( k ) ] )
    print ( sj )
    def main ( ) :
        sc = sys.stdin
        n = sc.readline ( ).split ( '' )
        a , b , c , d = int ( n [ 0 ] ) , int ( n [ 1 ] ) , int ( n [ 2 ] ) , int ( n [ 3 ] )
        for i in range ( 2 ) :
            for j in range ( 2 ) :
                for k in range ( 2 ) :
                    sum = 0
                    if i == 0 :
                        sum = a + b
                    else :
                        sum = a - b
                    if j == 0 :
                        sum += c
                    else :
                        sum -= c
                    if k == 0 :
                        sum += d
                    else :
                        sum -= d
                    if sum == 7 :
                        print ( a , b , c , d , i , j , k )
                        return
    return main
