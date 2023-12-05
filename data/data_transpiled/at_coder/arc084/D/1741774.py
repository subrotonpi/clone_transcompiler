def _import ( ) :
    import sys
    import random
    class Main ( object ) :
        def __init__ ( self , coef , lead ) :
            self.coef = coef
            self.lead = lead
        def trim ( self ) :
            while self.lead >= 0 and self.coef [ self.lead ] == 0 :
                self.lead -= 1
        def get_poly ( self ) :
            s = self.__next__ ( )
            coef = [ ]
            for i in range ( len ( s ) ) :
                coef.append ( s [ - 1 - i ] - '0' )
            return tuple ( coef )
        def __next__ ( self ) :
            try :
                return self.__next__ ( )
            except StopIteration :
                raise StopIteration
        def __next__ ( self ) :
            try :
                return self.__next__ ( )
            except StopIteration :
                raise StopIteration
        def __next__ ( self ) :
            return int ( self.__next__ ( ) )
        def __next__ ( self ) :
            return int ( self.__next__ ( ) )
        def __next__ ( self ) :
            return float ( self.__next__ ( ) )
        def divide_leading ( self , a , b ) :
            for i in range ( 0 , b.lead ) :
                a.coef [ i + a.lead - b.lead ] ^= b.coef [ i ]
            a.strip ( )
        def gcd ( self , a , b ) :
            if a.lead < b.lead :
                tmp = a
                a = b
                b = tmp
            if b.lead == - 1 :
                return a
            divide_leading ( self , b )
            return gcd ( b , a )
    P = 998244353
    def submit ( self ) :
        n = randint ( 0 , len ( self.__next__ ( ) ) )
        x = get_poly ( )
        g = next ( self.__next__ ( ) )
        for i in range ( 1 , n ) :
            p = next ( self.__next__ ( ) )
            g = gcd ( g , p )
        gcd = [ g [ i ] for i in range ( len ( self.__next__ ( ) ) ) ]
        our = [ x for