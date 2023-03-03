def contest ( ) :
    import os
    import random
    import sys
    import math
    class GoodLuckLarge ( ) :
        PROBLEM_NAME = "GLLarge"
        WORK_DIR = r"D:\Gcj\\"+PROBLEM_NAME+" \ \"
        def __init__ ( self , r , answers , max_prob ) :
            for pos , cand in answers :
                for key in cand + [ "" ] :
                    cnt = ( key in self.mp )
                    if cnt == 0 :
                        self.max_prob = - 1e100
                        break
                else :
                    self.max_prob = cnt
            self.ans = cand
        self.states = 0
        def fact ( n ) :
            return n or 1
        def go ( self , pos , what ) :
            if pos == self.N :
                self.states += 1
                if self.states % 100 == 0 :
                    print ( self.states )
                key = ""
                for i in range ( self.N ) :
                    key += self.A [ i ]
                self.answers.append ( key )
                cnt = 1
                for x in range ( 2 , self.M + 1 ) :
                    tt = 0
                    for i in range ( self.N ) :
                        if self.A [ i ] == x :
                            tt += 1
                        cnt *= self.fact ( tt )
                cnt = self.fact ( self.N ) / cnt
                self.answer_cnt.append ( cnt )
                key += ""
                for mask in range ( ( 1 , self.N ) ) :
                    prod = 1
                    for i in range ( self.N ) :
                        if mask & ( 1 << i ) :
                            prod *= self.A [ i ]
                    key2 = key + prod
                    if not self.mp.has_key ( key2 ) :
                        self.mp [ key2 ] = 0
                    self.mp [ key2 ] = self.mp [ key2 ] + 1
                return
            for A in what : go ( pos + 1 , A )
