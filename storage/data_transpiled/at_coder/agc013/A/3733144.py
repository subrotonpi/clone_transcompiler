def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = sys.stdin
    def main ( ) :
        n = int ( sys.stdin.readline ( ) )
        if n == 1 :
            print ( 1 )
            sys.exit ( 0 )
        a = [ ]
        i = 0
        for ai in sys.stdin.readline ( ).split ( ) :
            a.append ( int ( ai ) )
        x = 1
        plus = 0
        for i in range ( n - 1 ) :
            if a [ i ] > a [ i + 1 ] :
                if plus == - 1 :
                    x += 1
                    plus = 0
                elif plus == 0 :
                    plus = 1
            elif a [ i ] < a [ i + 1 ] :
                if plus == 1 :
                    x += 1
                    plus = 0
                elif plus == 0 :
                    plus = - 1
        print ( x )
