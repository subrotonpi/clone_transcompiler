def import import sys
import string
import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        input = sys.stdin.readline ( )
        parts = input.split ( )
        a , b , c = map ( int , parts )
        target = c % b
        for i in range ( 1 , b + 1 ) :
            if i * a % b == target :
                print ( "YES" )
                return
        print ( "NO" )
