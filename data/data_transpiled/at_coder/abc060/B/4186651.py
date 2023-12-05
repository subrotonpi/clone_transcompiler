def import my_raw_input
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = raw_input
    def __init__ ( self ) :
        self.raw_input = raw_input
    def my_raw_input ( self ) :
        a = my_raw_input ( )
        b = my_raw_input ( )
        c = my_raw_input ( )
        a = a % b
        ans = 'NO'
        for i in range ( 1 , b + 1 ) :
            if a * i % b == c :
                ans = 'YES'
        print ( ans )
    def l_min ( a ) :
        a.sort ( )
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        a.sort ( )
        return a [ l - 1 ]
    def my_open ( self ) :
        f = open ( self.input )
        while not f or not f.readline ( ) :
            try :
                f.readline ( )
            except IOError :
                pass
        return f.readline ( )
    def __next__ ( self ) :
        while not f or not f.readline ( ) :
            try :
                f.readline ( )
            except IOError :
                pass
        return f.readline ( )
    def __next__ ( self ) :
        return int ( __next__ )
    def __next__ ( self ) :
        return long ( __next__ )
    def __next__ ( self ) :
        return float ( __next__ )
    def __next__ ( self ) :
        return next ( self )
return Main
