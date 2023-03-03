def _import ( ) :
    import operator
    import sys
    class Main ( object ) :
        def __init__ ( self , * args , ** kwargs ) :
            self.a , self.b , self.c , self.d , self.e = args
            self.a += self.b + self.c
            self.a += self.b + self.c
            self.a += self.b + self.d
            self.a += self.b + self.c
            self.a += self.d
            self.a += self.c + self.d
            self.a += self.c + self.e
            self.b += self.b
            self.c += self.c + self.d
            self.b += self.c + self.e
            self.b += self.b
            self.c += self.c + self.d
            self.d += self.c + self.e
            self.a += self.b
            self.b += self.c
            self.c += self.c
            self.d += self.c
            self.e += self.e
            self.a += self.a
            self.b += self.b
            self.c += self.c
            self.d += self.c
            self.c += self.d
            self.e += self.c
            self.a += self.b
            self.c += self.c
            self.d += self.c
            self.e += self.d
            self.a += self.c
            self.b += self.c
            self.c += self.c
            self.d += self.c
            self.e += self.e
            self.a += self.b
            self.c += self.c
            self.d += self.c
            self.e += self.c
            self.a += self.c
            self.d += self.c
            self.e += self.d
            self.a += self.c
            self.c += self.c
            self.d += self.c
            self.e += self.c
            self.e += self.e
