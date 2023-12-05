def import import struct
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        self.count = sc.count
    def main ( self ) :
        N = sc.count
        first = [ ]
        second = [ ]
        for i in range ( 1 , ( 1 << i ) - 1 ) :
            first.append ( i )
            second.append ( i )
        self.N -= ( 1 << len ( first ) ) - 1
        while N > 0 :
            a = first + [ ]
            first.append ( a )
            for i in range ( 0 , N ) :
                if ( 1 << ( i + 1 ) ) > self.N :
                    second.insert ( i , a )
                    self.N -= ( 1 << ( i ) )
                    break
        print ( len ( first ) * 2 )
        for i in first :
            print ( i , end = ' ' )
        for i in second :
            print ( i , end = '\n' )
