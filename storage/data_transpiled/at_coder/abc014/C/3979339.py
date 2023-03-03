def _import ( ) : return _import ( )
import sys
import struct
import sys
import sys
import struct
import sys
import sys
import struct
import sys
import struct
import random
import random
import sys
MAX_N = 1000002
def _import float
next ( ) :
    f = sys.stdout
    n = randint ( 0 , MAX_N )
    ab = [ ]
    for i in range ( n ) :
        ab [ randint ( 0 , MAX_N ) ] += 1
        ab [ randint ( 0 , MAX_N ) ] -= 1
    ans = ab [ 0 ]
    for i in range ( 1 , MAX_N ) :
        ab [ i ] += ab [ i - 1 ]
        ans = max ( ans , ab [ i ] )
    f.write ( ans )
    f.flush ( )
import sys
import os
import sys
buffer = bytearray ( sys.stdin.buffer )
ptr = 0
buflen = 0
def has_next_byte ( ) :
    if ptr < buflen :
        return True
    else :
        ptr = 0
        try :
            buflen = os.read ( sys.stdin.buffer [ ptr : ] , BUFFER_SIZE )
        except OSError :
            pass
        if buflen <= 0 :
            return False
    def is_printable_char ( c ) :
        return 33 <= c <= 126
    def _next ( ) :
        while has_next_byte ( ) and not is_printable_char ( buffer [ ptr ] ) :
            ptr += 1
        return has_next_byte ( )
    def _next ( ) :
        if not hasNext ( ) :
            raise StopIteration
        s = [ ]
        b = next ( )
        while is_printable_char ( b ) :
            s.append ( b )
            b = next ( )
        return s
    def _next ( ) :
        if not hasNext ( ) :
            raise StopIteration
        n = 0
        minus = False
        b = next ( )
        if b == '-' :
            minus = True
            b = next ( )
        if b == '' :
            return - n if minus else n
        else :
            raise StopIteration
