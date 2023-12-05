def import _main
import sys
import string
import string
import sys
import string
import sys
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N , cnt = 0 , 0
        with open ( sys.argv [ 1 ] ) as f :
            numbers = [ int ( i ) for i in f.read ( ).split ( ) ]
    def sort ( self ) :
        max = 0
        for num in numbers :
            if max < num :
                max = num
                cnt += 1
        print ( cnt )
