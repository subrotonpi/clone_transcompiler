def import _main
import sys
import os
class Main ( object ) :
    def __init__ ( self ) :
        self.h , self.w , self.k = sys.argv [ 1 ] , sys.argv [ 2 ]
        self.a = [ ]
        s = sys.stdin.read ( )
        self.first = [ False for i in range ( self.h ) ]
        si , sj = 0 , 0
        for i in range ( self.h ) :
            s = s.read ( )
            for j in range ( self.w ) :
                a [ i ] [ j ] = s [ j ]
                if a [ i ] [ j ] == 'S' :
                    si = i
                    sj = j
        self.sc.close ( )
        dec ( si , sj )
        for i in range ( self.h ) :
            for j in range ( self.w ) :
                if abs ( si - i ) + abs ( sj - j ) > k :
                    first [ i ] [ j ] = False
        minscore = min ( self.h , self.w )
        for i in range ( self.h ) :
            for j in range ( self.w ) :
                if first [ i ] [ j ] :
                    cx = min ( i , self.h - 1 - i )
                    cy = min ( j , self.w - 1 - j )
                    cscore = min ( cx , cy )
                    minscore = min ( cscore , minscore )
        ans = 1
        ans += ( minscore + self.k - 1 ) / self.k
        print ( ans )
    def dec ( self , i , j ) :
        self.first [ i ] [ j ] = True
        if i > 0 and self.a [ i - 1 ] [ j ] == '.' and not first [ i - 1 ] [ j ] :
            dec ( i , j - 1 )
        if j < self.w and self.first [ i ] [ j + 1 ] == '.' and not first [ i ] [ j + 1 ] :
            dec ( i , j + 1 )
