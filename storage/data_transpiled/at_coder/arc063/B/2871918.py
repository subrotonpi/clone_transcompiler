def import _hash_map
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.name = sys.argv [ 0 ]
    def main ( self ) :
        with open ( self.name , 'r' ) as f :
            for n , t in enumerate ( f ) :
                a = [ ]
                for i in range ( n ) :
                    a.append ( f.read ( n ) )
                max_diff = min = float ( 'inf' )
                for i in range ( n ) :
                    if i != 0 :
                        max_diff = max ( max_diff , a [ i ] - min )
                    min = min ( min , a [ i ] )
                ans = 0
                cnt = { }
                for i in range ( n ) :
                    target = a [ i ] - max_diff
                    if target in cnt :
                        ans += cnt [ target ]
                    tmp_cnt = cnt.get ( a [ i ] )
                    if tmp_cnt is None :
                        tmp_cnt = None
                    tmp_cnt += 1
                    cnt [ a [ i ] ] = tmp_cnt
                print ( ans )
