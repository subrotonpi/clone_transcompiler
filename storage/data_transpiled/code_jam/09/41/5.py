def import import _reader
import sys
import os
import sys
class CrazyRows ( _reader ) :
    def do_main ( self ) :
        with open ( 'input.txt' , 'r' ) as sc :
            with open ( 'output.txt' , 'w' ) as f :
                self.case_cnt = sc.count ( )
                for case_num in range ( 1 , case_cnt + 1 ) :
                    print ( 'solving case ' , case_num )
                    N = sc.count ( )
                    a = [ ]
                    for s in sc :
                        for i in range ( N ) :
                            a.append ( [ s ] )
                res = 0
                for i in range ( N ) :
                    last = - 1
                    for j in range ( N ) :
                        if a [ i ] [ j ] == '1' : last = j
                    if last <= i : continue
                    chng = - 1
                    for k in range ( N - 1 , i - 1 , - 1 ) :
                        last1 = - 1
                        for j in range ( N ) :
                            if a [ k ] [ j ] == '1' : last1 = j
                        if last1 <= i : chng = k
                    res += ( chng - i )
                    for j in range ( N ) :
                        tmp = a [ chng ] [ j ]
                        for k in range ( chng , i , - 1 ) :
                            a [ k ] [ j ] = a [ k - 1 ] [ j ]
                        a [ i ] [ j ] = tmp
            f.write ( 'Case #%d: %d\n' % ( case_num , res ) )
