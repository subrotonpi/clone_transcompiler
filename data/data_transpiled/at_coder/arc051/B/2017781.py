def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.counter = 0
    def main ( self ) :
        sc = _main ( )
        self.k = sc.__next__ ( )
        fib = [ 1 ] * 45
        fib [ 0 ] = 1
        fib [ 1 ] = 1
        for i in range ( 1 , len ( fib ) - 1 ) :
            fib [ i + 1 ] = fib [ i ] + fib [ i - 1 ]
        print ( fib [ k + 1 ] , fib [ k ] )
    def gcd ( a , b ) :
        if b == 0 : return a
        self.counter += 1
        return gcd ( b , a % b )
