def _import ( ) :
    import os
    import random
    import math
    class LogSet :
        PROBLEM_NAME = "logset"
        WORK_DIR = r"D:\GCJ\\"+PROBLEM_NAME+" \ "
        class A :
            def __init__ ( self , num , cnt ) :
                self.num , self.cnt = cnt , 1
            def __init__ ( self , num , cnt ) :
                self.num , self.cnt = num , cnt
            def reduce ( self , A ) :
                if self.num == 0 :
                    ok = True
                    for i in A :
                        if self.cnt % 2 :
                            ok = False
                            break
                if not ok :
                    return None
                res = [ ]
                for i in A :
                    res.append ( ( i.num , i.cnt // 2 ) )
                return res
    def solve ( ) :
        sc = open ( WORK_DIR + "input.txt" , "w" )
        caseCnt = sc.read ( )
        for i in range ( len ( A ) ) :
            if A [ i ].cnt % 2 :
                ok = False
                break
        if not ok :
            return None
        res = [ ]
        num_to_cnt = { A [ i ].num : A [ i ].cnt for i in range ( len ( A ) ) }
        res_cnt = 0
        for i in range ( len ( A ) ) :
            want = num_to_cnt [ A [ i ].num ]
            if want == 0 :
                continue
            have = ( num_to_cnt [ A [ i ].num + abs ( num ) ] if num_to_cnt [ A [ i ].num ] > 0 else 0 )
            if have < want :
                return None
            res.append ( ( num if num > 0 else A [ i ].num + abs ( num ) , want ) )
            num_to_cnt [ A [ i ].num + abs ( num ) ] = have - want
        ret = [ ]
        for i in range ( len ( A ) ) :
            ret.append ( ( i , cnt ) )
        return ret
    return solve
