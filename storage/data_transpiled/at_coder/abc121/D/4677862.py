def import import scanner , f , args
from os import urandom
from random import random
class Main ( object ) :
    def __init__ ( self ) :
        self.scanner = scanner
        self.a , b = scan ( args )
        check = False
        if a == 0 :
            a += 1
            check = True
        ans = f ( b ) ^ f ( a - 1 )
        if check :
            ans ^= 0
        print ( ans )
    def f ( a ) :
        res = [ a , 1 , a + 1 , 0 ]
        return res [ int ( a % 4L ) ]
class f ( int ) :
    def __init__ ( self , f ) :
        self.scanner = scanner
    def readline ( ) :
        while not readline ( ) or not readline ( ) :
            try :
                readline ( )
            except EOFError :
                pass
        return readline ( )
    def randint ( self ) :
        return int ( self.scanner.randint ( 0 , 1 ) )
    def long ( self ) :
        return long ( self.scanner.randint ( 0 , 1 ) )
    def uniform ( self ) :
        return float ( self.scanner.uniform ( 0 , 1 ) )
    def readline ( ) :
        data = ''
        try :
            data = open ( '/dev/null' , 'r' ).read ( )
        except IOError :
            pass
        return data
return f
