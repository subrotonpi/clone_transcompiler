def _import ( ) : return _import ( )
import sys
import os
import sys
import tokenize
class Main ( object ) :
    def __init__ ( self , x ) :
        self.N = len ( x )
    def __init__ ( self , x ) :
        fc = FastScanner ( sys.stdin )
        self.N = fc.__next__ ( )
        self.C = [ ]
        for i in range ( self.N ) :
            self.C.append ( ( i , fc.__next__ ( ) , fc.__next__ ( ) ) )
    def __next__ ( self ) :
        self.i , self.h = self.i , self.h
    @ tokenize
    def __next__ ( self ) :
        if self.r is None or not self.h :
            try :
                return next ( self.r )
            except StopIteration :
                raise StopIteration
        return next ( self.h )
    def solve ( self ) :
        self.C = [ ]
        for c in self.C :
            win_r = lower_bound ( C , lambda c1 : cmp ( c.r , c1.r ) )
            lose_r = N - upper_bound ( C , lambda c1 : cmp ( c.r , c1.r ) )
            if c.h == 1 :
                win_g = count ( C , lambda c1 : cmp ( c1.r , c1.r ) )
            elif c.h == 2 :
                win_g = count ( C , lambda c1 : cmp ( c1.r , c1.r ) )
                lose_g = count ( C , lambda c1 : cmp ( c1.r , c1.r ) )
            else :
                win_g = count ( C , lambda c1 : cmp ( c1.r , c1.r ) )
                lose_g = count ( C , lambda c1 : cmp ( c1.r , c1.r ) )
        return ans
