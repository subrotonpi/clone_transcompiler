def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.m = int ( sys.stdin.readline ( ) )
        self.num_list = [ 0 ] * ( 50 + 1 )
        for a , b in zip ( self.n , self.m ) :
            self.num_list [ a ] += 1
            self.num_list [ b ] += 1
        for i in range ( 1 , self.n + 1 ) :
            print ( self.num_list [ i ] )
