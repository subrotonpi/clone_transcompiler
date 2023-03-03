def import import sys , StringIO , recwarn , recwarn , importorskip , wrap , formatters , usegil , fastparse , load , strip , space , ** kwargs ) :
    from io import StringIO
    from random import randint
    from itertools import chain , repeat
    class Main ( object ) :
        def __init__ ( self ) :
            from collections import deque
            from twisted.python.util import solecmp
            from twisted.internet import reactor
            from twisted.python.util import solecmp
            from twisted.python.reflect import _makeLoader
            from twisted.python.util import _makeLoader
            from twisted.python.util import _makeLoader
            from twisted.python.util import _makeLoader
            from twisted.python.util import _makeLoader
            from twisted.python.util import _makeLoader
            from twisted.python.util import _makeLoader
            from twisted.python.util import _makeLoader
            from twisted.python.util import _makeLoader
            from twisted.python.compat import sys
            def load ( self ) :
                sc = solecmp.PyScanner ( sys.stdin , usegil = False )
                n = sc.docref ( )
                as = [ ]
                for i in range ( n ) :
                    as.append ( sc.__next__ ( ) )
                self.solve ( )
            def solve ( self ) :
                counts = [ i for i in range ( n ) if as [ i ] < as [ j ] ]
                for j in range ( n ) :
                    if as [ i ] < as [ j ] :
                        break
                    if as [ i ] % as [ j ] == 0 :
                        counts [ i ] += 1
            ans = 0
            for i in range ( n ) :
                if counts [ i ] % 2 == 0 :
                    ans += 1.0 / 2
                else :
                    ans += ( ( float ( counts [ i ] ) - 1 ) / 2 + 1 ) / counts [ i ]
            print ( ans )
    class DictReader ( object ) :
        def __init__ ( self ) :
            self.iter = iter ( sys.stdin )
        def readline ( self ) :
            if not wrap or self.__next__ :
                self.next = __next__
            return self
    return dict ( )
