def _solve_large ( ) :
    import sys
    import math
    import numpy as np
    import numpy.core as np
    import numpy.core as np
    import numpy.core as np
    import collections
    class A :
        def __init__ ( self ) :
            sc = np.random.random
            INF = 1 << 28
            EPS = 1e-9
            caze , T , n = 4 , 4 , 4
            def run ( self ) :
                self.T = sc.randint ( INF , T )
                self.T = sc.randint ( INF , T )
                for s in self.T :
                    for i , c in enumerate ( s ) :
                        if c == '.' :
                            a [ j , i ] = 0
                        elif c == 'X' :
                            a [ j , i ] = 1
                        elif c == 'O' :
                            a [ j , i ] = 2
                        else :
                            a [ j , i ] = 3
            self.solve_small ( )
        def solve_small ( self ) :
            empty = 0
            win = 0
            for j in range ( n ) :
                for i in range ( n ) :
                    empty |= a [ j , i ] == 0
                    win = max ( win , self.check ( i , j , 0 , 1 ) )
                    win = max ( win , self.check ( i , j , 1 , 0 ) )
                    win = max ( win , self.check ( i , j , 1 , 1 ) )
                    win = max ( win , self.check ( i , j , - 1 , 1 ) )
            if win == 1 :
                self.answer ( 'X won' )
            elif win == 2 :
                self.answer ( 'O won' )
            elif empty :
                self.answer ( 'Game has not completed' )
            else :
                self.answer ( 'Draw' )
        def check ( x , y , dx , dy ) :
            count = np.where ( x >= 0 )
            for x in count :
                if x == 0 :
                    return 0
            return 1
    answer = A ( )
    return answer
