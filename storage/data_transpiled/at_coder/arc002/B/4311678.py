def import datetime
import datetime
import time
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        dt = datetime.datetime.strptime ( sc.readline ( ) , "%Y/%m/%d" )
        while not match ( dt ) :
            dt += datetime.timedelta ( days = 1 )
        print ( dt.strftime ( "%Y/%m/%d" ) )
    def match ( dt ) :
        y = dt.year
        m = dt.month + 1
        d = dt.day
        return y % ( m * d ) == 0
