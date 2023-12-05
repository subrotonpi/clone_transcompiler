def import myopen
import readline
import readline
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = readline ( )
        self.b = readline ( )
        self.c = readline ( )
        self.ans = 0
        g = [ - 1 ] + [ readline ( ) ]
        if b <= g [ 0 ] <= c :
            self.ans += 1
        for i in range ( 1 , a ) :
            g [ i ] = g [ i - 1 ] + readline ( )
            if b <= g [ i ] <= c :
                self.ans += 1
        print ( self.ans )
    def l_min ( self ) :
        self.a = [ ]
        return self.a [ 0 ]
    def l_max ( self ) :
        l = len ( self.a )
        self.a = [ ]
        return self.a [ l - 1 ]
class Myopen ( open ) :
    def readline ( self ) :
        f = open ( self.filename , 'r' )
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
