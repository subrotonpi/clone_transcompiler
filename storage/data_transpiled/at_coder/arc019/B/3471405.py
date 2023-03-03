def _import ( ) : return
from StringIO import StringIO
from itertools import chain
from itertools import chain
from py2k import fastselect
from py2k import fastselect
from py2k import fastselect
class Main ( object ) :
    def __init__ ( self ) :
        self.A = sys.stdin.read ( )
        self.A = fastselect ( )
        self.print ( self.solve ( ) )
    def solve ( self ) :
        diff = self.count_diff ( )
        if diff == 0 :
            if len ( self.A ) % 2 == 0 :
                return len ( self.A ) * 25
            else :
                return ( len ( self.A ) - 1 ) * 25
        elif diff == 1 :
            return ( len ( self.A ) - 2 ) * 25 + 24 * 2
        else :
            return len ( self.A ) * 25
    def count_diff ( self ) :
        n = len ( self.A )
        diff = 0
        for i in range ( n // 2 ) :
            a = A [ i ]
            b = A [ n - i - 1 ]
            if a != b :
                diff += 1
        return diff
    @ staticmethod
    def fastselect ( ) :
        def readline ( ) :
            if not readline or not readline :
                try :
                    readline = fastselect ( )
                except EOFError :
                    pass
            return readline
        def __next__ ( self ) :
            return next ( self.A )
        def select ( ) :
            if not readline :
                try :
                    readline = fastselect ( )
                except EOFError :
                    pass
            return select
    return Main ( )
