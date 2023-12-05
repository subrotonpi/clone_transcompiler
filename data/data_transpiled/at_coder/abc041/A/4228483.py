def import myScanner
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = myScanner ( )
        s = sc.next ( )
        i = sc.__next__ ( )
        print ( s [ i - 1 ] )
    def l_min ( a ) :
        a.sort ( )
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        a.sort ( )
        return a [ l - 1 ]
    def write ( self , s ) :
        f = open ( s )
        f.readline ( )
        while not f or not f.readline ( ) :
            try :
                f.readline ( )
            except IOError :
                pass
        return f.readline ( )
    def randint ( ) :
        return int ( f.readline ( ) )
    def long ( ) :
        return long ( f.readline ( ) )
    def uniform ( ) :
        return float ( f.readline ( ) )
    def readline ( ) :
        data = ''
        try :
            data = f.readline ( )
        except IOError :
            pass
        return data
