def import _main
import sys
import os
import sys
import time
import getopt
import getopt
class Main ( object ) :
    def __init__ ( self , res ) :
        self.res = res
    def run ( self ) :
        try :
            self.solve ( )
        except :
            pass
if sys.platform == 'win32' :
    import win32_ver
    if sys.version_info [ 0 ] >= 3 :
        sys.exit ( 'Windows is not supported on Windows' )
    sys.stdout = open ( 'a.in' , 'r' )
    sys.stdout = open ( 'a.out' , 'w' )
    tests = int ( sys.stdin.readline ( ).strip ( ) )
    for test in range ( 1 , tests + 1 ) :
        sys.stdout.write ( 'Case #%d: ' % test )
        runtest ( )
    sys.stdout.close ( )
class Item ( object ) :
    def __init__ ( self , x , t ) :
        self.x = x
        self.t = t
    def runtest ( self ) :
        n = int ( sys.stdin.readline ( ).strip ( ) )
        a = [ ]
        b = [ ]
        c = [ ]
        for line in sys.stdin.readline ( ).split ( ) :
            a.append ( int ( line ) )
            b.append ( int ( line ) )
            c.append ( int ( line ) )
res = 0
items = [ ]
for i in range ( 2 * n ) :
    items.append ( Item ( ) )
for ai , A in zip ( a , b ) :
    count = 0
    for i in range ( n ) :
        l = b [ ai ]
        r = 10000 - A - c [ ai ]
        if l <= r and A >= a [ ai ] :
            items [ ai ] = l
            items [ ai ].x = r
            items [ ai ].t = 1
            items [ ai ].x = r
            items [ ai ].t = 2
return items
