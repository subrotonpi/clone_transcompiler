def import datetime
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        date = sc.readline ( ).split ( '/' )
        y , m , d = [ int ( i ) for i in date [ 0 ].split ( ':' ) ]
        c = datetime.datetime ( y , m - 1 , d )
        while not f ( c ) : c += datetime.timedelta ( days = 1 )
        y , m , d = c.timetuple ( )
        print ( "%4d/%02d/%02d\n" % ( y , m , d ) )
    def f ( self ) :
        y , m , d = c.timetuple ( )
        return y % ( m * d ) == 0
    def readInt ( self ) :
        return int ( sc.readline ( ) )
