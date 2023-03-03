def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        output = sys.maxint
        for i in range ( 1 , n + 1 ) :
            if n % i + abs ( n / i - i ) < output :
                output = n % i + abs ( n / i - i )
        print ( output )
