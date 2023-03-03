def _import ( ) : return sys.stdin.readline ( )
import readline
import readline
import time
import list
import sys
import os
import sys
import os
import re
class Main ( ) :
    def __init__ ( self , n , q ) :
        for i in range ( len ( self.parents ) - 1 ) :
            if self.parents [ i ] [ j ] < 0 :
                self.parents [ i + 1 ] [ j ] = - 1
            else :
                self.parents [ i ] [ j ] = 0
    def readline ( ) :
        while not self.lines.readline ( ) or not self.lines.readline ( ) :
            try :
                self.lines.readline ( )
            except IOError :
                pass
        return int ( self.lines.readline ( ) )
    def readline ( ) :
        return long ( self.lines.readline ( ) )
    def readline ( ) :
        try :
            return readline ( )
        except IOError :
            pass
    def readline ( ) :
        try :
            return int ( readline ( ) )
        except IOError :
            pass
    def readline ( ) :
        try :
            return int ( readline ( ) )
        except IOError :
            pass
    def readline ( ) :
        try :
            return readline ( )
        except IOError :
            pass
    def readline ( ) :
        try :
            return int ( readline ( ) )
        except IOError :
            pass
    def readline ( ) :
        return readline ( )
def init ( v , p , d ) :
    parents [ v ] = p
    depth [ v ] = d
    for i in range ( len ( parents ) ) :
        if ( ( depth [ v ] - depth [ u ] ) >> i & 1 ) :
            v = parents [ v ]
    if u == v :
        return u
    for i in range ( len ( parents ) - 1 , - 1 , - 1 ) :
        if parents [ i ] [ u ] != parents [ i ] [ v ] :
            return parents [ i ] [ v ]
init ( 0 , - 1 , 0 )
