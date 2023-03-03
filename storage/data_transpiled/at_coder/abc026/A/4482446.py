def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
    def main ( self ) :
        a = sys.stdin.read ( )
        max = 0
        for i in range ( 0 , a ) :
            temp = a - i
            max = max ( max , i * temp )
        print ( max )
