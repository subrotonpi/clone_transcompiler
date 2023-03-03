def import import os , sys , stdin , stdout , stderr , verbose , filename_only , code
from itertools import repeat
import itertools
class Main ( object ) :
    def __init__ ( self ) :
        self.FNAME = "a"
        self.stdin = stdin
        self.stdout = stdout
    def open ( self , stream ) :
        self.stdout = stream
        self.stream.seek ( 0 )
        self.assertEqual ( repeat ( self.f_code , stream ) , 0 )
    def run ( self ) :
        tn = len ( stdin )
        for test in range ( 1 , tn ) :
            n = len ( stdin )
            u = stdin.read ( n )
            v = stdin.read ( n )
            u = [ i for i in u if i != test ]
            v = [ i for i in v if i != test ]
            v = [ i for i in v if i != test ]
            u.sort ( )
            v.sort ( )
            r = 0
            for i in range ( n ) :
                r += u [ i ] * v [ n - 1 - i ]
            print ( "Case #%d: %s" % ( test , r ) , end = ' ' )
