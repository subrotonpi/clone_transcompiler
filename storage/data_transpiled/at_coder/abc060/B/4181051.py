def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        mod = 1000000007
        def run ( self ) :
            a = sc.randint ( 0 , 1000000007 )
            b = sc.randint ( 0 , 1000000007 )
            c = sc.randint ( 0 , 1000000007 )
            for i in range ( 1 , b + 1 ) :
                if a * i % b == c :
                    print ( "YES" )
                    return
            print ( "NO" )
