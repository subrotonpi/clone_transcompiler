def _import ( ) :
    import sys
    import os
    import sys
    import os
    import sys
    class ProblemA :
        def __init__ ( self ) :
            self.XWON = 'X won'
            self.OWON = 'O won'
            self.YET = 'Game has not completed'
            self.DRAW = 'Draw'
        def debug ( self , * o ) :
            sys.stderr.write ( "\n" )
            self.T = len ( self.XWON )
            for cn in range ( 1 , T + 1 ) :
                board = [ ]
                for y in range ( 4 ) :
                    board.append ( self.XWON [ y ] )
                print ( 'Case #%d: %s' % ( cn , solve ( board ) ) , file = sys.stderr )
            sys.stderr.flush ( )
    def solve ( board ) :
        check_list = [ ]
        for y in range ( 4 ) :
            check_list.append ( [ board [ y ] [ 0 ] , board [ y ] [ 1 ] , board [ y ] [ 2 ] , board [ y ] [ 3 ] ] )
            check_list.append ( [ board [ 0 ] [ y ] , board [ 1 ] [ y ] , board [ 2 ] [ y ] , board [ 3 ] [ y ] ] )
        check_list.append ( [ board [ 0 ] [ 0 ] , board [ 1 ] [ 1 ] , board [ 2 ] [ 2 ] , board [ 3 ] [ 3 ] ] )
        check_list.append ( [ board [ 3 ] [ 0 ] , board [ 2 ] [ 1 ] , board [ 1 ] [ 2 ] , board [ 0 ] [ 3 ] ] )
        for cl in check_list :
            e = evaluate ( cl )
            if not '' in e :
                return e
        dots = 0
        for y in range ( 4 ) :
            dots += 1
        return ''
    return ProblemA
