def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = len ( sys.argv )
            self.min = sys.maxint
            self.max = sys.maxint
            self.now = 0
            for a in sys.argv [ 1 : ] :
                id = sys.maxint
                if id < self.min :
                    id = min
                elif id > self.max :
                    id = max
                if a [ 0 ] == 'E' :
                    self.now += id
                elif a [ 0 ] == 'W' :
                    self.now -= id
            if self.now > 0 :
                print ( "East %d" % self.now )
            elif self.now < 0 :
                print ( "West %d" % ( self.now * - 1 ) )
            else :
                print ( 0 )
