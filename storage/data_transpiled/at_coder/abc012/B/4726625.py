def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
    def __init__ ( self ) :
        self.N = sys.maxint
    def run ( self ) :
        res = self.N % 3600
        h = self.N // 3600
        s = self.res % 60
        m = self.res // 60
        if h <= 9 :
            print ( "0" * ( self.h + ":" ) , end = "" )
        else :
            print ( self.h , end = "" )
        if m <= 9 :
            print ( "0" * ( self.m + ":" ) , end = "" )
        else :
            print ( self.m , end = "" )
        if s <= 9 :
            print ( "0" * ( self.s + ":" ) , end = "" )
        else :
            print ( self.s )
