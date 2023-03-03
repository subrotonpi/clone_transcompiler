def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.N = self.N
        self.M = self.M
        str1 = [ ]
        str2 = [ ]
        for i in range ( self.N ) :
            str1.append ( self.Scanner.next ( ) )
        for i in range ( self.M ) :
            str2.append ( self.Scanner.next ( ) )
        for i in range ( 0 , N - M ) :
            for j in range ( 0 , N - M ) :
                flag = True
                for k in range ( M ) :
                    if not str2 [ k ] == str1 [ k + j ] [ i : i + M ] :
                        flag = False
                        break
                if flag :
                    print ( "Yes" )
                    sys.exit ( )
        print ( "No" )
