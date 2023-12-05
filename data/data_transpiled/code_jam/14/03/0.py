def import _string
class c ( ) :
    MINE = '*'
    PLAYER = 'c'
    EMPTY = '.'
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        self.T = int ( self.T )
        for t in range ( 1 , T + 1 ) :
            r , c , m = self.T
            self.done = False
            board = [ [ ] for i in range ( r ) for j in range ( c ) ]
            print ( "Case #%d:" % t )
            if m == r * c - 1 :
                for x in board :
                    [ x ] = self.MINE
                board [ 0 ].append ( self.PLAYER )
                self.done = True
            elif r == 1 or c == 1 :
                for i in range ( r - 1 , - 1 , - 1 ) :
                    for j in range ( c - 1 , - 1 , - 1 ) :
                        if m :
                            board [ i ].append ( self.MINE )
                        board [ 0 ].append ( self.PLAYER )
                        self.done = True
                else :
                    for filled_rows in range ( 0 , r - 2 ) :
                        for filled_cols in range ( 0 , c - 2 ) :
                            left = m - filled_rows * c - filled_cols * r + filled_rows * filled_cols
                            if left < 0 :
                                continue
                            left_rows , left_cols = r - filled_rows , c - filled_cols
                            playable = ( left_rows - 2 ) * ( left_cols - 2 )
                            if playable < left :
                                continue
                            board [ 0 ].append ( self.PLAYER )
                            for i in range ( r ) :
                                for j in range ( c ) :
                                    if i >= left_rows or j >= left_cols :
                                        board [ i ].append ( self.MINE )
                                    for j in range ( left_cols - 1 , left_rows - 1 , left_cols - 1 ) :
                                        if left :
                                            board [ i ].append ( self.MINE )
