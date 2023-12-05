def import import sys , os , sys
from os import urandom
from io import BytesIO
import readline
class MyScanner ( Scanner ) :
    def __init__ ( self ) :
        sc = MyScanner ( )
        a = sc.__next__ ( )
        b = sc.__next__ ( )
        c = sc.__next__ ( )
        while c % a != 0 or c % b != 0 :
            c += 1
        print ( c )
    def l_min ( a ) :
        a.sort ( )
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        a.sort ( )
        return a [ l - 1 ]
    def write ( self , data ) :
        f = open ( self.data , "w" )
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
            data = f.readline ( )
        except IOError :
            pass
        return data
