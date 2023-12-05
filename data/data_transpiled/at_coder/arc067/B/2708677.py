def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        a = sys.stdin.read ( )
        b = sys.stdin.read ( )
        x = sys.stdin.read ( )
        ans = 0
        for i in range ( n - 1 ) :
            ans += min ( b , a * ( x [ i + 1 ] - x [ i ] ) )
        print ( ans )
    def main ( ) :
        with open ( "/tmp/main.py" , "w" ) as f :
            f.write ( sys.stdin.read ( ) )
