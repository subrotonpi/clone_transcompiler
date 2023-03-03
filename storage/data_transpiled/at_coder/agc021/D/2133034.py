def import import input_stream
from os import sys
from os import urandom
from io import BytesIO
from os import urandom
from random import randint
from os import urandom
from os import urandom
from os import urandom
from io import BytesIO
from os import urandom
from os import urandom
from os import urandom
from random import randint
from os import urandom
from os import urandom
from os import urandom
from os import urandom
from os import urandom
from os import urandom
from random import randint
from os import urandom
from os import urandom
from os import urandom
from os import urandom
from os import urandom
from os import urandom
from os import urandom
from os import urandom
from time import time as time
from random import randint
class Main ( object ) :
    def __init__ ( self ) :
        from os import urandom
        from os import urandom
        from os import urandom
        from os import urandom
        from os import urandom
        from os import urandom
        from os import urandom
        from os import urandom
        from random import randint
        from os import urandom
        from os import urandom
        from os import urandom
        from os import urandom
        from os import urandom
        from os import urandom
        from os import urandom
        from os.urandom
        from os import urandom
        from random import randint
        from time import sleep
        def solve ( self , test_number , f , s ) :
            T = urandom ( test_number )
            N = len ( T )
            K = randint ( 1 , K )
            dp = [ [ 0 for i in range ( N ) ] for j in range ( K ) ]
            for right in range ( 0 , N ) :
                for left in range ( right , - 1 , - 1 ) :
                    if left == right :
                        dp [ left ] [ right ] [ 0 ] = 1
                    else :
                        for k in range ( 0 , K ) :
                            dp [ left ] [ right ] [ k ] = max ( dp [ left + 1 ] [ right ] [ k ] , dp [ left ] [ right - 1 ] [ k ] )
                            if T [ left ] == T [ right ] :
                                dp [ left ] [ right ] [ k ] = max ( dp [ left ] [ right ] [ k ] , 2 + dp [ left + 1 ] [ right - 1 ] [ k ] )
                        elif k > 0 :
                            dp [ left ] [ right