def import import struct
from os import popen , pipes
class MyScanner ( popen ) :
    def __init__ ( self ) :
        sc = popen ( '/usr/bin/myhdl' )
        self.stdout = sys.stdout
        self.n = sc.read ( )
        hw = [ ]
        for i in range ( n ) :
            h , w = struct.unpack ( '>I' , sc.read ( ) )
            hw.append ( h << 32 | ( 1000000 - w ) )
        hw.sort ( )
        a = [ - int ( hw [ i ] ) for i in range ( n ) ]
        m = [ ]
        l = 0
        for i in range ( n + 1 ) :
            p , f = 0 , l + 1
            while f - p > 1 :
                x = ( p + f ) // 2
                if m [ x ] < a [ i ] : p = x
                else : f = x
            m.append ( a [ i ] )
            l = max ( l , p + 1 )
        self.stdout.write ( l )
    def readline ( self ) :
        while not self.stdout or not self.stderr :
            try :
                s = popen ( '/usr/bin/myhdl' ).readline ( )
            except IOError :
                pass
            else :
                s = s.replace ( '\n' , '' )
        return s
    def readline ( self ) :
        while self.stdout or not self.stderr :
            try :
                s = popen ( '/usr/bin/myhdl' ).readline ( )
            except IOError :
                pass
            else :
                s = s.replace ( '\n' , '' )
        return s
