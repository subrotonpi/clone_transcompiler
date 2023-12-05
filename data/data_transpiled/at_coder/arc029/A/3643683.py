def import sys , depth
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
    def __call__ ( self , depth , t , p1 , p2 ) :
        with open ( "/proc/" + str ( depth ) + ".txt" , "r" ) as sc :
            self.N = int ( sc.read ( ) )
        t = ""
        for i in range ( self.N ) :
            tmp = sc.read ( )
            t += str ( tmp )
            if i != self.N - 1 :
                t += ":"
        p1 = "0"
        p2 = "0"
        print ( self.dfs ( 0 , t , p1 , p2 ) )
    def dfs ( self , depth , t , p1 , p2 ) :
        if depth == self.N :
            sum1 = sum2 = 0
            p1_ary = p1.split ( ":" )
            p2_ary = p2.split ( ":" )
            for i in range ( len ( p1_ary ) ) :
                sum1 += int ( p1_ary [ i ] )
            for i in range ( len ( p2_ary ) ) :
                sum2 += int ( p2_ary [ i ] )
            return max ( sum1 , sum2 )
        t_ary = t.split ( ":" )
        add = t_ary [ 0 ]
        t_new = ""
        for i in range ( 1 , len ( t_ary ) ) :
            t_new += t_ary [ i ]
            if i != len ( t_ary ) - 1 :
                t_new += ":"
        return min ( self.dfs ( self.depth + 1 , t_new , p1 + ":" + add , p2 ) , self.dfs ( self.depth + 1 , t_new , p1 , p2 + ":" + add ) )
