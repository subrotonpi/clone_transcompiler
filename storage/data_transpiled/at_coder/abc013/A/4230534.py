def import myScanner
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = myScanner ( )
        s = sc.next ( )
        x = s.split ( )
        print ( x [ 0 ] - 'A' + 1 )
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
        while not self.readline or not self.readline.startswith ( '#' ) :
            try :
                self.readline ( )
            except IOError :
                pass
        return self.readline ( )
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
        except IOError :
            pass
        return data
