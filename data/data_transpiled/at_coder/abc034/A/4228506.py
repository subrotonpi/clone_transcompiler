def import import os , myopen
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = myopen
        a = myopen ( )
        b = myopen ( )
        print ( a > b and 'Worse' or 'Better' )
    def l_min ( self , a ) :
        a.sort ( )
        return a [ 0 ]
    def l_max ( self , a ) :
        l = len ( a )
        a.sort ( )
        return a [ l - 1 ]
    def write ( self , data ) :
        self.out = data
    def readline ( self ) :
        while not data or not data.readline ( ) :
            try :
                data = data.readline ( )
            except IOError :
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
            data = self.out.readline ( )
        except IOError :
            pass
        return data
