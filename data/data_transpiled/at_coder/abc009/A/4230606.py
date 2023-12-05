def import import sys , os , sys
from os import urandom
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = MyScanner ( )
        a = sc.__next__ ( )
        print ( ( a - 1 ) / 2 + 1 )
    def l_min ( self , a ) :
        [ a ] = a
        return a [ 0 ]
    def l_max ( self , a ) :
        l = len ( a )
        [ a ] = a [ l - 1 ]
        return a [ l - 1 ]
    def write ( self , data ) :
        self.out.write ( data )
    def readline ( ) :
        while not data or not data :
            try :
                data = open ( self.out , "r" ).readline ( )
            except IOError :
                pass
        return data
    def randint ( self ) :
        return int ( self.out.read ( ) )
    def long ( self ) :
        return long ( self.out.read ( ) )
    def uniform ( self ) :
        return float ( self.out.read ( ) )
    def readline ( ) :
        data = ''
        try :
            data = open ( self.out , "r" ).readline ( )
        except IOError :
            pass
        return data
