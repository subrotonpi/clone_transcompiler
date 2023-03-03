def import import sys
class a ( ) :
    def __init__ ( self ) :
        self.T = sys.maxint
    for t in range ( 1 , T + 1 ) :
        o_pos , b_pos = 1 , 1
        range = 0
        n = sys.maxint
        time = 0
        orange , blue = [ ] , [ ]
        color = [ ]
        for s , p in sys.stdin :
            if s [ 0 ] == "O" :
                color.append ( 1 )
                orange.append ( p )
            else :
                color.append ( 2 )
                blue.append ( p )
        i = 0
        while i < n :
            if color [ i ] == 1 :
                or = orange [ 0 ]
                if o_pos == or :
                    orange.pop ( 0 )
                    i += 1
                else :
                    o_pos += 1 if or > o_pos else - 1
                bl = blue [ 0 ] if blue else b_pos
                if b_pos != bl :
                    b_pos += 1 if bl > b_pos else - 1
            else :
                bl = blue [ 0 ]
                if b_pos == bl :
                    blue.pop ( 0 )
                    i += 1
                else :
                    b_pos += 1 if bl > b_pos else - 1
                or = orange [ 0 ] if orange else o_pos
                if o_pos != or :
                    o_pos += 1 if or or > o_pos else - 1
            time += 1
        print ( "Case #%d: %d" % ( t , time ) )
