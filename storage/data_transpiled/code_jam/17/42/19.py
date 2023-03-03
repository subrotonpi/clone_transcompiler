def import _roller_coaster_scheduling
class RollerCoasterScheduling ( object ) :
    def __init__ ( self ) :
        self.cin = open ( "B-large.in" , "r" )
        self.cout = open ( "B-large.out" , "w" )
        self._case = 0
        for T in range ( self.cin.read ( ) ) :
            self._case += 1
            N = self.cin.read ( )
            C = self.cin.read ( )
            M = self.cin.read ( )
            a = [ [ 0 ] * ( C + 1 ) for i in range ( M ) ]
            for p in range ( 1 , C + 1 ) :
                b = self.cin.read ( )
                a [ b ] [ p ] += 1
        total_trains = 0
        for i in range ( 1 , C + 1 ) :
            sum = 0
            for j in range ( 1 , N + 1 ) :
                sum += a [ i ] [ j ]
            total_trains = max ( total_trains , sum )
        prefix_col_sum = 0
        for j in range ( 1 , N + 1 ) :
            for i in range ( 1 , C + 1 ) :
                prefix_col_sum += a [ i ] [ j ]
            total_trains = max ( total_trains , ( prefix_col_sum + j - 1 ) // j )
        promotion = 0
        for j in range ( N , 1 , - 1 ) :
            sum = 0
            for i in range ( 1 , C + 1 ) :
                sum += a [ i ] [ j ]
            extra = max ( 0 , sum - total_trains )
            promotion += extra
        ans = "%d %d" % ( total_trains , promotion )
        self.cout.write ( "Case #%d: %s\n" % ( self._case , ans ) )
