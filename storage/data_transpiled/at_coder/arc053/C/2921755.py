def import _main
class Main ( object ) :
    def __init__ ( self , a , b ) :
        self.a = a
        self.b = b
        self.sub = a - b
    def main ( self ) :
        sc = _main ( self )
        N = sc.count ( )
        minus = PriorityQueue ( ( lambda x , y : x.a - y.a < 0 ) )
        plus = PriorityQueue ( ( lambda x , y : y.a - x.a < 0 ) )
        zeroa = 0
        for i in range ( N ) :
            a = sc.randint ( 0 , N )
            b = sc.randint ( 0 , N )
            if a == b :
                zeroa = max ( zeroa , a )
            elif a > b :
                plus.append ( ( a , b ) )
            else :
                minus.append ( ( a , b ) )
        ans = 0
        val = 0
        while not minus.empty ( ) :
            n = minus.pop ( )
            ans = max ( ans , val + n.a )
            val += n.sub
        ans = max ( ans , val + zeroa )
        max = 0
        pval = 0
        while not plus.empty ( ) :
            n = plus.pop ( )
            if pval + n.a > max :
                max = min ( pval + n.a , max ( max + n.sub ) )
            pval += n.sub
        print ( max ( ans , val + max ) )
