def import myopen
import readline
import time
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = MyScanner ( )
        x = [ ]
        x.append ( sc.__next__ ( ) )
        x.append ( sc.__next__ ( ) )
        x.sort ( )
        print ( x [ 1 ] )
    def l_min ( a ) :
        a.sort ( )
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        a.sort ( )
        return a [ l - 1 ]
    def write ( self , data ) :
        self.out = data
    def readline ( ) :
        while not data or not data :
            try :
                data = readline ( )
            except EOFError :
                pass
        return data
    def randint ( ) :
        return int ( data )
    def long ( ) :
        return long ( data )
    def uniform ( ) :
        return float ( data )
    def readline ( ) :
        data = ''
        try :
            data = readline ( )
        except EOFError :
            pass
        return data
