def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.x = [ ]
        self.y = [ ]
    def __call__ ( self , x , y ) :
        self.N = len ( x )
        self.M = len ( y )
        self.x = x
        self.y = y
        if self.M == 0 :
            print ( 1 )
            return
        index = self.index
        a = list ( range ( self.N ) )
        print ( self.dfs ( index , a , 1 ) )
    def dfs ( self , index , a , depth ) :
        if depth == self.N + 1 :
            if self.is_friend ( a , index ) :
                return index
            else :
                return 2
        c1 = make_copy ( a )
        c2 = make_copy ( a )
        c2.append ( depth )
        return max ( self.dfs ( index , c1 , depth + 1 ) , self.dfs ( index + 1 , c2 , depth + 1 ) )
    def is_friend ( self , a , index ) :
        cnt = 0
        for i in range ( len ( x ) ) :
            for j in range ( index ) :
                if x [ i ] == a [ j ] :
                    for k in range ( index ) :
                        if y [ i ] == a [ k ] :
                            cnt += 1
        edge = 0
        for i in range ( 1 , self.index ) :
            edge += i
        if cnt == edge :
            return True
        else :
            return False
    def make_copy ( self ) :
        b = [ ]
        for i in range ( len ( a ) ) :
            b.append ( a [ i ] )
        return b
