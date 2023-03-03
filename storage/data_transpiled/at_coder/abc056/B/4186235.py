def import import os , myopen
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = myopen
        self.w = self.sc.w
        self.a = myopen
        self.b = myopen
        if abs ( b - self.a ) < self.w :
            ans = 0
        else :
            ans = abs ( a - self.b ) - self.w
        print ( ans )
    def l_min ( self , a ) :
        self.a = a
        return self.a [ 0 ]
    def l_max ( self , a ) :
        l = len ( a )
        self.a = a [ l - 1 ]
        return self.a [ l - 1 ]
class MyFile ( sys.stdin ) :
    def readline ( self ) :
        f = open ( self.stdin )
        f.readline ( )
        f.readline ( )
        while f.readline ( ) is None or not f.readline ( ) :
            try :
                f.readline ( )
            except IOError :
                pass
        return f.readline ( )
    def randint ( self ) :
        return int ( self.a )
    def long ( self ) :
        return long ( self.a )
    def double ( self ) :
        return float ( self.a )
    def readline ( self ) :
        data = ''
        try :
            data = f.readline ( )
        except IOError :
            pass
        return data
return Main
