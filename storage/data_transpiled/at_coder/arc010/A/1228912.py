def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        s = sys.stdin
        n , m , a , b = s.read ( )
        for d in range ( m ) :
            if n <= a :
                n += b
            n -= s.read ( )
            if n < 0 :
                print ( d + 1 )
                return
        print ( 'complete' )
