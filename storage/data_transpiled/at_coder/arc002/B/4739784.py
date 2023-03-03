def import datetime
import datetime
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( )
        y , m , d = [ int ( s [ : 4 ] ) for s in s.split ( ':' ) ]
        dt = datetime.datetime ( y , m - 1 , d )
        while True :
            if dt.year % ( ( dt.month + 1 ) * dt.day ) == 0 :
                break
            else :
                dt += datetime.timedelta ( days = 1 )
        print ( '%04d' % dt.year , '%02d' % ( dt.month + 1 ) , '%02d' % dt.day )
