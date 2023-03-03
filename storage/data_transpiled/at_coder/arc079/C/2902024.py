def import import _sys
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.n = sc.n
    def main ( self ) :
        n = int ( self.n )
        a = [ _sys.stdin.read ( ) ]
        ans = 0
        while True :
            adivn = [ x / n for x in a ]
            sum = sum ( adivn )
            ans += sum
            if sum == 0 :
                break
            for i in range ( n ) :
                a [ i ] = a [ i ] % n + sum - adivn [ i ]
        print ( ans )
    def run ( self ) :
        with open ( "/dev/null" , "r" ) as f :
            return Main ( )
