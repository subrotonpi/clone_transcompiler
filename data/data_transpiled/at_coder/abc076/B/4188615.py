def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main.sc
        mod = 1000000007
    def main ( self ) :
        n = sc.randint ( 0 , 1000000007 )
        k = sc.randint ( 0 , 1000000007 )
        ans = 1
        for i in range ( n ) :
            ans = min ( ans + k , 2 * ans )
        print ( ans )
