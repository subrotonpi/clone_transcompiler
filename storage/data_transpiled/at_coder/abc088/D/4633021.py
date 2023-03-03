def import _jud
import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.h = 0
        self.w = 0
        self.map = [ ]
        black = 0
        for s in sys.stdin :
            for i in range ( w ) :
                self.map [ i ] [ i ] = s
                if self.map [ i ] [ i ] == '#' :
                    black += 1
        qux = [ ]
        quy = [ ]
        qux.append ( 0 )
        quy.append ( 0 )
        dx = [ 1 , 0 , 0 , - 1 ]
        dy = [ 0 , 1 , - 1 , 0 ]
        ans = [ ]
        map [ 0 ] = '#'
        while not qux.empty ( ) :
            x = qux.pop ( )
            y = quy.pop ( )
            for i in range ( 4 ) :
                if jud ( x + dx [ i ] , y + dy [ i ] ) :
                    qux.append ( x + dx [ i ] )
                    quy.append ( y + dy [ i ] )
                    map [ y + dy [ i ] ] [ x + dx [ i ] ] = '#'
                    ans.append ( ans [ y ] [ x ] + 1 )
        if ans [ h - 1 ] [ w - 1 ] == 0 :
            print ( - 1 )
        else :
            print ( h * w - black - ans [ h - 1 ] [ w - 1 ] - 1 )
    def jud ( self , x , y ) :
        return x >= 0 and x < w and y >= 0 and y < h and self.map [ y ] [ x ] != '#'
