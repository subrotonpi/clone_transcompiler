def import import *
import sys
import os
import getopt
class MyScanner ( object ) :
    def __init__ ( self ) :
        sc = MyScanner ( )
        a = sc.__next__ ( )
        b = sc.__next__ ( )
        c = sc.__next__ ( )
        print ( a == b , c , a == c )
    def l_min ( a ) :
        [ a ] = a [ 0 ]
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        [ a ] = a [ - 1 ]
        return a [ - 1 ]
class MyScanner ( object ) :
    def __init__ ( self ) :
        open ( self )
    def readline ( self ) :
        while not self.readline or not self.readline :
            try :
                del self.readline
            except :
                pass
        return open ( self.filename , 'w' )
    def readline ( self ) :
        while not self.readline or not self.readline :
            try :
                del self.readline
            except :
                pass
        return self.readline ( )
    def randint ( self ) :
        return int ( self.randint ( ) )
    def long ( self ) :
        return long ( self.long )
    def uniform ( self ) :
        return uniform ( 0.0 , 1.0 )
    def readline ( self ) :
        data = ''
        try :
            data = open ( self.filename , 'r' )
        except :
            pass
        return data
