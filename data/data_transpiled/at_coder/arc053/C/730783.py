def import _solve
import sys
import os
import sys
class Main ( object ) :
    def solve ( self ) :
        with open ( sys.argv [ 1 ] , 'r' ) as f :
            self.a = f.read ( )
            self.b = f.read ( )
    def solve ( self ) :
        with open ( sys.argv [ 1 ] , 'r' ) as f :
            self.a = f.read ( )
            self.b = f.read ( )
    def solve ( self ) :
        with open ( sys.argv [ 1 ] , 'r' ) as f :
            self.a = f.read ( )
            self.b = f.read ( )
    list_plus = [ ]
    list_minus = [ ]
    list_zero = [ ]
    for i in range ( n ) :
        a = [ i ]
        b = [ i ]
        if a [ i ] - b [ i ] < 0 : list_minus.append ( ( a [ i ] , b [ i ] ) )
        if a [ i ] - b [ i ] == 0 : list_zero.append ( ( a [ i ] , b [ i ] ) )
        if a [ i ] - b [ i ] > 0 : list_plus.append ( ( a [ i ] , b [ i ] ) )
    list_minus.sort ( key = lambda x : x [ 0 ] , reverse = True )
    list_zero.sort ( key = lambda x : - x [ 1 ] , reverse = True )
    for i in range ( n ) :
        judge = max ( now + list_zero [ i ] [ 0 ] , list_zero [ i ] [ 1 ] )
        now += list_zero [ i ] [ 0 ] - list_zero [ i ] [ 1 ]
    for i in range ( n ) :
        max = max ( now + list_minus [ i ] [ 0 ] , list_minus [ i ] [ 1 ] )
        now += list_minus [ i ] [ 0 ] - list_zero [ i ] [ 1 ]
