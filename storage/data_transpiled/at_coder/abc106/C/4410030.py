def import my_raw_input
import sys
import os
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        sc = my_raw_input
        s = sc.next ( )
        k = sc.next ( )
        if k == 0 :
            break
        if ans == 1 and s [ k ] != '1' :
            ans = s [ k ] - '0'
        k -= 1
    print ( ans )
    def l_min ( a ) :
        a.sort ( )
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        a.sort ( )
        return a [ l - 1 ]
class MyScanner ( object ) :
    def __init__ ( self ) :
        self.stream = sys.stdin
    def readline ( self ) :
        while not self.stream or not self.stream :
            try :
                self.stream = open ( self.stream , 'r' )
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
            data = self.stream.readline ( )
        except IOError :
            pass
        return data
