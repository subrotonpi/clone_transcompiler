def import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        s = [ ]
        nums = [ ]
        for line in sc.readlines ( ) :
            s.append ( line.split ( ) )
            nums.append ( [ int ( s [ 0 ] ) , int ( s [ 1 ] ) ] )
        self.max = 0
        for i in range ( N ) :
            for j in range ( N ) :
                n = 0
                a1 = ( nums [ i ] [ 0 ] - nums [ j ] [ 0 ] )
                a2 = ( nums [ i ] [ 1 ] - nums [ j ] [ 1 ] )
                if i == j :
                    pass
                else :
                    n = ( a1 * a1 ) + ( a2 * a2 )
                if n > self.max :
                    self.max = n
    print ( math.sqrt ( self.max ) )
