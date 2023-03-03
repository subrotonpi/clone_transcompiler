def import import _sys
class Main ( object ) :
    def f ( x ) :
        ret = 0
        while x > 0 :
            ret += x % 10
            x /= 10
        return ret
    def main ( ) :
        with _sys.stdin :
            N = _sys.stdin.read ( )
    set = [ ]
    for i in range ( max ( 1 , N - 1000 ) , N ) :
        val = i + f ( i )
        if val == N :
            set.append ( i )
    print ( len ( set ) )
    for c in set :
        print ( c )
