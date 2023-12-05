def import import os , myopen
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = myopen
        a = sc.__next__ ( )
        print ( a / 10 + a % 10 )
    def l_min ( self , a ) :
        [ a ] = a
        return a [ 0 ]
    def l_max ( self , a ) :
        l = len ( a )
        [ a ] = a [ l - 1 ]
        return a [ l - 1 ]
    def write ( self , data ) :
        f = open ( self.logfile , "r" )
        f.readline ( )
        f.readline ( )
        while f.readline ( ).strip ( ) == "" or not f.readline ( ) :
            try :
                f.readline ( )
            except IOError :
                pass
        return f.readline ( )
    def randint ( self ) :
        return int ( self.sc.__next__ ( ) )
    def long ( self ) :
        return long ( self.sc.__next__ ( ) )
    def uniform ( self ) :
        return float ( self.sc.__next__ ( ) )
    def readline ( self ) :
        data = ''
        try :
            data = f.readline ( )
        except IOError :
            pass
        return data
