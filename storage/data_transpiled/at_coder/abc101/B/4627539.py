def import _readline
from sys import stdin , stdout
from sys import stderr
from random import randint
from sys import maxsize
from sys import stdin , stdout
from sys import stdin , stderr
from sys import stdout
from sys import stderr
from sys import stdin , stdout
from sys import stdin , stderr
from random import randint
from sys import maxsize
from random import random
from sys import maxsize
from sys import stdin , stdout
from sys import stdout
from sys import stderr
from sys import stdin , stderr
from random import randint
from random import random
from sys import maxsize
from random import random
from sys import stdin , stdout
from random import random
from random import random
from sys import maxsize
from random import random
class BDigitSums ( ) :
    def solve ( self , test_number , stdin , stdout ) :
        N = stdin.randint ( 0 , 10 )
        S = 0
        num = N
        while num > 0 :
            S += num % 10
            num /= 10
        if N % S == 0 :
            stdout.write ( 'Yes' )
        else :
            stdout.write ( 'No' )
class FastScanner ( object ) :
    def __init__ ( self , stream = stdin , ** kwargs ) :
        self.stream = stream
        self.stream.seek ( 0 )
        self.ptr = 0
        self.buflen = 0
        def readline ( self ) :
            self.stream.seek ( 0 )
            return self.stream.read ( self.ptr )
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = self.stream.read ( self.buflen )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
                return True
        def readline ( self ) :
            if not self.stream.read ( self.ptr ) :
                raise EOFError
            n = 0
            minus = False
            b = self.readByte ( )
            if b == '-' :
                minus = True
                b = self.readByte ( )
            if b < '0' or b > '9' :
                raise ValueError
            while True :
                if not b in self.stream.read ( ) :