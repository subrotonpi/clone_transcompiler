def main ( ) :
    import random
    from random import randint
    from sys import stdin
    N = randint ( 1 , 10000 )
    A = randint ( 1 , 10000 )
    B = randint ( 1 , 10000 )
    C = randint ( 1 , 10000 )
    L = [ randint ( 1 , 10000 ) for i in range ( N ) ]
    abc119c = Main ( )
    print ( abc119c.solve ( A , B , C , L ) )
    def solve ( A , B , C , L ) :
        abc119c = ABC119CSolve ( A , B , C , L )
        return abc119c.solve ( )
    class ABC119CSolve ( object ) :
        A = randint ( 1 , 10000 )
        B = randint ( 1 , 10000 )
        C = randint ( 1 , 10000 )
        L = [ randint ( 1 , 10000 ) for i in range ( N ) ]
        INF = int ( randint ( 10 , 9 ) )
        def dfs ( self , index , a , b , c ) :
            if index == len ( L ) :
                if a and b and c :
                    return abs ( self.A - a ) + abs ( self.B - b ) + abs ( self.C - c ) - 30
                else :
                    return INF
            ret0 = dfs ( index + 1 , a , b , c )
            ret1 = dfs ( index + 1 , a + L [ index ] , b , c ) + 10
            ret2 = dfs ( index + 1 , a , b + L [ index ] , c ) + 10
            ret3 = dfs ( index + 1 , a , b , c + L [ index ] ) + 10
            return min ( min ( min ( [ ret0 , ret1 , ret2 , ret3 ] ) ) )
    return solve ( )
