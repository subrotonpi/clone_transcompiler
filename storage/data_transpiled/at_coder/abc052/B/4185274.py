def import my_open
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = my_open ( )
        k , s = sc.read ( ).split ( )
        ans = 0
        x = 0
        for i in range ( k ) :
            if s [ i ] == 'I' :
                x += 1
            else :
                x -= 1
            ans = max ( x , ans )
        print ( ans )
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
        return s [ 0 ]
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
return Main
