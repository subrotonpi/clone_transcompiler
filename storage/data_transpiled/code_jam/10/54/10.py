def _import ( ) : return ''
import sys
import os
import os
import sys
import os
import sys
class D ( object ) :
    def __init__ ( self ) :
        self.fname = 'D-small-attempt1'
        def solution ( self ) :
            ts = os.stat ( self.fname ).st_size
            for cas in range ( 1 , ts + 1 ) :
                self.out.write ( 'Case #%d: %s\n' % ( cas , self.fname ) )
        return self.fname
    def solve ( self , n , base ) :
        cnt = 0
        while n > 0 :
            n /= base
            cnt += 1
        return cnt
    def run ( self ) :
        try :
            f = open ( self.fname + '.in' , 'r' )
            self.fname = f.readline ( )
            f.close ( )
        except ( IOError , OSError ) :
            pass
        return f.read ( )
    def main ( self , args ) :
        yield ( None , D ( ) , '' , 1 << 28 ).start ( )
    f = open ( '.out' , 'w' )
    f.write ( ''.join ( [ str ( x ) for x in args ] ) )
    f.close ( )
    f = open ( '.out' , 'w' )
    f.write ( ''.join ( [ str ( x ) for x in args ] ) )
    f.close ( )
    f = open ( '.out' , 'w' )
    f.write ( ''.join ( [ str ( x ) for x in args ] ) )
    f.close ( )
    f = open ( '.out' , 'w' )
    f.write ( ''.join ( [ str ( x ) for x in args ] ) )
    f.close ( )
    f.close ( )
    f = open ( '.out' , 'w' )
    f.write ( ''.join ( [ str ( x ) for x in args ] ) )
    f.close ( )
    f.close ( )
    f.close ( )
