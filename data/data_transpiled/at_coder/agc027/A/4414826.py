def import _scanner
import sys
import os
class Main ( object ) :
    class FastScanner ( Scanner ) :
        def __init__ ( self , x ) :
            try :
                f = open ( self.filename , 'r' )
            except :
                pass
            else :
                ans = - 1
                for i in range ( n ) :
                    if a [ i ] <= x :
                        ans = i
                else :
                    break
            self.write ( ans if ans < x else ans + 1 )
        def next ( self ) :
            if self.next ( ) : return self.next ( )
            try :
                self.next ( )
            except :
                pass
            return self.next ( )
    def __next__ ( self ) :
        return int ( next ( ) )
    def __next__ ( self ) :
        return long ( next ( ) )
    def nextDouble ( self ) :
        return float ( next ( ) )
    def readline ( self ) :
        line = ''
        if self.next ( ) :
            line = self.next ( )
        else :
            try :
                return self.next ( )
            except StopIteration :
                pass
            while self.next ( ) :
                line += ' ' + self.next ( )
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
            return find ( self.root [ x ] )
    def unite ( self , x , y ) :
        x = self.find ( x )
        y = self.find ( y )
        if x == y :
            return x
        if self.rank [ x ] < self.rank [ y ] :
            self.rank [ x ] += 1
        else :
            self.rank [ x ] = x
            if self.rank [ x ] == self.rank [ y ] :
                self.rank [ x ] +=