def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.a = [ ]
        for i in range ( n ) :
            self.a.append ( sys.stdin.read ( ) )
    def main ( ) :
        return sys.stdin.read ( )
    def main ( ) :
        return Main ( )
    def main ( ) :
        return Main ( )
    n = sys.argv [ 1 ]
    a = [ ]
    for i in range ( n ) :
        a.append ( i )
    count = 0
    cnt = 1
    for i in range ( 1 , n ) :
        if a [ i ] > a [ i - 1 ] :
            cnt += 1
        else :
            if cnt == 1 :
                count += 1
            else :
                count += cnt * ( cnt - 1 ) / 2 + cnt
            cnt = 1
    if cnt == 1 :
        count += 1
    else :
        count += cnt * ( cnt - 1 ) / 2 + cnt
    print ( count )
