def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
    def __call__ ( self , * args ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( args [ i ] )
    def sum ( self ) :
        cost = 0
        ans = sum ( a )
        for i in range ( n ) :
            sum += a [ i ]
            if i % 2 == 0 :
                if sum <= 0 :
                    cost += - sum + 1
                    sum = 1
            else :
                if sum >= 0 :
                    cost += sum + 1
                    sum = - 1
        ans = min ( ans , cost )
        sum = 0
        cost = 0
        for i in range ( n ) :
            sum += a [ i ]
            if i % 2 == 0 :
                if sum >= 0 :
                    cost += sum + 1
                    sum = - 1
            else :
                if sum <= 0 :
                    cost += - sum + 1
                    sum = 1
        ans = min ( ans , cost )
        print ( ans )
