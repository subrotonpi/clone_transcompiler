def _import ( ) :
    import sys
    import string
    class Main ( object ) :
        def __init__ ( self ) :
            sc = string.ascii_lowercase
            n , a = sc.split ( '' )
            i , flag1 , flag2 , count = 0 , int ( next ( sc ) )
            l , b = 1 , ''
            for i in range ( n ) : a [ i ] = sc.split ( '' ) [ 0 ]
        def readline ( self ) :
            str19 = ''
            try :
                str19 = self.readline ( )
            except EOFError :
                pass
            return str19
    ar = set ( )
    for i in range ( n - 1 , 0 , - 1 ) :
        if a [ i ] == a [ i - 1 ] :
            l *= a [ i ]
            count += 1
            if count == 2 : break
            i -= 1
    if count == 2 : print ( l )
    else : print ( '0' )
    def lower_bound ( a , x ) :
        n , low , high , res = len ( a ) , 0 , n - 1 , - 1
        while low <= high :
            mid = ( low + high ) >> 1
            if a [ mid ] >= x :
                res = mid
                high = mid - 1
            else :
                low = mid + 1
        return res
    def upper_bound ( a , x ) :
        n , low , high , res = len ( a ) , 0 , n - 1 , - 1
        while low <= high :
            mid = ( low + high ) >> 1
            if a [ mid ] <= x :
                res = mid
                low = mid + 1
            else :
                high = mid - 1
        return res
    def modexpo ( x , n , m ) :
        if n == 0 : return 1
        elif n % 2 == 0 : return ( modexpo ( ( ( x % m ) ** 2 ) % m , n // 2 , m ) ) % m
        else : return ( ( x % m ) * ( modexpo ( ( ( x % m ) ** 2 ) % m , ( n - 1 ) // 2 , m ) % m ) ) % m
