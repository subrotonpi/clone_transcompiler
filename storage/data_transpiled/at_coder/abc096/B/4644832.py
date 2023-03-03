def import _readline
from sys import stdin , stdout
from sys import stderr
from os import urandom
from random import randint
from random import randint
from sys import maxsize
from random import random
from sys import random
from sys import stdin , stdout , stderr
from os import urandom
from os import urandom
from random import random
from sys import maxsize
from os import urandom
from random import random
from sys import random
from os import urandom
from random import randint
from random import random
from sys import stdin , stdout , stderr
from os import urandom
from os import urandom
from random import random
from os import urandom
from random import randint
from random import random
from os import urandom
from os import urandom
from random import randint
from random import random
from os import urandom
from os import urandom
from os import urandom
from os import urandom
from random import randint
from random import random
class BMaximumSum :
    def solve ( self , test_number , fast = 0 , stream = stdout ) :
        A , B , C , K = [ randint ( 0 , random ( ) * 2 ** 32 ) for _ in range ( test_number ) ]
        max = max ( A , max ( B , C ) )
        D = max
        for _ in range ( K ) :
            D *= 2
        stream = urandom ( A + B + C + D - max )
class FastScanner ( object ) :
    def __init__ ( self ) :
        self.stream = sys.stdin
        self.buffer = b''
        self.ptr = 0
        self.buflen = 0
        def has_next_byte ( ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = self.stream.read ( self.buflen )
                except AttributeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def readByte ( self ) :
            if self.ptr < self.buflen :
                return self.ptr
            else :
                return - 1
        def isPrintableChar ( c ) :
            return 33 <= c <= 126
        def __iter__ ( self ) :
            for i in range ( self.ptr ) :
                yield i
