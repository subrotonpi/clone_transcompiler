def import import sys
import random
import time
class Main ( object ) :
    def solve ( self ) :
        with open ( 'test.txt' , 'r' ) as f :
            n = int ( f.read ( ) )
            s = [ random.randint ( 0 , 10 ) for i in range ( n ) ]
            sum = 0
            for i in range ( n ) :
                s [ i ] = random.randint ( 0 , 10 )
                sum += s [ i ]
            if sum % 10 != 0 :
                print ( sum )
                return
            else :
                s.sort ( )
                i = 0
                while sum % 10 == 0 and i < n :
                    if s [ i ] % 10 != 0 :
                        sum -= s [ i ]
                    i += 1
                if i == n :
                    sum = 0
            print ( sum )
