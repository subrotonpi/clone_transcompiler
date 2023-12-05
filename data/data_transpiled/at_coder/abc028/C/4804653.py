def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def __call__ ( self , * args ) :
        x = [ ]
        for i in range ( 5 ) :
            x.append ( sc.read ( ) )
    sum = [ ]
    for i in range ( 5 ) :
        for j in range ( 5 ) :
            if j == i :
                continue
            for k in range ( 5 ) :
                if k == i or k == j :
                    continue
                s = x [ i ] + x [ j ] + x [ k ]
                if s not in sum :
                    sum.append ( s )
    sum.sort ( reverse = True )
    print ( sum [ 2 ] )
