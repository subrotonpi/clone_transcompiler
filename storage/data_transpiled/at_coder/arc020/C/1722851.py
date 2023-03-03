def _import ( ) :
    from time import sleep
    from os import getpid
    from os import urandom
    from os import urandom
    from time import sleep
    class Main ( object ) :
        def __init__ ( self , a , l , b ) :
            super ( Main , self ).__init__ ( None , '' , os.urandom )
            self.a = a
            self.l = b
            self.b = b
            self.solve ( n , a , l )
        def __repr__ ( self ) :
            print ( repr ( self ) )
    class V ( object ) :
        def __init__ ( self , a_len_ , mod_ ) :
            self.a_len_ = a_len_
            self.k = 1
            self.mod = mod_
            self.v = 1
        def merge ( self , o ) :
            self.v = o.v
        def merge ( self , o ) :
            ret = V ( )
            ret.mod = self.mod
            ret.a_len = self.a_len
            ret.k = self.k + o.k
            ret.v = ( v + o.v * pow ( 10 , self.a_len * k , mod ) % mod ) % mod
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
            self.a_len = a_len
            res = V ( )
            res.a_len = a_len
            res.k = 0
            res.mod = self.b
            res.v = 0
            p = V ( )
            for _ in range ( n ) :
                if l % 2 == 1 :
                    res = res.merge ( p )
            return res
        def solve ( self , n , a , l , b ) :
            ret = 0
            for _ in range ( n ) :
                ret = ret * pow ( 10 , self.a_len * l [ _ ] , b ) % b