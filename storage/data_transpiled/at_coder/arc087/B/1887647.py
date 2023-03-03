def _import ( ) : return sys.stdin.read ( 2048 )
import io
import sys
import os
import sys
class Main ( ) :
    def __init__ ( self ) :
        self.s = next ( )
        self.N = len ( self.s )
        self.x = randint ( 0 , len ( self.s ) )
        self.y = randint ( 0 , len ( self.s ) )
        self.vx = [ ]
        self.vy = [ ]
        self.count_f = 0
        self.count_t = 0
        for ch in self.s :
            if ch == 'F' :
                self.count_f += 1
            else :
                if self.count_t % 2 == 0 :
                    self.vx.append ( self.count_f )
                else :
                    self.vy.append ( self.count_f )
                self.count_t += 1
                self.count_f = 0
        if self.count_f > 0 :
            if self.count_t % 2 == 0 :
                self.vx.append ( self.count_f )
            else :
                self.vy.append ( self.count_f )
        self.xdp = [ False ] * ( self.len ( ) + 1 )
        self.ydp = [ False ] * ( self.len ( ) + 1 )
        add = 0
        if self.s [ 0 ] == 'T' :
            self.xdp [ 0 ] [ 8000 ] = True
        else :
            self.xdp [ 1 ] [ 8000 + self.vx [ 0 ] ] = True
            add += 1
        for i in range ( 0 + add ) :
            for j in range ( 8000 * 2 + 1 ) :
                if not self.ydp [ i ] [ j ] : continue
                if self.ydp [ i + 1 ] [ j - self.vx [ i ] ] |= self.ydp [ i ] [ j ]
                if self.ydp [ i + 1 ] [ j ] < self.ydp [ i + 1 ] [ j ] :
                    self.ydp [ i + 1 ] [ j ] |= self.ydp [ i ] [ j ]
