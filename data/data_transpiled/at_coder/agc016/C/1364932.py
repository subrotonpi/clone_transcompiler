def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = raw_input
    def __init__ ( self ) :
        self.output = sys.stdout
    def main ( ) :
        self.output = sys.stdout
    H , W , h , w = self.input ( )
    if ( H % h == 0 ) :
        print ( "No" )
    else :
        print ( "Yes" )
        ans = [ ]
        if H % h == 0 :
            for i in range ( H ) :
                for j in range ( W ) :
                    if j % w == 0 :
                        ans.append ( [ 1000 * w - 1001 ] )
                    else :
                        ans.append ( [ - 1000 ] )
        else :
            for i in range ( H ) :
                for j in range ( W ) :
                    if i % h == 0 :
                        ans.append ( [ 1000 * h - 1001 ] )
                    else :
                        ans.append ( [ - 1000 ] )
        for i in range ( H ) :
            for j in range ( W ) :
                print ( ans [ i ] [ j ] , end = " " )
                if j < W - 1 :
                    print ( " " , end = " " )
                else :
                    print ( )
