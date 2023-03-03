def import import sys , os , sys
from os import urandom
class MyScanner ( Scanner ) :
    def __init__ ( self ) :
        sc = MyScanner ( )
        a = sc.__next__ ( )
        print ( 'SAME' if a % 1111 == 0 else 'DIFFERENT' )
    def l_min ( a ) :
        a.sort ( )
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        a.sort ( )
        return a [ l - 1 ]
    def write ( self , data ) :
        f = open ( self.filename , 'r' )
        f.readline ( )
        while not f or not f.readline ( ) :
            try :
                f.readline ( )
            except IOError :
                pass
        return f.readline ( )
    def randint ( self ) :
        return int ( self.randint ( 0 , 1 ) )
    def long ( self ) :
        return long ( self.randint ( 0 , 1 ) )
    def uniform ( self ) :
        return float ( self.uniform ( 0 , 1 ) )
    def readline ( self ) :
        data = ''
        try :
            data = f.readline ( )
        except IOError :
            pass
        return data
return my_Scanner
