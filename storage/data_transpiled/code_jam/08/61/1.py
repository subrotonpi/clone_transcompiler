def _import ( * args ) : return _import ( * args )
import __builtin__
import __builtin__
import __builtin__
import __builtin__
import sys
import sys
import struct
import sys
from __builtin__ import integer_types as _integer_types as _integer_types
import __builtin__ as _collections as _collections
import __builtin__ as _integer_types as _integer_types
import __builtin__ as _collections as _collections
import sys
class A ( object ) :
    def __init__ ( self , * os ) :
        self.__is = [ ]
        self.__is = [ _integer_types ( x ) for x in Is ]
        self.__debug = 1 << 29
    def run ( self ) :
        with _sys :
            on = _integer ( )
            for o in range ( 1 , on + 1 ) :
                print ( "Case #%d: " % o , end = "" )
                print ( )
                n = _integer ( )
                xs , ys , ts = [ _integer_types ( x ) for x in _integer_types ( ) ]
                minx , maxx , miny , maxy = [ _integer_types ( y ) for y in _collections ]
                if ts [ 0 ] == 0 :
                    minx , maxx , miny , maxy = min ( minx , xs ) , max ( maxx , xs ) , min ( miny , ys ) , max ( maxy , ys )
                else :
                    _integer ( )
            m = _integer ( )
            while m :
                x , y = _integer ( )
                if minx <= x <= maxx and miny <= y <= maxy :
                    print ( "BIRD" )
                elif minx == _INF :
                    b = False
                    for i in range ( n ) :
                        if ts [ i ] == 1 :
                            if xs [ i ] == x and ys [ i ] == y : b = True
                    if b : print ( "NOT BIRD" )
                    else : print ( "UNKNOWN" )
                else :
                    lx , rx , ly = min ( minx , x ) , max ( maxx , x ) , min ( miny , y ) , max ( maxy , y )
                    b = True
