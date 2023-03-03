def _import ( ) : return _sys.stdin
import readline
import readline
import os
import collections
import collections
import collections
import collections
import collections
import set
class Main ( ) :
    _int_max = int
    _int_min = int
    _long_max = long
    _long_min = long
    def solve ( ) :
        c = Counter ( )
        n = read_num ( )
        ia = read_nums ( )
        for i in ia :
            c.append ( i )
        ans = 0
        for o in c.keys ( ) :
            key = getattr ( c , o )
            cnt = c [ o ]
            if key > cnt :
                ans += cnt
            elif key < cnt :
                ans += cnt - key
        pln ( ans )
    class Counter ( object ) :
        def add ( self , o ) :
            v = self.__dict__ [ o ]
            if not v :
                self.__dict__ [ o ] = 1
            else :
                self.__dict__ [ o ] = v + 1
        def get ( self ) :
            v = self.__dict__ [ o ]
            if not v :
                return 0
            else :
                return v
        def keys ( self ) :
            return self.__dict__.keys ( )
    def abs ( a ) :
        return ( a >= 0 ) and ( a <= - a )
    def abs ( a ) :
        return ( a >= 0 ) and ( a <= - a )
    def max ( a , b ) :
        return ( a > b ) and ( a <= b )
    def min ( a , b ) :
        return ( a < b ) and ( a < b )
    def pint ( s ) :
        return int ( s )
    def plong ( s ) :
        return long ( s )
    readline = open ( "/dev/tty" , "r" )
    try :
        return Main ( )
    finally :
        readline.close ( )
