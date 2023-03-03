def import java.io.StringIO
import os
import sys
class Main ( object ) :
    MOD = 1_000_000_000 + 7
    def run ( self ) :
        with open ( "file.txt" , "r" ) as sc :
            S = sc.read ( )
            n = len ( S )
            ans = n / 2
            left = n - ans - 1
            right = ans
            char = S [ left ]
            while left >= 0 and S [ left ] == S [ right ] and S [ left ] == char :
                left -= 1
                right += 1
                ans += 1
            print ( ans )
    def tr ( self , * args ) :
        print ( " ".join ( map ( str , args ) ) )
