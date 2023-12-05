def import _dict_dict
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.read ( )
        t = sc.read ( )
        sc.close ( )
        dict_s = { }
        dict_t = { }
        cnt = 0
        for char_s , char_t in zip ( s , t ) :
            if char_s in dict_s :
                if char_t in dict_t :
                    if not dict_s [ char_s ] == dict_t [ char_t ] :
                        print ( 'No' )
                        return
                else :
                    print ( 'No' )
                    return
            else :
                if char_t in dict_t :
                    print ( 'No' )
                    return
                cnt += 1
                dict_s [ char_s ] = cnt
                dict_t [ char_t ] = cnt
        print ( 'Yes' )
