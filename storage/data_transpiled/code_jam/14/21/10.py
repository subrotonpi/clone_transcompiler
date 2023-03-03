def import _solve
class A ( object ) :
    def __init__ ( self , name ) :
        self.name = name
    def solve ( self ) :
        T = self.T
        for i in range ( 1 , T + 1 ) :
            print ( "Case #%d: %s\n" % ( i , self.name ) , end = "" )
    def solve ( self ) :
        N = self.N
        data = [ s.strip ( ) for s in self.data ]
        count = [ [ 0 ] * 101 for s in self.data ]
        pos = [ 0 ] * 101
        for i in range ( len ( data [ 0 ] ) ) :
            c = data [ 0 ] [ pos [ 0 ] ]
            for j in range ( N ) :
                if pos [ j ] >= len ( data [ j ] ) or data [ j ] [ pos [ j ] ] != c :
                    return "Fegla Won"
                while pos [ j ] < len ( data [ j ] ) and data [ j ] [ pos [ j ] ] == c :
                    pos [ j ] += 1
                    count [ j ] += 1
        for i in range ( N ) :
            if pos [ i ] != len ( data [ i ] ) :
                return "Fegla Won"
        ans = 0
        for i in range ( 0 , count [ 0 ] [ i ] ) :
            min = 1 << 30
            for j in range ( 1 , 100 ) :
                sum = 0
                for k in range ( N ) :
                    sum += abs ( count [ k ] [ i ] - j )
                min = min ( min , sum )
            ans += min
        return "%d" % ans
return A
