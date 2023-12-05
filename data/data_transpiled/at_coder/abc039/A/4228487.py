def import import os , myopen
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = myopen
        self.a = myopen ( )
        self.b = myopen ( )
        self.c = myopen ( )
        print ( 2 * ( self.a * b + self.a * c + self.b * c ) )
    def l_min ( self ) :
        self.a = [ ]
        return self.a [ 0 ]
    def l_max ( self ) :
        self.a = [ ]
        self.a = [ ]
        return self.a [ - 1 ]
    def write ( self , data ) :
        self.f = open ( data )
        self.f.readline ( )
        return data
    def readline ( self ) :
        while not self.f.readline ( ) or not self.f.readline ( ) :
            try :
                self.f.readline ( )
            except IOError :
                pass
        return self.f.readline ( )
    def readline ( self ) :
        data = ''
        try :
            data = self.f.readline ( )
        except IOError :
            pass
        return data
