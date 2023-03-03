def _import ( ) : return sys.stdin.read ( )
import os
import sys
import os
import getopt
import sys
class Main ( object ) :
    def __init__ ( self , values , N ) :
        self.values = values
        self.N = N
        self.digit = [ ]
        self.exp = [ ]
        self.max = - 1
        for v in values [ 1 : ] :
            if v <= self.values [ - 1 ] :
                if not self.do_it ( v - 1 ) :
                    return False
        return True
    def do_it ( self , val ) :
        left , right = - 1 , self.max + 1
        while left + 1 < right :
            med = ( left + right ) // 2
            if self.exp [ med ] < val :
                left = med
            else :
                right = med
        if right == self.max + 1 :
            self.max += 1
            self.digit.append ( 0 )
            self.exp [ max ] = val
        if self.exp [ right ] > val :
            self.digit.append ( 0 )
            self.exp [ right ] = val
        self.max = right
        return self.increment ( )
    def do_it ( self ) :
        self.digit [ - 1 ] += 1
        if self.base == self.max :
            if self.exp [ - 1 ] == 0 :
                return False
            if self.max > 0 and self.exp [ - 1 ] == self.exp [ - 1 ] :
                self.max -= 1
                return self.increment ( )
            else :
                self.exp [ - 1 ] -= 1
                self.digit [ - 1 ] = 1
        return True
    def do_it ( self ) :
        self.digit = [ ]
        self.exp = [ ]
        self.max = self.max
        return self.increment ( )
    def do_it ( self ) :
        self.digit.append ( 0 )
        self.exp.append ( self.exp [ - 1 ] )
        return self.increment ( )
