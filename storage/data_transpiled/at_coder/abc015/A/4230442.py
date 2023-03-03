def import import *
import sys
import string
import getopt
class MyScanner ( object ) :
    def __init__ ( self ) :
        sc = MyScanner ( )
        s = sc.next ( )
        s1 = sc.next ( )
        a = s [ 0 ]
        b = s1 [ 0 ]
        print ( s if a > b else s1 )
    def l_min ( a ) :
        a.sort ( )
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        a.sort ( )
        return a [ l - 1 ]
class MyScanner ( object ) :
    def __init__ ( self ) :
        self.stream = open ( "/dev/null" )
    def readline ( self ) :
        while not self.stream or not self.stream :
            try :
                self.stream = open ( "/dev/null" )
            except IOError :
                pass
        return self.stream.readline ( )
    def randint ( self ) :
        return int ( self.stream.read ( ) )
    def long ( self ) :
        return long ( self.stream.read ( ) )
    def uniform ( self ) :
        return float ( self.stream.read ( ) )
    def readline ( self ) :
        data = ''
        try :
            data = open ( "/dev/null" )
        except IOError :
            pass
        return data
