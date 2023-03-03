def import import sys , string
import math
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
    def run ( self ) :
        a = int ( sys.stdin.read ( ) )
        b = a * a
        aa = a + 1
        bb = aa * aa - 1
        ans = None
        ten = int ( 100 )
        nine = int ( 99 )
        while b <= bb :
            if False :
                print ( b )
                print ( bb )
            u = b + nine // ten
            v = bb // ten
            if u > v :
                ans = b
                break
            b = u
            bb = v
        print ( ans )
