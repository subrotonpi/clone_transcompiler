def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
        def __call__ ( self , * args ) :
            k = self.sc.randint ( 1 , 4 )
            if k == 1 :
                print ( "1" )
                print ( "1" )
            elif k == 2 :
                print ( "2" )
                print ( "1 2" )
                print ( "2 1" )
            elif k == 3 :
                print ( "2" )
                print ( "1 2" )
                print ( "3 1" )
            elif k == 4 :
                print ( "2" )
                print ( "1 2" )
                print ( "3 4" )
            else :
                cut = 4 - k % 4
                if cut != 4 :
                    n = ( k + cut ) // 2
                else :
                    n = k // 2
                    cut = 0
                print ( n )
                for r in range ( n ) :
                    for c in range ( n ) :
                        if r % 2 == 0 :
                            print ( ( c + r ) % n + 1 , end = " " )
                        else :
                            amari = ( c + r ) % n
                            if amari == n - 1 and cut >= 1 or amari == n - 2 and cut >= 2 or amari == n - 3 and cut >= 3 :
                                print ( ( c + r ) % n + 1 , end = " " )
                            else :
                                print ( ( c + r ) % n + n + 1 , end = " " )
                    print ( )
