def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.M = sys.stdin.read ( )
        rlist = [ [ False for i in range ( self.M ) ] for x in range ( self.N ) ]
        for y in range ( self.M ) :
            rlist [ x ] [ y ] = True
            rlist [ y ] [ x ] = True
    r = 1
    n = math.pow ( 2 , N )
    for i in range ( 1 , n ) :
        alist = [ ]
        valid = True
        for j in range ( N ) :
            if ( 1 & i >> j ) == 1 :
                alist.append ( j )
        for j in range ( len ( alist ) ) :
            for k in range ( j + 1 , len ( alist ) ) :
                if not rlist [ alist [ j ] ] [ alist [ k ] ] :
                    valid = False
                    break
            if not valid :
                break
        if valid :
            r = max ( r , len ( alist ) )
    print ( r )
