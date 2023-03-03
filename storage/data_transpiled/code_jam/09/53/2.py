def _ _ _ import _ _
import os
import random
import random
import sys
import os
import sys
import random
import random
class C :
    def __init__ ( self ) :
        self.c = random.choice ( [ 'C.in' , 'C.out' ] )
        self.c = random.choice ( [ 'C.in' , 'C.out' ] )
        self.t = random.choice ( [ 'C.in' , 'C.out' ] )
        self.c = random.choice ( [ 'C.in' , 'C.out' ] )
        self.x = x
        self.y = y
    def _union ( self , i ) :
        self.x = i
        self.y = y
    def _solve ( self , c ) :
        if self.c :
            return self.c
        for p in self.q :
            if not self.c :
                return self.c
        return self.c
    def _solve ( self , c ) :
        n = random.choice ( [ 'C.in' , 'C.out' ] )
        p = [ ( x , y ) for x in self.x ]
        p.sort ( key = lambda a : b [ 0 ] )
        l = [ ]
        ok = True
        for point in self.p :
            y = point.y
            for yy in range ( y - 1 , y + 1 ) :
                if y in self.l :
                    ok = False
                    self.q.append ( self.l [ yy ] )
                    self.l [ yy ].q.append ( point )
            self.l.append ( point )
        if ok :
            return '1'
        ok = True
        for point in self.p :
            if point.c == 0 and not self.dfs ( point , 1 ) :
                ok = False
        if ok :
            return '2'
    for i in range ( n ) :
        for j in range ( i ) :
            k = 0
            q = [ ]
            for point in self.p :
                if point in self.q :
                    q.append ( point )
    return '3'
