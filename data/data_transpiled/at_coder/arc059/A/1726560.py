def import sys
class Main ( object ) :
    def solve ( self ) :
        n = len ( self.args )
        a = [ ]
        t = 0
        f = True
        for i in range ( n ) :
            a.append ( self.args [ i ] )
            if i == 0 :
                t = a [ i ]
            if f and t != a [ i ] :
                f = False
        if f :
            print ( 0 )
            return
        ans = sys.maxint
        for i in range ( - 100 , 100 + 1 ) :
            sum = 0
            for j in a :
                sum += pow ( j - i , 2 )
            ans = min ( ans , sum )
        print ( ans )
