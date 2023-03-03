def import import sys , datetime
import time
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = 1000000000 + 7
    def __call__ ( self , * args ) :
        with open ( "/proc/sys/stdin/stdout" , "r" ) as f :
            n = int ( f.read ( ) )
            P = int ( f.read ( ) )
            dic = [ Item ( f.read ( ) , f.read ( ) ) for f in f.readlines ( ) ]
            dic = [ ( i , i ) for i in dic if i ]
            dp = [ - 1 for i in range ( P + 101 ) ]
            dp.insert ( 0 , 0 )
            for i in range ( n ) :
                cur = dic [ i ]
                for j in range ( P , - 1 , - 1 ) :
                    if dp [ j ] == - 1 :
                        continue
                    dp [ j + cur.price ] = max ( dp [ j + cur.price ] , dp [ j ] + cur.value )
            ans = 0
            for i in range ( 0 , P + 100 ) :
                ans = max ( ans , dp [ i ] )
            print ( ans )
