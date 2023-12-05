def import import os , myopen
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = myopen
        a = myopen ( )
        b = myopen ( )
        x = myopen ( )
        A = 0 if a == 0 else ( a - 1 ) / x + 1
        B = b / x + 1
        print ( B - A )
    def l_min ( a ) :
        a.sort ( )
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        a.sort ( )
        return a [ l - 1 ]
    def write ( self , data ) :
        self.out = data
class MyScanner ( Scanner ) :
    def __init__ ( self ) :
        Scanner.__init__ ( self )
        self.Scanner.__init__ ( self )
        self.Scanner.__init__ ( self )
    def next ( self ) :
        while not self.Scanner.next ( ) or not self.Scanner.next ( ) :
            try :
                self.Scanner.next ( )
            except StopIteration :
                pass
        return self.Scanner.next ( )
    def randint ( self ) :
        return int ( self.Scanner.next ( ) )
    def long ( self ) :
        return long ( self.Scanner.next ( ) )
    def double ( self ) :
        return double ( self.Scanner.next ( ) )
    def readline ( self ) :
        data = ''
        try :
            data = self.Scanner.readline ( )
        except StopIteration :
            pass
        return data
return Main
