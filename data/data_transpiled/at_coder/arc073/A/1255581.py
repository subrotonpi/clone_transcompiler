def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.T = sys.stdin.read ( )
    tn = [ ]
    for i in range ( N ) :
        tn.append ( sys.stdin.read ( ) )
    sum_showert_time = T
    end_shower = T
    for i in range ( 1 , len ( tn ) ) :
        term = tn [ i ] - tn [ i - 1 ]
        if term > T :
            sum_showert_time += T
        else :
            sum_showert_time += term
        if end_shower < tn [ i ] + term :
            end_shower = tn [ i ] + term
    print ( sum_showert_time )
    return
