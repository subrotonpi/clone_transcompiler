def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.argv [ 1 ]
    def __init__ ( self ) :
        self.s , self.m , self.h = 0 , 0 , 0
        self.s , self.m , self.h = self.s , self.m , self.s - 60 * self.m , self.m // self.h , self.m - 60 * self.h
        self.as , self.am , self.ah = "%d" % self.s , "%d" % self.m , self.h
        if self.s % 100 < 10 :
            self.as = "0" + self.s
        if self.m % 100 < 10 :
            self.am = "0" + self.m
        if self.h % 100 < 10 :
            self.ah = "0" + self.h
        print ( "%s:%s:%s" % ( self.ah , self.am , self.as ) )
