def _import ( ) : return
import sys
import os
import os
import sys
import os
import sys
import D
import os
import os
import sys
import os
import os
import sys
import os
import pickle
import pickle
import pickle
import pickle
import pickle
class Area :
    def __init__ ( self , obj ) :
        self.x1 = obj
        self.y1 = obj.y1
        self.x2 = obj.x2
        self.y2 = obj.y2
    def contains ( self , x ) :
        return self.x1 < x < x2 and self.y1 < y
    def __eq__ ( self , o ) :
        if not isinstance ( o , type ) : return False
        area = o
        return self.x1 == area.x1 and self.y1 == area.y1 and self.x2 == area.y2
    def __hash__ ( self ) :
        return hash ( self.x1 , self.y1 , self.x2 , self.y2 )
    def __str__ ( self ) :
        return '(%d,%d),(%d,%d)' % ( self.x1 , self.y1 , self.x2 , self.y2 )
class D :
    def __init__ ( self , test_number , stdin , stdout ) :
        self.w = test_number
        self.h = test_number
        self.n = test_number
        self.x = [ ]
        self.y = [ ]
        self.dp = { }
        def solve ( self , test_number , stdin , stdout ) :
            self.w = test_number
            self.h = test_number
            self.n = test_number
            self.x = [ ]
            self.y = [ ]
            return self.dfs ( [ 0 , 0 , w + 1 , h + 1 ] )
        def dfs ( self , area ) :
            if area in self.dp :
                return self.dp [ area ]
            contains_machine = False
            max = 0
            for i in range ( self.n ) :
                if not area in self.x :
                    continue
                contains_machine = True
                g = 0
                if 0 < x [ i ] < y [ i ] :
                    g += dfs ( [ area.x1 , area.y1 , x [ i ] , y [ i ] ] )
                