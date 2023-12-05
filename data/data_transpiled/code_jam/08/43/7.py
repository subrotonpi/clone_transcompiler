def import readline
import sys
import locale
import readline
import time
import math
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import time
import sys
import locale
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stdout = sys.stdout
        self.x = [ ]
        self.y = [ ]
        self.z = [ ]
        self.p = [ ]
    def solve ( self ) :
        n = self.iread ( )
        x = [ ]
        y = [ ]
        z = [ ]
        p = [ ]
        for i in range ( n ) :
            x.append ( self.dread ( ) )
            y.append ( self.dread ( ) )
            z.append ( self.dread ( ) )
            p.append ( self.dread ( ) )
        res = 0
        for i in range ( n ) :
            for j in range ( i + 1 , n ) :
                dis = abs ( x [ i ] - x [ j ] ) + abs ( y [ i ] - y [ j ] ) + abs ( z [ i ] - z [ j ] )
                dis = dis / ( p [ i ] + p [ j ] )
                res = max ( dis , res )
        self.df = { }
        self.stdout.write ( "%s\n" % ( res ) )
    def iread ( self ) :
        return int ( self.readword ( ) )
    def dread ( self ) :
        return float ( self.readword ( ) )
    def lread ( self ) :
        return long ( self.readword ( ) )
    def readword ( self ) :
        c = readline.read ( )
        while c >= '' and c <= '' :
            c = readline.read ( )
        if c < '' : return ''
        yield c
