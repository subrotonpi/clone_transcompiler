def _import ( ) : return int ( readword ( ) )
import time
import sys
import os
import sys
import os
import sys
import os
import locale
import locale
import locale
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.problem = 'C'
        self.filename = '%s-large' % self.problem
        self.N = len ( self.readword ( ) )
        self.dread = float ( self.readword ( ) )
        self.lread = long ( self.readword ( ) )
    def rec ( self , left , right ) :
        if self.left == right : return
        l = left
        for x in range ( left , right ) :
            if self.best [ x ] == self.lread :
                self.rec ( l , x )
                self.l = x + 1
            elif self.best [ x ] > self.lread :
                self.flag = False
        for x in range ( self.left , self.right ) :
            self.h [ x ] = self.lread - ( self.right - x + 1 )
    def solve ( self ) :
        N = self.iread ( )
        best = [ self.iread ( ) - 1 for i in range ( N ) ]
        h = [ self.dread - 1 for i in range ( N ) ]
        self.flag = True
        self.rec ( 0 , N - 1 )
        if not self.flag :
            self.out.write ( 'Impossible\n' )
            return
        for i in range ( 0 , N ) :
            b = i + 1
            for j in range ( i + 2 , N ) :
                if ( self.h [ j ] - self.h [ i ] ) * long ( b - i ) > ( self.h [ b ] - self.h [ i ] ) * long ( j - i ) :
                    b = j
            if b != best [ i ] :
                print ( 'FAIL' )
        min = 0
        for i in range ( N ) :
            min = min + min
        for i in range ( N ) :
            if i > 0 :
                print ( ' Case SPACETOKEN