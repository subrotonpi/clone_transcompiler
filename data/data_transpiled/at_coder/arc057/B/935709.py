def _import ( ) : return int ( sc.next ( ) )
def main ( ) :
    def __int__ ( i ) :
        def __int__ ( ) :
            def __int__ ( ) :
                return __int__
            return __int__
        def __int__ ( ) :
            n = ni ( )
            k = ni ( )
            sum = 0
            a = [ ]
            for i in range ( n ) :
                a.append ( __int__ ( i ) )
            sum += a [ i ]
            if sum == k :
                print ( 1 )
            else :
                dp = [ ]
                for i in range ( 0 , n ) :
                    dp.append ( __int__ ( i ) )
                dp.append ( [ 0 ] )
                s = 0
                for i in range ( 0 , n ) :
                    if dp [ i ] [ j ] == __int__ :
                        continue
                    dp [ i + 1 ] [ j ] = min ( dp [ i + 1 ] [ j ] , dp [ i ] [ j ] )
                    u = dp [ i ] [ j ]
                    ns = s + a [ i ]
                    if s == 0 :
                        v = 1
                    else :
                        v = ( u * ns ) / s + 1
                    if v <= k :
                        dp [ i + 1 ] [ j + 1 ] = min ( dp [ i + 1 ] [ j + 1 ] , int ( v ) )
                s += a [ i ]
            for i in range ( 0 , n ) :
                if dp [ n ] [ i ] != __int__ :
                    print ( i )
                    break
        return __int__
    ni ( )
    return int ( __int__ ( ) )
def debug ( * os ) :
    print ( "".join ( os ) )
class BIT ( object ) :
    def __int__ ( self ) :
        return int ( __int__ ( ) )
    def __int__ ( self ) :
        return __int__ ( )
    def __int__ ( ) :
        return __int__ ( )
return reduce ( lambda i , default : __int__ ( ) )
