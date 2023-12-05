def import myScanner
import sys
import string
import random
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = myScanner ( )
        s = sc.next ( )
        l = len ( s )
        st = l - 1
        en = 0
        for i in range ( l ) :
            if s [ i ] == 'A' :
                st = min ( i , st )
            if s [ i ] == 'Z' :
                en = max ( i , en )
        print ( en - st + 1 )
    def l_min ( a ) :
        a.sort ( )
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        a.sort ( )
        return a [ l - 1 ]
    def write ( self , data ) :
        self.write ( data )
    def readline ( self ) :
        while not self.readline or not self.readline.strip ( ) :
            try :
                self.readline ( )
            except IOError :
                pass
        return self.readline ( )
    def randint ( self ) :
        return int ( self.read ( ) )
    def long ( self ) :
        return long ( self.read ( ) )
    def double ( self ) :
        return double ( self.read ( ) )
    def readline ( self ) :
        data = ''
        try :
            data = self.readline ( )
        except IOError :
            pass
        return data
