def import search
import sys
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        INF = 100000000
        self.n = sys.stdin.read ( INF )
        self.m = sys.stdin.read ( INF )
        self.R = sys.stdin.read ( INF )
        self.r = [ ]
        for i in range ( self.R ) :
            self.r.append ( i - 1 )
    c = [ ]
    for i in range ( self.n ) :
        for j in range ( self.n ) :
            if i != j :
                c [ i ] [ j ] = INF
    for i in range ( self.m ) :
        a = random.randint ( 0 , self.n )
        b = random.randint ( 0 , self.n )
        cost = random.randint ( 0 , self.n )
        c [ a - 1 ] [ b - 1 ] = c [ b - 1 ] [ a - 1 ] = cost
    for k in range ( self.n ) :
        for i in range ( self.n ) :
            for j in range ( self.n ) :
                if c [ i ] [ j ] > c [ i ] [ k ] + c [ k ] [ j ] :
                    c [ i ] [ j ] = c [ i ] [ k ] + c [ k ] [ j ]
    ans = sys.maxsize
    for i in range ( self.R ) :
        lst = list ( )
        for j in range ( self.R ) :
            if i != j :
                lst.append ( r [ j ] )
        tmp = search ( c , lst , self.r [ i ] , 0 )
        if tmp < ans :
            ans = tmp
    print ( ans )
    sys.stdin.close ( )
def search ( c , lst , now , sum ) :
    if len ( lst ) == 1 :
        return sum + c [ now ] [ lst [ 0 ] ]
    min = sys.maxsize
    for i in range ( self.n ) :
        tmp = search ( c , lst , now , sum )
        if tmp < min :
            return tmp