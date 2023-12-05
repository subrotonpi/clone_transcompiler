def import import os , myreadline
import readline
class Main ( object ) :
    def __init__ ( self ) :
        sc = myreadline
        n = sc.__next__ ( )
        s = sc.__next__ ( )
        a = [ 0 ] * 4
        for i in range ( n ) :
            a [ s [ i ] - '1' ] += 1
        a.sort ( )
        print ( a [ 3 ] , a [ 0 ] )
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
        while not self.readline or not self.readline.startswith ( "\n" ) :
            try :
                self.readline ( )
            except IOError :
                pass
        return self.readline ( )
    def readline ( self ) :
        while self.readline.startswith ( "\n" ) :
            try :
                self.readline ( )
            except IOError :
                pass
        return self.readline ( )
    def readline ( self ) :
        data = ""
        try :
            data = self.readline ( )
        except IOError :
            pass
        return data
