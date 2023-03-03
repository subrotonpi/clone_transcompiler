def _import ( ) : return
import os
import sys
class PA ( object ) :
    class Data :
        def __init__ ( self ) :
            self.tok = None
            self.rd = sys.stdin
            self.wr = sys.stdout
        def write ( self , line ) :
            self.wr.write ( line )
        def close ( self ) :
            self.rd.close ( )
            self.wr.close ( )
        def __next__ ( self ) :
            while not self.tok or not self.tok :
                self.tok = self.rd.readline ( )
            return self.tok [ 0 ]
        def __next__ ( self ) :
            return int ( self.tok )
        def console ( self ) :
            return { }
        def files ( self , name ) :
            return { name : self.files [ name ] }
    def main ( self ) :
        with self.stdin :
            self.stdout.write ( '\n' )
    def solve ( self ) :
        data = Data.files ( 'a' )
        t = data.__next__ ( )
        for i in range ( t ) :
            s = data.__next__ ( ).strip ( )
            k = data.__next__ ( )
            res = self.subsolve ( s , k )
            data.write ( 'Case #%d: %s\n' % ( i + 1 , ( res >= 0 ) and 'IMPOSSIBLE' or 'IMPOSSIBLE' ) )
        data.close ( )
    def subsolve ( self , s , k ) :
        n = len ( s )
        c = [ ( s [ i ] == '+' ) for i in range ( n ) ]
        cnt = 0
        for i in range ( n - k + 1 ) :
            if not c [ i ] :
                return - 1
        return cnt
return PA
