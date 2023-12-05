def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.g = sys.argv [ 1 ]
        self.N = sys.argv [ 2 ]
    map = { }
    for char in str ( sys.stdin ) :
        map [ ord ( char ) - 1 ] += 1
    max = min = sys.maxint
    for char in map :
        max = max ( max , char )
        min = min ( min , char )
    print ( max , min )
