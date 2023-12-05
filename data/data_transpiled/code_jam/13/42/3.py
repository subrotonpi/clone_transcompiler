def _import ( ) :
    from math import sin , cos , log
    from math import ceil , sin , log
    class B ( object ) :
        def read ( self ) :
            N = int ( self.n )
            P = math ( sin ( self.n ) )
        def solve ( self ) :
            if P == 1 << N :
                print ( ( P - 1 ) , end = "" )
                return
            P -= 1
            a = [ ]
            for i in range ( N ) :
                a.append ( P % 2 )
                P /= 2
            i1 = 0
            while a [ i1 ] == 1 :
                i1 += 1
            print ( ( 1 << ( i1 + 1 ) ) - 2 , end = "" )
            print ( "" , end = "" )
            i0 = 0
            while i0 < N and a [ i0 ] == 0 :
                i0 += 1
            b0 = True
            for i in range ( i0 , N ) :
                if a [ i ] != 1 :
                    b0 = False
            if b0 :
                print ( ( 1 << N ) - ( 1 << ( i0 ) ) , end = "" )
            else :
                print ( ( 1 << N ) - ( 1 << ( i0 + 1 ) ) , end = "" )
        def run ( self ) :
            caseN = int ( self.n )
            for caseID in range ( 1 , caseN + 1 ) :
                read ( self )
                print ( "Case #%d: " % caseID , end = "" )
                solve ( self )
                sys.stdout.flush ( )
        def debug ( self , * args ) :
            print ( * deeprepr ( args ) , end = "" )
    def main ( ) :
        try :
            pass
        except :
            pass
        B ( )
    return B
