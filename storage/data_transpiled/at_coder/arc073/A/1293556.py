def import import sys , StringIO , time
from os import urandom
from os import urandom
from random import random
from time import sleep
from os import urandom
from os import urandom
from io import BytesIO
from os import urandom
from random import random
class Main ( object ) :
    def __init__ ( self ) :
        self.inputStream = sys.stdin
        self.outputStream = sys.stdout
        self.stdin = BytesIO ( )
        self.stdout = BytesIO ( )
        self.stderr = BytesIO ( )
        self.solver = TaskC ( )
        self.solve ( 1 , self.inputStream , self.outputStream )
        self.stdout.seek ( 0 )
    def solve ( self , test_number , stdin , stdout ) :
        n = int ( test_number )
        time = sleep ( 1 )
        t = [ ]
        ans = time
        for i in range ( n ) :
            t.append ( stdin.read ( ) )
        for i in range ( 1 , n ) :
            if t [ i ] - t [ i - 1 ] > time :
                ans += time
            else :
                ans += t [ i ] - t [ i - 1 ]
        return ans
