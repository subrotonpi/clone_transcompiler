def import import sys , os , sys
from os import urandom
from io import BytesIO
import readline
class MyScanner ( Scanner ) :
    def __init__ ( self ) :
        sc = MyScanner ( )
        a = sc.__next__ ( )
        b = sc.__next__ ( )
        print ( a >= b )
    def l_min ( a ) :
        [ a ] = a
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        [ a ] = a [ - 1 ]
        return a [ l - 1 ]
    def write ( self , data ) :
        f = open ( "/dev/null" , "w" )
        f.readline ( )
        while not f or not f.readline ( ) :
            try :
                f.readline ( )
            except IOError :
                pass
        return f.readline ( )
    def randint ( self ) :
        return int ( self.__next__ ( ) )
    def long ( self ) :
        return long ( self.__next__ ( ) )
    def uniform ( self ) :
        return float ( self.__next__ ( ) )
    def readline ( self ) :
        data = ''
        try :
            data = open ( "/dev/null" , "r" ).readline ( )
        except IOError :
            pass
        return data
