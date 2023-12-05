def main ( ) :
    import math
    class ProblemC ( CodeJammer ) :
        def process ( self ) :
            line1 = self.reader.readline ( )
            r , k , n , g = line1
            depth = int ( math.log ( r ) / math.log ( 2 ) ) + 2
            index_reached = [ ]
            riders = [ ]
            for i in range ( n ) :
                boarded = 0
                next = i
                while True :
                    boarded += g [ next ]
                    next += 1
                    if next >= n :
                        next -= n
                if next != i and boarded + g [ next ] <= k :
                    break
            index_reached.append ( [ next ] )
            riders.append ( [ boarded ] )
        for d in range ( 1 , depth ) :
            for i in range ( n ) :
                middle_index = index_reached [ d - 1 ] [ i ]
                index_reached [ d ] [ i ] = index_reached [ d - 1 ] [ middle_index ]
                riders [ d ] [ i ] = riders [ d - 1 ] [ i ] + riders [ d - 1 ] [ middle_index ]
        ride_left = r
        total = 0
        next_index = 0
        while ride_left > 0 :
            chunk = 1
            d = 0
            while 2 * chunk <= ride_left :
                chunk *= 2
                d += 1
            ride_left -= chunk
            total += riders [ d ] [ next_index ]
            next_index = index_reached [ d ] [ next_index ]
        self.output ( total )
