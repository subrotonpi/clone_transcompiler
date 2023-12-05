def import import os , sys , re , log
from io import StringIO
import sys
class Main ( object ) :
    class FastScanner ( Scanner ) :
        def __init__ ( self ) :
            try :
                f = sys.stdin
            except :
                sys.stdout = sys.stderr
            else :
                f = open ( f , 'r' )
        def next ( self ) :
            if self.next ( ) : return self.next ( )
            try :
                s = re.split ( r'\s+' , self.next ( ) )
            except :
                pass
            return s [ 0 ]
        def randint ( self ) : return int ( self.next ( ) )
        def long ( self ) : return long ( self.next ( ) )
        def uniform ( self ) : return float ( self.next ( ) )
        def readline ( self ) :
            line = ''
            if self.next ( ) : line = self.next ( )
            else : try : return f.readline ( )
            except StopIteration : pass
            while self.next ( ) : line += ' ' + self.next ( )
            return line
    mod = 1000000007
    oo = int ( sys.maxsize )
    def pow10 ( v ) :
        while v > 1 and v % 10 == 0 :
            v /= 10
        return v == 1
    def digit_sum ( v ) :
        if v < 10 : return v
        else : return ( v % 10 ) + digit_sum ( v // 10 )
    def main ( ) :
        sc = FastScanner ( )
        f = open ( sys.argv [ 1 ] , 'w' )
        n = sc.next ( )
        if pow10 ( n ) : f.write ( 10 )
        else : f.write ( digit_sum ( n ) )
        f.close ( )
