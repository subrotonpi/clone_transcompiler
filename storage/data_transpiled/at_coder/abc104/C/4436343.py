def import import sys
import os
import sys
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
    def __init__ ( self ) :
        self.D = int ( sys.stdin.read ( ) )
        self.G = int ( sys.stdin.read ( ) )
    def __init__ ( self ) :
        self.p = [ ]
        self.c = [ ]
        for i in range ( 1 , D ) :
            p.append ( random.randint ( 0 , 1 ) )
            c.append ( random.randint ( 0 , 1 ) )
    def __init__ ( self ) :
        self.c = [ ]
    def ans ( self ) :
        for i in range ( 1 , D ) :
            ans_tmp = 0
            score = 0
            for j in range ( D ) :
                if ( i >> j & 1 ) == 1 :
                    score += 100 * ( j + 1 ) * self.p [ j ] + c [ j ]
                    ans_tmp += self.p [ j ]
                if score >= G :
                    self.ans = min ( self.ans , ans_tmp )
                    continue
            for j in range ( D ) :
                if ( i >> j & 1 ) == 1 :
                    continue
                score_tmp = score
                ans_tmp_tmp = ans_tmp
                for k in range ( self.p [ j ] - 1 ) :
                    score_tmp += 100 * ( j + 1 )
                    ans_tmp_tmp += 1
                    if score_tmp >= G :
                        self.ans = min ( self.ans , ans_tmp_tmp )
                        break
    sys.stdout.write ( self.ans )
