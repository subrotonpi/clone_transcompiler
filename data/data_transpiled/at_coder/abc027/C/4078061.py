def _ ( ) : return
import sys
import random
import time
import math
import random
import time
import sys
import random
import time
import sys
import time
import random
import sys
import struct
class Main ( ) :
    def __init__ ( self ) :
        Scanner ( )
        a = [ ]
        for i in range ( 61 ) :
            a.append ( power ( 2 , i ) )
        n = random.randint ( 0 , a.size )
        exponent = 0
        while n / a [ exponent ] > 0 :
            exponent += 1
        exponent -= 1
        count = 0
        t = 1
        while t <= n :
            if exponent % 2 == 1 :
                if count % 2 == 0 :
                    t = right ( t )
                else :
                    t = left ( t )
            else :
                if count % 2 == 0 :
                    t = left ( t )
                else :
                    t = right ( t )
            count += 1
        ans = [ 'Aoki' , 'Takahashi' ]
        out.write ( ans [ ( count + 1 ) % 2 ] )
    def power ( x , n ) :
        if n == 0 : return 1
        if n % 2 == 0 :
            e = power ( x , n // 2 )
            return ( e ** 2 )
        e = ( x * power ( x , n - 1 ) )
        return e
    def right ( a ) : return a * 2
    def left ( a ) : return a * 2 + 1
