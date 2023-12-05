def import readline , solve
import readline
import sys
class A ( object ) :
    def __init__ ( self ) :
        self.readline ( )
    def readline ( self ) :
        while not self.readline ( ) or not self.readline ( ) :
            self.readline ( )
        return self.readline ( )
    def randint ( f , t ) :
        return int ( self.readline ( ) )
    def randint ( f , t ) :
        return int ( self.readline ( ) )
    def randint ( f , t ) :
        return int ( self.readline ( ) )
    def profit ( equal , f , t ) :
        l = f - 1
        r = t
        while l < r - 1 :
            to = ( l + r ) / 2
            get = 0
            for i in equal :
                get += to - a [ i ]
            for i in a [ equal : ] :
                if i <= to :
                    get += to + 1 - a [ i ]
            if get > b :
                r = to
            else :
                l = to
        if l == f - 1 :
            return 0
        profit = 0
        get = 0
        for i in equal :
            get += l - a [ i ]
            profit += 36.* ( l - a [ i ] ) / equal
        for i in a [ equal : ] :
            if i <= l :
                get += l + 1 - a [ i ]
        return - get + profit
    def solve ( ) :
        b = randint ( )
        n = randint ( 1 , 37 )
        a = [ randint ( 1 , 37 ) for i in range ( n ) ]
        ans = 0
        a.sort ( )
        for equal in range ( 1 , len ( a ) + 1 ) :
            for to_get in range ( equal , len ( a ) ) :
                ans = max ( ans , profit ( equal , a [ to_get ] , a [ to_get ] ) )
        return ans
