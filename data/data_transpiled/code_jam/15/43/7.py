def import _solve
import os
import sys
import os
import sys
class Bilingual ( object ) :
    PROBLEM_NAME = "bilingual"
    WORK_DIR = r"D:\GCJ\"+PROBLEM_NAME+" \ ""
    def solve ( self , sc , file ) :
        N = len ( sc )
        sc.readline ( )
        words = [ ]
        for line in sc.readline ( ).split ( ) :
            words.append ( line.split ( ) )
        id = { }
        cnt = 0
        w = [ ]
        for word in words :
            w.append ( [ ] )
            for i in range ( len ( word ) ) :
                if word not in id :
                    id [ word ] = cnt
                    cnt += 1
                w [ word ].append ( id [ word ] )
        ans = cnt
        for mask in range ( 2 , ( 1 << N ) , 4 ) :
            english = [ False ] * cnt
            french = [ False ] * cnt
            for i in range ( N ) :
                if mask & ( 1 << i ) :
                    for j in range ( len ( w [ i ] ) ) :
                        english [ w [ i ] [ j ] ] = True
                else :
                    for j in range ( len ( words [ i ] ) ) :
                        french [ w [ i ] [ j ] ] = True
            tmp = 0
            for i in range ( cnt ) :
                if english [ i ] and french [ i ] :
                    tmp += 1
            ans = min ( ans , tmp )
        return ans
