def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        sc = _scanner ( )
        n , s , t = sc.next ( )
        ans = s + t
        for i in range ( 0 , n ) :
            concat = s [ : i ] + t
            if concat [ : n ] == s :
                if len ( ans ) > len ( concat ) :
                    ans = concat
        print ( len ( ans ) )
