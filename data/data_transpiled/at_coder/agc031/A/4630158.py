def import import sys , string , glob
import string
import glob
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = int ( sc.readline ( ) )
        s = string.ascii_lowercase
        alp = [ 0 ] * 26
        for i in range ( n ) :
            alp [ s [ i ] - 'a' ] += 1
        mod = 1000000007
        count = 1
        for i in range ( 26 ) :
            count = count * ( alp [ i ] + 1 ) % mod
        print ( count - 1 )
