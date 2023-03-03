def do_cheating ( case_num , stdin ) :
    from pychema import cheating
    from pychema.core import cheating
    class NoCheating ( cheating ) :
        def __init__ ( self , case_num , stdin ) :
            cheating.__init__ ( self , stdin )
            self.num_cases = len ( stdin )
            for i in range ( self.num_cases ) :
                self.do_cheating ( i + 1 , stdin )
        def do_cheating ( self , case ) :
            H , W = self.num_cases
            broken = [ 0 ] * H
            for seats in cheating.split ( ' ' ) :
                for j in range ( W ) :
                    if seats [ j ] == 'x' : broken [ i ] |= 1 << j
            optimal = [ [ - 1 ] * ( H - 1 ) + [ 1 ] * ( W - 1 ) + [ 1 ] * ( H - 1 ) + [ 1 ] * ( W - 1 ) + [ 1 ] * ( W - 1 ) + [ 1 ] * ( H - 1 ) + [ 1 ] * ( W - 1 ) + [ 1 ] * ( W - 1 ) + [ 1 ] * ( H - 1 ) + [ 1 ] * ( W - 1 ) + [ 1 ] * ( W - 1 ) + [ 1 ] * ( H - 1 ) + [ 1 ] * ( W - 1 ) + [ 1 ] * ( H - 1 ) + [ 1 ] * ( W - 1 ) + [ 1 ] * ( W - 1 ) + [ 1 ] * ( H - 1 ) + [ 1 ] * ( W - 1 ) + [ 1 ] * ( H - 1 ) + [ 1 ] * ( W - 1 ) + [ 1 ] * ( W - 1 ) + [ 1 ] * ( H - 1 ) + [ 1 ] * ( W - 1 ) + [ 1 ] * ( H - 1 ) + [ 1 ] * ( W - 1 ) + [ 1 ] * ( H - 1 ) + [ 1 ] * ( W - 1 ) + [ 1 ] * ( H - 1 ) + [ 1 ] * ( W - 1 ) + [ 1 ] * ( H - 1 ) + [ 1 ] * ( W - 1 ) + [ 1 ] * ( W - 1 ) + [ 1 ] * ( H