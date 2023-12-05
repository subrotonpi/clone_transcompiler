def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.stdout = sys.stdout
            self.stdout.isatty ( )
            self.stdout.isatty ( )
            self.stdout.isatty ( )
        def get_num ( self , vote , n ) :
            result = [ vote [ 0 ] [ 0 ] , vote [ 0 ] [ 1 ] ]
            for i in range ( 1 , n ) :
                result1 = result [ 1 ]
                if result [ 0 ] > vote [ i ] [ 0 ] :
                    if result [ 0 ] % vote [ i ] [ 0 ] != 0 :
                        result [ 0 ] += vote [ i ] [ 0 ] - result [ 0 ] % vote [ i ] [ 0 ]
                else :
                    result [ 0 ] = vote [ i ] [ 0 ]
                result [ 1 ] = result [ 0 ] / vote [ i ] [ 0 ] * vote [ i ] [ 1 ]
                if result1 > result [ 1 ] :
                    result [ 1 ] = result1
                    if result [ 1 ] % vote [ i ] [ 1 ] != 0 :
                        result [ 1 ] += vote [ i ] [ 1 ] - result [ 1 ] % vote [ i ] [ 1 ]
                    result [ 0 ] = result [ 1 ] / vote [ i ] [ 1 ] * vote [ i ] [ 0 ]
            return result [ 0 ] + result [ 1 ]
    def read_matrix ( self , n , m ) :
        mtx = [ ]
        for i in range ( n ) :
            for j in range ( m ) :
                mtx.append ( self.read_matrix ( self , n , j ) )
        return mtx
