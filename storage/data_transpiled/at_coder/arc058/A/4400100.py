def import _main
import sys
import os
class Main ( object ) :
    class FastScanner ( Scanner ) :
        def __init__ ( self , s ) :
            Scanner.__init__ ( self )
            self.s = ''
            for i in range ( k ) :
                s += str ( sc.next ( ) )
            while not ok ( n , s ) :
                n += 1
            self.s += s
        def next ( self ) :
            if self.s : return s [ 0 ]
            try :
                self.s = s [ 1 : ]
            except :
                pass
            return s [ 0 ]
        def randint ( self ) : return int ( self.s )
        def long ( self ) : return long ( self.s )
        def uniform ( self ) : return float ( self.s )
        def readline ( self ) :
            line = ''
            if self.s : line = self.s
            else : try : return line
            while self.s : line += ' ' + self.s [ 0 ]
            return line
    class DSU ( object ) :
        def __init__ ( self , n ) :
            self.root = [ ]
            self.rank = [ ]
            for i in range ( n ) :
                self.root.append ( i )
        def find ( self , x ) :
            if self.root [ x ] == x :
                return x
            else :
                return self.find ( self.root [ x ] )
        def unite ( self , x , y ) :
            x = self.find ( x )
            y = self.find ( y )
            if x == y :
                return x
            if self.rank [ x ] < self.rank [ y ] :
                self.root [ x ] = y
            else :
                self.root [ y ] = x
                if self.rank [ x ] == self.rank [ y ] :
                    self.rank [ x ] += 1
        def same ( self , x , y ) :
            return self.find ( x ) == self.find ( y )
    def ok ( self , a , s ) :
        temp = '%d' % a
        for i in range ( len ( s )