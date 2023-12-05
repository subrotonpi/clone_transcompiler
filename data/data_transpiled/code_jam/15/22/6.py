def import _main
class NN ( object ) :
    def __init__ ( self ) :
        sc = object.raw_input ( )
        for kk in range ( 1 , k + 1 ) :
            print ( "Case #%d: " % kk , end = "" )
            r , c , n = sc.__next__ ( )
            a = val ( r , c , n )
            print ( val ( r , c , n ) )
    def thing ( r , c , n , basegood , corn , edg ) :
        if n <= basegood :
            return 0
        n -= basegood
        if n <= corn :
            return 2 * n
        result = 2 * corn
        n -= corn
        if n <= edg :
            return result + 3 * n
        result += 3 * edg
        n -= edg
        return result + 4 * n
    def special ( self , size , n ) :
        if size % 2 == 0 :
            if n <= self.size / 2 :
                return 0
            return 2 * ( n - self.size / 2 ) - 1
        else :
            if n <= self.size / 2 + 1 :
                return 0
            return 2 * ( n - self.size / 2 - 1 )
    def val ( self , r , c , n ) :
        if r == 1 :
            return special ( c , n )
        if c == 1 :
            return special ( r , n )
        if ( r * c ) % 2 == 0 :
            return thing ( self , r , c , n , r * c / 2 , 2 , r + c - 4 )
        else :
            return min ( thing ( self , r , c , n , r * c / 2 + 1 , 0 , r + c - 2 ) , thing ( self , r , c , n , r * c / 2 , 4 , r + c - 6 ) )
return NN
