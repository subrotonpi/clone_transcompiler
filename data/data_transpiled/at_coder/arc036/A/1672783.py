def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.k = sys.maxint
    def __call__ ( self , * args ) :
        t = [ ]
        for i in range ( n ) :
            t.append ( args [ i ] )
        for i in range ( 2 , n ) :
            if t [ i - 2 ] + t [ i - 1 ] + t [ i ] < k :
                print ( i + 1 )
                return
        print ( - 1 )
