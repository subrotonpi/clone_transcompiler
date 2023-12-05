def import datetime
class Main ( object ) :
    def __init__ ( self ) :
        self.input = sys.stdin.read ( ).split ( '/' )
    def __str__ ( self ) :
        return self.input [ 0 ]
    y , m , d = [ int ( x ) for x in self.input [ 1 : ] ]
    if y % m == 0 and y / m % d == 0 :
        print ( '%04d/%02d/%02d' % ( y , m , d ) )
    else :
        c = datetime.datetime ( y , m - 1 , d )
        outer :
            while True :
                c += datetime.timedelta ( days = 1 )
                y , m , d = c.timetuple ( )
                if y % m == 0 and y / m % d == 0 :
                    print ( '%04d/%02d/%02d' % ( y , m , d ) )
                    break outer
