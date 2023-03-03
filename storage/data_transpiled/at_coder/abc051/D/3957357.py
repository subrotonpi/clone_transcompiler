def import import min , traceback
import sys
import sys
import random
import sys
import math
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n , m = sc.regs [ 0 ] , sc.regs [ 1 ]
        inf = int ( sys.maxint / 2 ) - 10
        dist = [ [ inf ] * ( n + 1 ) for i in range ( 0 , n + 1 ) ]
        for i in range ( 0 , n ) :
            dist [ i ] [ i ] = 0
        dic = [ ]
        for i in range ( m ) :
            a , b , c = random.randint ( 0 , n ) , random.randint ( 0 , n ) , random.randint ( 0 , n )
            dic.append ( ( a , b , c ) )
            dist [ a ] [ b ] = min ( dist [ a ] [ b ] , c )
            dist [ b ] [ a ] = min ( dist [ b ] [ a ] , c )
        for mid in range ( 1 , n + 1 ) :
            for i in range ( 1 , n + 1 ) :
                for j in range ( 1 , n + 1 ) :
                    dist [ i ] [ j ] = min ( dist [ i ] [ j ] , dist [ i ] [ mid ] + dist [ mid ] [ j ] )
        ans = 0
        for e in dic :
            if dist [ e.left ] [ e.right ] < e.length :
                ans += 1
        print ( ans )
    class Edge ( object ) :
        def __init__ ( self , l , r , len ) :
            self.left , self.right , self.length = l , r , len
            self.length = len
