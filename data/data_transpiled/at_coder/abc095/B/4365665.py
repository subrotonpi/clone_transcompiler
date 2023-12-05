def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.x = int ( sys.stdin.read ( ) )
        self.donut = self.n
        self.min = 1000
        self.add = 0
        m = [ ]
        for i in range ( self.n ) :
            m.append ( sys.stdin.read ( ) )
            self.add += m [ i ]
            if self.min > m [ i ] :
                min = m [ i ]
        self.donut += ( self.x - self.add ) / self.min
        print ( self.donut )
