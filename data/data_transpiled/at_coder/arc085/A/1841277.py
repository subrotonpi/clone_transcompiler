def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        cin = sys.stdin
        n , m = cin.read ( ).split ( '.' )
        print ( ( ( n - m ) * 100 + 1900 * m ) * pow ( 2 , m ) )
    def pow ( self , a , b ) :
        res = 1
        for i in range ( b ) :
            res *= a
        return res
