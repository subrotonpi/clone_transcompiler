def _import ( ) :
    import math
    import math
    class C ( object ) :
        def __init__ ( self ) :
            self.a = [ ]
        def find ( self , k , x ) :
            low = 1
            up = k
            while low < up :
                mid = ( low + up ) / 2
                if self.a [ mid ] <= x :
                    low = mid + 1
                else :
                    up = mid
            return low
        def main ( self , args ) :
            a = [ ]
            a.append ( 2 )
            a.append ( 4 )
            for i in range ( 3 , 1000000 ) :
                a.append ( find ( self , i - 1 , i ) + i )
    def case_number ( ) :
        for case in range ( case_number ) :
            a1 , a2 , b1 , b2 = map ( int , args )
            ans = 0
            for i in range ( a1 , a2 + 1 ) :
                up = b2
                low = a [ i ]
                if b1 > low :
                    low = b1
                if low > up :
                    continue
                ans = ans + ( int ( up - low + 1 ) , )
            for i in range ( b1 , b2 + 1 ) :
                up = a2
                low = a [ i ]
                if a1 > low :
                    low = a1
                if low > up :
                    continue
                ans = ans + ( int ( up - low + 1 ) , )
            print ( "Case #%d: %s" % ( cases + 1 , ans ) )
