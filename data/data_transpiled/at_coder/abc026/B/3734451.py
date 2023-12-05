def import _lightscanner
import os
import sys
import math
import os
import math
import os
import math
import os
import math
import math
import os
import math
import os
import math
import os
import sys
import StringIO
import StringIO
import StringIO
import math
import math
import os
import sys
class Main ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.stream = stream
        self.stream = LightScanner ( self.stream )
        self.stream = StringIO ( )
        self.stream = StringIO ( )
        self.solver = BN
        self.solve ( 1 , self.stream , self.stream )
        self.stream.close ( )
class BN ( object ) :
    def solve ( self , test_number , f , out ) :
        n = self.stream.ints
        rs = f.ints [ : n ]
        rs.sort ( )
        rs.reverse ( )
        size = 0
        for i , r in enumerate ( rs ) :
            s = math.pi * r * r
            if i % 2 == 0 :
                size += s
            else :
                size -= s
        out.seek ( 0 )
    def reverse ( self , a , left , right ) :
        while left < right :
            temp = a [ left ]
            a [ left ] = a [ right ]
            a [ right ] = temp
            left += 1
            right -= 1
    class LightScanner ( object ) :
        def __init__ ( self , stream = None ) :
            self.stream = stream
            self.stream = stream
            self.tokenizer = None
        def string ( self ) :
            if not stream or not self.stream.readline ( ) :
                try :
                    self.stream = stream.readline ( )
                except EOFError :
                    pass
            return self.stream.readline ( )
        def ints ( self ) :
            return [ int ( self.stream.read ( ) ) for self in self.stream ]
        def string ( self ) :
            return "%s %s" % ( self.stream.read ( ) , self.stream.read ( ) )
    return Main
