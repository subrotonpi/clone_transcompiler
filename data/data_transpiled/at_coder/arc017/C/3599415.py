def import _main
import sys
import os
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        self.R , self.B , self.x , self.y = getopt.getopt ( self.R , self.B , self.x , self.y )
    def go ( self ) :
        sc = open ( self.x , self.y )
        n = sc.tell ( )
        X = sc.read ( )
        w = [ ]
        for i in range ( n ) :
            w.append ( sc.read ( ) )
        ans = help ( w , X )
        print ( ans )
    def help ( self , w , X ) :
        n = len ( w )
        if n == 1 :
            return w [ 0 ] == X
        ans = 0
        p = n // 2
        dic = self.get_dic ( [ w [ p : ] for p in range ( n ) ] )
        first = [ x for x in range ( p ) if x == X ]
        for i in range ( ( 1 << p ) ) :
            cur = self.get_sum ( first , i )
            ans += dic.get ( X - cur , 0 )
        return ans
    def get_sum ( a ) :
        q = len ( a )
        ans = { }
        for i in range ( ( 1 << q ) ) :
            cur = self.get_sum ( a , i )
            val = ans.get ( cur , 0 ) + 1
            ans [ cur ] = val
        return ans
    def get_sum ( a , mask ) :
        sum = 0
        for i in range ( len ( a ) ) :
            if mask & ( 1 << i ) : sum += a [ i ]
        return sum
