def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.n = self.n
        self.m = self.m
        self.p = self.p
        self.q = self.q
        self.r = self.r
        self.score = [ ]
        for i in range ( self.r ) :
            x = self.x - 1
            y = self.y - 1
            self.score.append ( [ x , y ] )
    top_score = 0
    for i in range ( ( 1 , n ) ) :
        x_selected = [ ]
        x_selected_count = 0
        for j in range ( self.n ) :
            x_selected.append ( ( i & ( 1 << j ) ) != 0 )
            if x_selected [ j ] :
                x_selected_count += 1
        if x_selected_count != self.p :
            continue
        y_score = [ ]
        for k in range ( self.m ) :
            for j in range ( self.n ) :
                if x_selected [ j ] :
                    y_score.append ( score [ j ] [ k ] )
        y_score.sort ( )
        sum_score = 0
        for k in range ( self.q ) :
            sum_score += y_score [ self.m - 1 - k ]
        top_score = max ( top_score , sum_score )
    print ( top_score )
