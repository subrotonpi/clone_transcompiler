def import _train_timetable
class TrainTimetable ( object ) :
    def __init__ ( self ) :
        self.name = "train_timetable"
        self.n = int ( self.n )
        for i in range ( self.n ) :
            t = int ( self.t )
            s = self.s.split ( )
            na = int ( s [ 0 ] )
            nb = int ( s [ 1 ] )
            data = [ ]
            k = 0
            for i in range ( na ) :
                s = self.s.split ( )
                data.append ( 4 * self.parse_time ( s [ 0 ] ) + 2 )
                data.append ( 4 * ( t + self.parse_time ( s [ 1 ] ) ) + 1 )
            for i in range ( nb ) :
                s = self.s.split ( )
                data.append ( 4 * self.parse_time ( s [ 0 ] ) + 3 )
                data.append ( 4 * ( t + self.parse_time ( s [ 1 ] ) ) )
            data.sort ( )
            req = [ 0 ] * 2
            curr = [ 0 ] * 2
            for i in range ( len ( data ) ) :
                arrives = ( data [ i ] % 4 < 2 )
                idx = data [ i ] % 2
                if arrives :
                    curr [ idx ] += 1
                else :
                    if curr [ idx ] == 0 :
                        req [ idx ] += 1
                    else :
                        curr [ idx ] -= 1
            print ( "Case #%d: %d %d" % ( self.i + 1 , req [ 0 ] , req [ 1 ] ) )
    def parse_time ( s ) :
        ss = s.split ( ":" )
        return 60 * int ( ss [ 0 ] ) + int ( ss [ 1 ] )
