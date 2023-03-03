def import import sys
import os
import sys
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.ans = [ ]
    def run ( self ) :
        with open ( sys.argv [ 1 ] ) as sc :
            n , A , B = sc.read ( ).split ( )
            if not self.check ( n , A , B ) :
                print ( - 1 )
                sys.exit ( 0 )
        ans = [ ]
        lower_bound = 0
        start = 1
        for cnt in range ( 1 , A + 1 ) :
            len = min ( B , n - start - A + cnt + 1 )
            for j in range ( len ) :
                ans.append ( lower_bound + len - j )
            lower_bound += len
        f = sys.stdout.write
        for i in range ( 1 , n + 1 ) :
            f.write ( str ( ans [ i ] ) + " " )
        f.flush ( )
    def check ( self , n , a , b ) :
        if a > n or b > n or b > n - a + 1 :
            return False
        shortest = n / a if n % a == 0 else ( n / a + 1 )
        return b >= shortest
