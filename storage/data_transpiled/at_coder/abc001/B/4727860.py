def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
        def __call__ ( self , * args ) :
            m = float ( args [ 0 ] )
            M = m / 1000.0
            if M < 0.1 :
                print ( '00' )
            elif 0.1 <= M <= 5 :
                ans = int ( M * 10 )
                if ans <= 9 :
                    print ( '0' + str ( ans ) )
                else :
                    print ( ans )
            elif 6 <= M <= 30 :
                print ( int ( M ) + 50 )
            elif 35 <= M <= 70 :
                print ( ( int ( M ) - 30 ) / 5 + 80 )
            elif 70 < M :
                print ( 89 )
