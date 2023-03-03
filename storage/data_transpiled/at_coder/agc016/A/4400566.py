def _ ( ) : return
import sys
import random
import string
import random
class Main ( object ) :
    def __init__ ( self ) :
        with open ( 'input.txt' , 'r' ) as sc :
            s = sc.read ( )
    def solve ( s , c , ans ) :
        ans = len ( s )
        for i in [ 'a' , 'z' ] :
            ans = min ( ans , solve ( s , i , 0 ) )
        out.write ( ans )
    def d ( s ) :
        c = 0
        for i in range ( len ( s ) - 1 ) :
            if s [ i ] != s [ i + 1 ] :
                c += 1
                break
        return c == 0
    def solve ( s , c , ans ) :
        if d ( s ) :
            return ans
        else :
            temp = ""
            for i in range ( len ( s ) - 1 ) :
                if s [ i + 1 ] == c :
                    temp += c
                else :
                    temp += s [ i ]
            return solve ( temp , c , ans + 1 )
