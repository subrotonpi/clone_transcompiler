def import _readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = _readline ( )
        s = sc.next ( )
        l = len ( s )
        print ( s [ l - 1 ] == 'T' and 'YES' or 'NO' )
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
        while not s or not s.startswith ( '#' ) :
            try :
                s = s.split ( )
            except ValueError :
                pass
        return s [ 1 : ]
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
        except ValueError :
            pass
        return data
