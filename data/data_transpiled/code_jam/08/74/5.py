def import _alice_wins
class Kings ( object ) :
    def __init__ ( self , case ) :
        self.case = case
        self.num_cases = len ( case )
        for i in range ( num_cases ) :
            self.do_case ( case , i + 1 )
    def do_case ( self , case ) :
        R , C = self.num_cases
        board = [ [ False ] * R , [ False ] * C ]
        x , y = 0 , 0
        for i , line in enumerate ( self.board ) :
            for j , char in enumerate ( line ) :
                if char == 'K' :
                    x = i
                    y = j
                elif char == '#' :
                    board [ i ] [ j ] = True
        if alice_wins ( board , x , y , True ) :
            print ( "Case #%d: A" % case )
        else :
            print ( "Case #%d: B" % case )
    def alice_wins ( board , x , y , alice_moves ) :
        board [ x ] [ y ] = True
        try :
            for i in range ( - 1 , 2 ) :
                for j in range ( - 1 , 2 ) :
                    if legal ( board , x + i , y + j ) and alice_wins ( board , x + i , y + j , not alice_moves ) == alice_moves :
                        return True
            finally :
                board [ x ] [ y ] = False
            return not alice_moves
        except :
            print ( "Case #%d: A" % case )
return Kings
