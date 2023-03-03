def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.k = int ( sys.stdin.readline ( ) )
        self.array = [ 0 ] * 100001
        for a , b in itertools.izip ( self.array , range ( 1 , 100000 ) ) :
            self.array [ a ] += b
    sum = 0
    for i in range ( 1 , 100000 ) :
        sum += self.array [ i ]
        if sum >= k :
            print ( i )
            break
