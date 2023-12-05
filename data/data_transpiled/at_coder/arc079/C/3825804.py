def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
    def __call__ ( self , * args ) :
        sc = open ( "/proc/" , "r" )
        self.n = sc.n
        a = [ sc.read ( ) for i in range ( n ) ]
        sc.close ( )
        ans = 0
        for i in range ( n ) :
            min = max ( n , [ min ] )
            div = ( a [ i ] - min ) / ( n + 1 )
            ans += div
            a [ i ] -= div * n
            for j in range ( n ) :
                if i == j :
                    continue
                a [ j ] += div
        min = [ min ]
        if min >= n :
            ans += ( min - n + 1 ) * n
            for i in range ( n ) :
                a [ i ] -= ( min - n + 1 )
        while 1 :
            maxpos = 0
            max = sys.maxint
            for i in range ( n ) :
                if a [ i ] > max :
                    max = a [ i ]
                    maxpos = i
            if max < n :
                break
            ans += 1
            a [ maxpos ] -= n
            for i in range ( n ) :
                if i == maxpos :
                    continue
                a [ i ] += 1
        print ( ans )
