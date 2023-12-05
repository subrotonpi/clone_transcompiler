def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.city = sys.stdin.readline ( ).strip ( )
        self.road = sys.stdin.readline ( ).strip ( )
        self.list = [ 0 for index_city in range ( self.city ) ]
        for index_road in range ( self.road ) :
            self.city1 = sys.stdin.readline ( ).strip ( )
            self.city2 = sys.stdin.readline ( ).strip ( )
            temp = self.list [ self.city1 - 1 ]
            self.list [ self.city1 - 1 ] = temp + 1
            temp = self.list [ self.city2 - 1 ]
            self.list [ self.city2 - 1 ] = temp + 1
        for index_city in range ( self.city ) :
            print ( self.list [ index_city ] )
