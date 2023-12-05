def import _solve
class C ( object ) :
    def __init__ ( self , next_completion , time_for_lap ) :
        self.next_completion = next_completion
        self.time_for_lap = time_for_lap
        self.lap = lap
    def __lt__ ( self , that ) :
        if self.next_completion < that.next_completion :
            return - 1
        elif self.next_completion > that.next_completion :
            return 1
        else :
            return that.lap - self.lap
    def solve ( sc ) :
        pq = [ ]
        N = sc.randint ( 0 , N )
        for i in range ( N ) :
            D , H , M = sc.randint ( 0 , N )
            for j in range ( H ) :
                time_for_lap = M + j
                pq.append ( ( ( 360 - D ) * time_for_lap , time_for_lap , 0 ) )
        s = len ( pq )
        limit = s * 2
        min = s
        for i in range ( 10 * limit ) :
            h = pq.pop ( )
            if h.lap == 0 :
                s -= 1
            else :
                s += 1
            min = min ( min , s )
            pq.append ( ( h.next_completion + 360 * h.time_for_lap , h.time_for_lap , h.lap + 1 ) )
        return '%d' % min
    def main ( ) :
        sc = open ( '/dev/null' , 'r' )
        T = sc.randint ( 0 , T )
        for cs in range ( 1 , T + 1 ) :
            res = C ( ).solve ( sc )
            print ( 'Case #%d: %s' % ( cs , res ) )
        sc.close ( )
