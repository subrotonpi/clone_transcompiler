def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.ary = [ ]
        self.count = len ( sys.argv )
        for i in range ( self.count ) :
            f = sys.argv.pop ( i )
            l = sys.argv.pop ( i )
            num = sys.argv.pop ( i )
            for e in range ( len ( ary ) ) :
                if f <= ( e + 1 ) and l > e :
                    ary.append ( num )
        for i in ary :
            print ( i )
