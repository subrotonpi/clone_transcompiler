def _import ( ) : return [ int ( x ) for x in sys.stdin ]
import os
import sys
import os
import sys
import os.path as os
import string
import random
import random
import string
import random
import string
import random
import sys
import string
import random
import sys
import string
import random
import string
import random
import sys
import string
import random
import time
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N , self.K = int ( random.random ( ) )
        self.S = string
    def __next__ ( self ) :
        a = [ ]
        for i in range ( self.N ) :
            a.append ( random.randint ( 0 , a ) )
        return a
    def __next__ ( self ) :
        a = [ random.randint ( 0 , a ) for a in a ]
        return a
    def __next__ ( self ) :
        return random.randint ( 0 , a )
    def solve ( self ) :
        WLEN = N - self.K + 1
        chars = [ ]
        for i in range ( self.K ) :
            chars [ S [ i ] - 'a' ] += 1
        dict = { Word ( [ char for char in chars ] ) : MinMax ( 0 ) }
        for i in range ( 1 , WLEN ) :
            chars [ S [ i + K - 1 ] - 'a' ] += 1
            chars [ S [ i - 1 ] - 'a' ] -= 1
            w = Word ( [ char for char in chars ] )
            mm = dict.get ( w )
            if mm :
                mm.add ( i )
            else :
                dict [ w ] = MinMax ( i )
        for mm in dict.values ( ) :
            if mm.max >= mm.min + K :
                return True
        return False
    class FastScanner ( object ) :
        def __init__ ( self , f ) :
            self.f = f
        def __next__ ( self ) :
            return __next__
        def __next__ ( self ) :
            return __next__
    return Main ( )
