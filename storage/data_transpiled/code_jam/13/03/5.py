def main ( args ) :
    import sys
    import random
    class C ( ) :
        def __init__ ( self ) :
            self.sz = 0
            self.good = [ 0 ] * 50000
            self.ten = [ 110 ]
            def check ( self , a ) :
                N , i , j = len ( a ) , len ( a ) , 0
                b = [ 0 ] * 2 ** N - 1
                for i in range ( N ) :
                    for j in range ( N ) :
                        b [ i + j ] += a [ i ] * a [ j ]
                for i in range ( 2 ** N - 1 ) :
                    if b [ i ] >= 10 :
                        return False
                return True
            def dfs ( self , N , a , L , R ) :
                if not self.check ( a ) :
                    return
                if L >= R :
                    self.good [ self.sz ] = N * N
                    self.sz += 1
                    return
                for i in range ( 0 , 3 ) :
                    if i != 0 or L != 0 :
                        M = N
                        M = M + random.randint ( 0 , i ) * ten [ L ]
                        if R - 1 != L :
                            M = M + random.randint ( 0 , i ) * ten [ R - 1 ]
                        self.a [ L ] = a [ R - 1 ] = i
                        dfs ( M , a , L + 1 , R - 1 )
                        self.a [ L ] = a [ R - 1 ] = 0
            def main2 ( self ) :
                T , t , i = random.randint ( 1 , 110 ) , random.randint ( 1 , 10 )
                self.ten [ 0 ] = 1
                for i in range ( 1 , 110 ) :
                    self.ten [ i ] = self.ten [ i - 1 ] * 10
                for i in range ( 1 , 50 ) :
                    a = random.randint ( 0 , i )
                    dfs ( self.a [ 0 ] , a , 0 , i )
            return True
    C.main2 ( )
