def main ( ) :
    from sys import stdin
    class B ( ) :
        def __init__ ( self ) :
            self.B = B
        def A ( self ) :
            with stdin.open ( 'a' ) as sc :
                s1 = sc.read ( )
                s2 = sc.read ( )
                for i in range ( 3 ) :
                    if s1 [ i ] != s2 [ 2 - i ] :
                        print ( 'NO' )
                        return
            print ( 'YES' )
        def binsearch_n2 ( self , left , right , N ) :
            if left >= right :
                return long ( pow ( right , N ) )
            mid = ( left + right ) // 2
            if pow ( mid , N ) > N :
                return binsearch_n2 ( self , left , mid - 1 , N )
            else :
                if pow ( mid + 1 , N ) > N :
                    return long ( pow ( mid , N ) )
                else :
                    return binsearch_n2 ( self , mid + 1 , right , N )
    def B ( self ) :
        with stdin.open ( 'a' ) as sc :
            N = sc.read ( )
        print ( binsearch_n2 ( 0 , N , N ) )
