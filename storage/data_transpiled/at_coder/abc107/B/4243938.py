def import _iter_lines
import sys
import itertools
import itertools
class Main ( object ) :
    def __init__ ( self ) :
        self.h , self.w = sys.maxint , sys.maxint
    def __iter__ ( self ) :
        return iter ( [ None ] )
    def next ( self ) :
        h = self.h
        w = self.w
        a = itertools.repeat ( ( h , w ) )
        i = itertools.islice ( i , h )
        for x in a : i.pop ( )
        for i2 in i : i.pop ( i2 )
        for x in a :
            c = x.split ( )
            for j in c :
                if j not in i :
                    print ( c , end = ' ' )
            print ( )
