def import import os , myopen
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = myopen
        a = sc.read ( )
        print ( a )
        for i in a :
            print ( '1' )
    def l_min ( a ) :
        a.sort ( )
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        a.sort ( )
        return a [ l - 1 ]
    def write ( self , data ) :
        self.out = data
    def readline ( self ) :
        while not self.out or not self.out :
            try :
                self.out = open ( self.out , "r" )
            except IOError :
                pass
        return self.out
    def randint ( self ) :
        return int ( self.out )
    def long ( self ) :
        return long ( self.out )
    def uniform ( self ) :
        return float ( self.out )
    def readline ( self ) :
        data = ''
        try :
            data = open ( self.out , "r" ).readline ( )
        except IOError :
            pass
        return data
