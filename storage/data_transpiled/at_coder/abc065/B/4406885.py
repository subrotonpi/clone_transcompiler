def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.array = [ ]
        for i in range ( n ) :
            self.array.append ( i )
        self.visit = [ ]
        current = 0
        count = 0
        self.visit [ 1 ] = True
        while True :
            current = self.array [ current ] - 1
            count += 1
            if current == 1 :
                print ( count )
                return
            if self.visit [ current ] :
                print ( '-1' )
                return
            self.visit [ current ] = True
