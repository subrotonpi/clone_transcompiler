def import import os , myopen
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = myopen
        a = sc.read ( )
        print ( a * a / 4 )
    def l_min ( self , a ) :
        [ a ] = a
        return a [ 0 ]
    def l_max ( self , a ) :
        l = len ( a )
        [ a ] = a [ l - 1 ]
        return a [ l - 1 ]
    def write ( self , data ) :
        self.out = data
    def readline ( self ) :
        while not data or not data.startswith ( "#" ) :
            try :
                data = data.split ( )
            except ValueError :
                pass
        return data
    def randint ( self ) :
        return int ( self.out )
    def long ( self ) :
        return long ( self.out )
    def uniform ( self ) :
        return float ( self.out )
    def readline ( self ) :
        data = ''
        try :
            data = readline ( self )
        except IOError :
            pass
        return data
