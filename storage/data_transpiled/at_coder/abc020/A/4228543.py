def import import os , myreadline
import readline
class Main ( object ) :
    def __init__ ( self ) :
        sc = myreadline
        a = sc.__next__ ( )
        print ( a == 1 and 'ABC' or 'chokudai' )
    def l_min ( a ) :
        a.sort ( )
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        a.sort ( )
        return a [ l - 1 ]
    def write ( self , data ) :
        f = open ( self.data , 'r' )
        f.readline ( )
        while not f or not f.readline ( ) :
            try :
                f.readline ( )
            except IOError :
                pass
        return f.readline ( )
    def randint ( self ) :
        return int ( self.data )
    def long ( self ) :
        return long ( self.data )
    def uniform ( self ) :
        return float ( self.data )
    def readline ( self ) :
        data = ''
        try :
            data = f.readline ( )
        except IOError :
            pass
        return data
