def __out ( t , ans ) :
    import string
    class Consonant ( object ) :
        def __init__ ( self , t , ans ) :
            print ( "Case #%d: %s" % ( t + 1 , ans ) )
            return
        def is_boin ( char ) :
            return char in [ 'a' , 'i' , 'u' , 'e' , 'o' ]
    def main ( ) :
        import sys
        sys.stdout.write ( "\n" )
        T = sys.stdin.read ( ).splitlines ( )
        for t , s in enumerate ( sys.stdin.read ( ) ) :
            s = string.split ( s , ' ' )
            s = string.split ( s , ' ' )
            n = len ( s )
            boin = [ ]
            dp = [ ]
            last_b = - 1
            for i in range ( n ) :
                if is_boin ( s [ i ] ) :
                    last_b = i
                boin.append ( last_b )
            res = 0
            for i in range ( n ) :
                if i < len ( s ) - 1 :
                    continue
                if i - boin [ i ] >= len ( s ) :
                    dp.append ( ( i - len ( s ) + 2 ) )
                else :
                    if boin [ i ] > 0 :
                        dp [ i ] = dp [ boin [ i ] - 1 ]
            for i in range ( n ) :
                res += dp [ i ]
            yield t , "%.2f" % res
