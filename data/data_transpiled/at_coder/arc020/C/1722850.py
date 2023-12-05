def _import ( ) :
    from time import sleep
    from os import getpid
    from os import urandom
    from time import sleep
    class Main ( object ) :
        def __init__ ( self , * args ) :
            super ( Main , self ).__init__ ( * args )
            self._exit = None
        def __init__ ( self , * args ) :
            super ( Main , self ).__init__ ( * args )
        def __init__ ( self , a_len_ , mod_ ) :
            self.a_len = a_len_
            self.k = 1
            self.mod = mod_
            self.v = 1
        def merge ( self , o ) :
            self.v = o.v
        def merge ( self , o ) :
            ret = self.v
            ret.mod = self.mod
            ret.a_len = self.a_len
            ret.k = self.k + o.k
            ret.v = ( self.v + o.v * pow ( 10 , self.a_len * k , mod ) ) % mod
            return ret
        def pow ( self , a , n , mod ) :
            ret = 1
            for _ in range ( n ) :
                if n % 2 == 1 :
                    ret = ret * a % mod
            return ret
        def a_len ( a ) :
            a_len = 0
            while a > 0 :
                a //= 10
                a_len += 1
            return a_len
        def f ( self , a , l , b ) :
            self.a_len = a_len ( a )
            res = self.v
            p = self.p
            for _ in range ( l ) :
                if l % 2 == 1 :
                    res = res.merge ( p )
            return res
        def solve ( self , n , a , l , b ) :
            ret = 0
            for _ in range ( n ) :
                ret = ret * pow ( 10 , self.a_len ( a [ _ ] ) * l [ _ ] , b ) % b
                ret = ( ret + f ( a [ _ ] , l [ _ ] , b ) * a [ _ ] ) % b
            return ret
    return Main
