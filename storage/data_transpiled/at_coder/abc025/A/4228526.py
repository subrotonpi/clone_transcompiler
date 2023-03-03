def import myScanner
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = myScanner ( )
        s = sc.next ( )
        a = sc.__next__ ( )
        if a == 0 :
            s1 = str ( s [ int ( a - 1 ) / 5 ] )
            s2 = str ( s [ ( a - 1 ) % 5 ] )
            print ( s1 + s2 )
        else :
            s1 = s [ int ( a ) ]
            s2 = s [ int ( a ) ]
            print ( s1 + s2 )
    def l_min ( a ) :
        a.sort ( )
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        a.sort ( )
        return a [ l - 1 ]
    def write ( self , s ) :
        self.write ( s )
    def readline ( self ) :
        while not s or not s :
            try :
                s = s.readline ( )
            except EOFError :
                pass
        return s
    def randint ( self ) :
        return int ( self.read ( ) )
    def long ( self ) :
        return long ( self.read ( ) )
    def uniform ( self ) :
        return float ( self.read ( ) )
    def readline ( self ) :
        data = ''
        try :
            data = self.readline ( )
        except EOFError :
            pass
        return data
