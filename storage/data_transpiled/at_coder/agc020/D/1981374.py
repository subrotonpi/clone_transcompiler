def _import ( ) :
    import sys
    import random
    class Main ( ) :
        def pre_calc ( self ) :
            pass
        def stress ( self ) :
            pass
        def fast_val ( a , b ) :
            if a < b :
                tmp = a
                a = b
                b = tmp
            return self.ceil_div ( a , b + 1 )
        def next_string ( self ) :
            return self.next_string ( )
        def next_int ( self ) :
            return int ( self.next_int ( ) )
        def randint ( self , a ) :
            return long ( self.next_int ( ) )
        def randint ( self , a ) :
            return int ( self.next_int ( ) )
        def randint ( self , a ) :
            return long ( self.next_int ( ) )
        def uniform ( self , a ) :
            return float ( self.next_float ( ) )
    def submit_func ( self ) :
        def f ( self , a , b ) :
            while self.q > 0 :
                a = randint ( 1 , a + 1 )
                b = randint ( 1 , b + 1 )
                d = randint ( 1 , b + 1 )
                yield self.solve ( a , b , d )
        def next_combination ( self , a , n ) :
            k = len ( self.a )
            ptr = k - 1
            while ptr >= 0 and self.a [ ptr ] == self.ptr - k + n :
                ptr -= 1
            if ptr < 0 :
                return False
            self.a [ ptr ] += 1
            for i in range ( ptr + 1 , k ) :
                self.a [ ptr ] = self.a [ ptr ] + i - ptr
            return True
    def test ( self ) :
        C = 14
        for a in range ( 1 , C + 1 ) :
            for b in range ( 1 , C + 1 ) :
                s = f ( a , b )
                for j in range ( j , k ) :
                    fast , slow = solve ( a , b , j , k )
                    if fast not in slow :
                        raise AssertionError ( "%s %s %s" % ( a , b