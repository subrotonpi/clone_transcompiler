def main ( ) :
    import sys
    try :
        with open ( '/proc/sys/stdin' ) as f :
            n = int ( f.read ( ) )
            a = int ( f.read ( ) )
            b = int ( f.read ( ) )
            c = int ( f.read ( ) )
            f.write ( '\n' )
            l = [ ]
            for i in range ( n ) :
                l.append ( i )
                f.write ( '\n' )
            print ( dfs ( 0 , 0 , 0 , 0 , n , a , b , c , l ) )
    except :
        print ( '/proc/sys/stdin' )
    def dfs ( cur , d , e , f , n , a , b , c , l ) :
        if cur == n :
            if min ( d , e , f ) > 0 :
                return abs ( d - a ) + abs ( e - b ) + abs ( f - c ) - 30
            else :
                return sys.maxint
        ret0 = dfs ( cur + 1 , d , e , f , n , a , b , c , l )
        ret1 = dfs ( cur + 1 , d + l [ cur ] , e , f , n , a , b , c , l ) + 10
        ret2 = dfs ( cur + 1 , d , e + l [ cur ] , f , n , a , b , c , l ) + 10
        ret3 = dfs ( cur + 1 , d , e , f + l [ cur ] , n , a , b , c , l ) + 10
        return min ( ret0 , ret1 , ret2 , ret3 )
    return 0
