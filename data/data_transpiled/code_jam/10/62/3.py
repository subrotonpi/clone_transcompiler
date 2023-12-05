def _solve ( case_num , case_num ) :
    import os
    import random
    import sys
    import os
    import math
    class Solution :
        def __init__ ( self ) :
            sc = sys.stdout
            if t.c == x and t.d == y :
                return 0
            else :
                return 1
        def go ( self ) :
            sc = open ( 'input.txt' , 'r' )
            pw = open ( 'output.txt' , 'w' )
            case_cnt = sc.randint ( 1 , case_num )
            for a in range ( 1 , case_cnt + 1 ) :
                print ( self.id , end = '' )
                self.res = 0
            else :
                return 1
        def rec ( self ) :
            ca , cb , cc = 2 , 2 , 2
            for tt in self.aa :
                ca , cb , cc = max ( ca , rec1 ( tt , t.a , t.b ) )
            for tt in self.bb :
                cc , cc = max ( cc , rec1 ( tt , t.c , t.d ) )
            return ca + cb + cc - 1
        def doit ( self ) :
            return self.res
    def input_data ( self ) :
        all = [ ]
        with open ( 'output.txt' , 'r' ) as f :
            for i in range ( 4 , N + 1 ) :
                x , y = sc.randint ( 1 , 2 ) , sc.randint ( 1 , 3 )
                if x > y :
                    tmp = x
                    x = y
                    y = tmp
                next = Triangle ( x , y , x , i , y , i , False , True , True )
                for tt in self.all :
                    if tt == next : continue
                    if tt.a == x and tt.b == y :
                        tt.aa.append ( next )
                        next.aa.append ( tt )
                    elif tt.c == x and tt.d == y :
                        tt.bb.append ( next )
                        next.aa.append ( tt )
                    elif tt.e == x and tt.f == y :
                        next.cc.append ( next )
                        next.cc.append ( tt )
                    