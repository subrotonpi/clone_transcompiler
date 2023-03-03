def import _readline
import sys
import os
import sys
import readline
import readline
import sys
import readline
import readline
import readline
import sys
import os
import sys
class A ( object ) :
    def __init__ ( self , a , b , modulo ) :
        self.stdin = open ( self.stdin )
        self.stdout = open ( self.stdout )
        self.stdout = open ( self.stdout )
        self.diff ( a , b , modulo )
    def isPrime ( x ) :
        for t in range ( 2 , x + 1 ) :
            if x % t == 0 : return False
        return True
    def gcd ( x , y ) :
        if y == 0 : return x
        return gcd ( y , x % y )
    def solve ( ) :
        d = int ( readword ( ) )
        base = 1
        for i in range ( d ) :
            base *= 10
        n = int ( readword ( ) )
        a = [ ]
        max = 0
        for i in range ( n ) :
            a.append ( int ( readword ( ) ) )
            if a [ i ] > max : max = a [ i ]
        if n == 1 :
            sys.stdout.write ( "I don't know.\n" )
            return
        ans = - 1
        for P in range ( max + 1 ) :
            if not isPrime ( P ) : continue
            for A in range ( P ) :
                fl = True
                diff = ( P * P + a [ 1 ] - a [ 0 ] * A ) % P
                for i in range ( 1 , n ) :
                    if ( P * P + a [ i ] - a [ i - 1 ] * A ) % P != diff :
                        fl = False
                        break
                if fl :
                    tmp = ( a [ n - 1 ] * A + diff ) % P
                    if ans == - 1 :
                        ans = tmp
                    elif ans != tmp :
                        sys.stdout.write ( "I don't know.\n" )
                        return
        sys.stdout.write ( ans + "\n" )
